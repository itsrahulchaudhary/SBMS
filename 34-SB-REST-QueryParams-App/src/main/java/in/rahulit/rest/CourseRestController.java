package in.rahulit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {

	@GetMapping("/course")
	public ResponseEntity<String> getcourseDtls(@RequestParam("name") String name) {
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
