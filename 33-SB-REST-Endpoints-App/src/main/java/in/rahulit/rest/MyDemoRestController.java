package in.rahulit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
public class MyDemoRestController {

	@GetMapping("/welcome")
	public ResponseEntity<String> welcomeMsg() {
		String msg = "(Demo) : Welcome to Java World...";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	@GetMapping("/greet")
	public ResponseEntity<String> greetMsg() {
		String msg = "(Demo) : Good Morning ...!!!";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
