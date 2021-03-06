package in.rahulit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.rahulit.util.Car;

@SpringBootApplication
@ComponentScan(basePackages = { "com.rahulit", "in.rahulit" })
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