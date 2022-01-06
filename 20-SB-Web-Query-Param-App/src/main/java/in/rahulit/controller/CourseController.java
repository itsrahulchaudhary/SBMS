package in.rahulit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseController {
	
	@GetMapping("/cource")
	public String courceDetails(@RequestParam String cname, @RequestParam String tname, Model model) {
		
		String msgTxt ="";
		
		if(cname.equals("SBMS") && tname.equals("Ashok")) {
			msgTxt = cname+" By "+tname+" starting from 20-Aug-2021 @6:30 AM";
		}else {
			msgTxt = "Please vist to website....";
		}
		
		model.addAttribute("msg", msgTxt);
		
		return "index";
	}

}
