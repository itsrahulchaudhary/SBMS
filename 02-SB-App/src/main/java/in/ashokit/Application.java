package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.ashokit.util.Car;

@SpringBootApplication
@ComponentScan(basePackages = { "com.ashokit", "in.ashokit" })
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		context.close();
	}

	@Bean
	public Car getCarInstance() {
		Car car = new Car();
		// logic to customization
		return car;
	}
}