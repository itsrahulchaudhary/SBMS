package in.rahulit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.rahulit.binding.Student;
import in.rahulit.entity.service.StudentService;
@Controller
public class StudentController {

	@Autowired
	private StudentService service;
	
	@GetMapping("/student")
	public String loadForm(Model model) {
		System.out.println("aaaaaaaaaaaaaa");
		
 //    	List<String> gendersA = service.getGenders();
//		List<String> courses = service.getCourses();
//		List<String> timings = service.getTimings();
		
		model.addAttribute("genders", service.getGenders());
		model.addAttribute("courses", service.getCourses());
		model.addAttribute("timings", service.getTimings());
		 
		
		model.addAttribute("student", new Student());

		return "studentReg";
		
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(Student student , Model model) {
		System.out.println(student);
		service.saveStudent(student);
		return "regSuccess";
	}
}
