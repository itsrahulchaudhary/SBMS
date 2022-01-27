package in.rahulit.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.rahulit.entity.Student;
import in.rahulit.repository.StudentRepository;

@RestController
public class StudentRestController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping(value="/student", consumes= {"application/json", "application/xml"})
	public ResponseEntity<String> addStudent(@RequestBody Student student){
		String msg =null;
		Student save = studentRepository.save(student);
		if(save.getSid() != null) {
			msg= "Student saved...";
		}else {
			msg= "Student Not saved...";
		}
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}
	
	@GetMapping(value="/student/{sid}", produces= {"application/json", "application/xml"})
	public ResponseEntity<Student> getStudentById(@PathVariable Integer sid){
		Optional<Student> findById = studentRepository.findById(sid);
		if(findById.isPresent()) {
			Student student = findById.get();
			return new ResponseEntity<Student>(student, HttpStatus.CREATED);
		}
		return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping(value="/student", produces= {"application/json", "application/xml"})
	public ResponseEntity<List<Student>> getStudentByAge(@RequestParam Integer sage){
		List<Student> findBySageGreaterThanEqual = studentRepository.findBySageGreaterThanEqual(sage);
		return new ResponseEntity<>(findBySageGreaterThanEqual, HttpStatus.CREATED);
	}

}
