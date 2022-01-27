package in.rahulit.student;

import org.springframework.stereotype.Service;

import in.rahulit.response.Student;

@Service
public class StudentService {
	
	public Student getStudent() {
		Student student = new Student(101, "Rahul", "rahul@gmail.com");
		return student;
	}

}
