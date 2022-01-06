package in.rahulit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WishController {
	
	@GetMapping("/welcome")
	public String welcomeMsg(@RequestParam("name") String name, Model model) {
		
		String msgTxt = "Hi "+name+", Welcome to AshokIT...";
		
		model.addAttribute("msg", msgTxt);
		
		return "index";
		
	}

}
