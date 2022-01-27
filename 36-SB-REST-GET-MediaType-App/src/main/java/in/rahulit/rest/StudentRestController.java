package in.rahulit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonAlias;

import in.rahulit.response.Student;
import in.rahulit.student.StudentService;

@RestController
public class StudentRestController {

	@Autowired
	StudentService studentService;

	@GetMapping(value= {"/student"}, produces = {"application/json", "application/xml"})
	public ResponseEntity<Student> getStudent() {
		Student student = studentService.getStudent();
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}

	@GetMapping("/course/{name}/{mode}")
	public ResponseEntity<String> getcourseDtls(@PathVariable String name, @PathVariable String mode) {
		System.out.println(name);
		System.out.println(mode);

		String msg = null;
		if ("SBMS".equals(name)) {
			msg = name + " will start in october 2nd week";
		} else if ("JRTP".equals(name)) {
			msg = name + " will start in october 4th week";
		} else {
			msg = "Please contact admin for more details on " + name;
		}

		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

}
