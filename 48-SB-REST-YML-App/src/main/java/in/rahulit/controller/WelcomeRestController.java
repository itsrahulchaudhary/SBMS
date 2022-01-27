package in.rahulit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.rahulit.props.AppProperties;

@RestController
public class WelcomeRestController {
	
	@Autowired
	AppProperties properties;
	
	@Value("${messages.welcomeMsg}")
	private String welcomeMsg;
	
    @GetMapping("/welcome")
	public String getWelcomeMsg() {
		return welcomeMsg;
	}
    
    @GetMapping("/welcomeProps")
	public String getDataFromPropertiesFile1() {
		Map<String, String> messages = properties.getMessages();
		String msg = messages.get("welcomeMsg");
		return msg;
	}
    
    @GetMapping("/greetProps")
	public String getDataFromPropertiesFile2() {
		Map<String, String> messages = properties.getMessages();
		String msg = messages.get("greetMsg");
		return msg;
    }
}
