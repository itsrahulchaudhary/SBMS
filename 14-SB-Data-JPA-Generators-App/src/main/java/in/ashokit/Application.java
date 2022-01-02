package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Student;
import in.ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		StudentRepository userRepository = context.getBean(StudentRepository.class);
		Student stu = new Student();
		stu.setStudentName("Raju");
		stu.setStudentEmail("raju1232gmail.com");
		stu.setStudentRank("1st");
		userRepository.save(stu);

	}

}
