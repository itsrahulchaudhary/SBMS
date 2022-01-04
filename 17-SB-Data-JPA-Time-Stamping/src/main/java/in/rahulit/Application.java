package in.rahulit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.rahulit.service.InsurenceService;

 

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		InsurenceService service = context.getBean(InsurenceService.class);
		service.savePlan();
		context.close();
	}

}
