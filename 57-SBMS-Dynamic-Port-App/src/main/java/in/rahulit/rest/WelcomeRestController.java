package in.rahulit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@Autowired
	private Environment env;

	@GetMapping("/welcome")
	public String welcomeMsg() {
		String portNumber = env.getProperty("server.port");
		String msg = "Welcome to MyApp";
		String response = msg + " Request Processed By Server Running on Port :: " + portNumber;
		return response;
	}

}
