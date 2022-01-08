package in.rahulit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

	@GetMapping("/welcome")
	public String welcomeMsg() {
		logger.info("welcomeMsg() execution started");
		String msg = "Welcome to Java's World";
		logger.info("welcomeMsg() execution ended");
		return msg;
	}
}
