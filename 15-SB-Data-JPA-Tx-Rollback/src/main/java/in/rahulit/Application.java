package in.rahulit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.rahulit.service.EmpoyeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmpoyeeService service = context.getBean(EmpoyeeService.class);
		service.saveData();
		context.close();
	}

}
