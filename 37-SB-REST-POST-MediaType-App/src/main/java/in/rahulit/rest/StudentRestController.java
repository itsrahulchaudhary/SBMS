package in.rahulit.rest;
 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.rahulit.request.Student;

@RestController
public class StudentRestController {

	@PostMapping(value = { "/add-student" }, consumes = { "application/json", "application/xml" })
	public ResponseEntity<String> addStudent(@RequestBody Student student) {
		System.out.println(student);

		// logic to insert in DB
		String msg = "student saved";
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}

}
