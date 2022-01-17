package in.rahulit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.rahulit.entity.UserEntity;
import in.rahulit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);
		
		UserEntity findUserByEmail = userRepository.findUserByEmail("raman@gmail.com");
		System.out.println(findUserByEmail);
		
		System.out.println("----------------------------------------------------------");
		Object[] findUserByAge = userRepository.findUserByAge(22);
		for(Object obj : findUserByAge) {
			Object[] userData =(Object[])obj;
			System.out.println(userData[0]);
			System.out.println(userData[1]);
		}
		
		System.out.println("----------------------------------------------------------");
		UserEntity findUserById = userRepository.findUserById(105);
		System.out.println(findUserById);
		
		System.out.println("----------------update------------------------------------");
		int updateById = userRepository.updateById(104, "Sujeet");
		System.out.println("updated "+updateById);
		
		System.out.println("----------------insert------------------------------------");
		int insert = userRepository.insert(112, 23, "abc1@gmail.com", "abc1");
		System.out.println(insert);
		
		System.out.println("----------------delete------------------------------------");
		int delete = userRepository.delete(102);
		System.out.println(delete);
	}

}
