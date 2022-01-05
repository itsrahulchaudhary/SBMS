package in.rahulit.rest;

import java.util.StringJoiner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.rahulit.client.WelcomeServiceClient;

@RestController
public class GreetRestController {
	@Autowired
	private WelcomeServiceClient welcomeServiceClient;

	@GetMapping("/greet")
	public String getGreetMsg() {
		String greetResponse = "Good Morning !!!";
		String welcomeResp = welcomeServiceClient.invokeWelcomeService();

		StringJoiner joiner = new StringJoiner(",");
		joiner.add(greetResponse);
		joiner.add(welcomeResp);

		return joiner.toString();
	}
}
