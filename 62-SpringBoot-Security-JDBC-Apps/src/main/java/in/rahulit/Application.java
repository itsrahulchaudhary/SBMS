package in.rahulit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		//BCryptPasswordEncoder b=new BCryptPasswordEncoder();
		//String encode = b.encode("devs");
		//System.out.println(encode);
	}

}
