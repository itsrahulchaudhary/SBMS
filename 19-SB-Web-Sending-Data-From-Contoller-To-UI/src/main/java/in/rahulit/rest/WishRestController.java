package in.rahulit.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WishRestController {

	@GetMapping("/welcome")
	public ModelAndView welcomeMsg() {
		String welcomeMsgTxt = "Working with Spring Boot";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", welcomeMsgTxt);
		mav.setViewName("index");
		return mav;
	}

	@GetMapping("/greet")
	public String greetMsg(Model model) {
		String greetMsgTxt = "Good Morning";
		model.addAttribute("msg", greetMsgTxt);
		return "index";
	}

}
