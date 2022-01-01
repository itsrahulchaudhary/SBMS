package in.ashokit;

 
import java.util.List;
 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.UserEntity;
import in.ashokit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);
		UserEntity findByEmail = userRepository.findByEmail("raman@gmail.com");
		System.out.println(findByEmail);
		System.out.println("-----------------------------------------------------------------------");
		UserEntity findByUname = userRepository.findByUname("Laxman");
		System.out.println(findByUname);
		System.out.println("-----------------------------------------------------------------------");
		List<UserEntity> findByAge = userRepository.findByAge(22);
		System.out.println(findByAge);
		System.out.println("-----------------------------------------------------------------------");
		UserEntity findByEmailAndUname = userRepository.findByEmailAndUname("raman@gmail.com", "Raman");
		System.out.println(findByEmailAndUname);
		
	}

}
