package in.ashokit;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.ashokit.entity.UserEntity;
import in.ashokit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);
		List<UserEntity> findAll = userRepository.findAll();
		for(UserEntity ue : findAll) {
			System.out.println(ue);
		}
		
		System.out.println("-------------------------------------------------------------");
		List<UserEntity> findAll2 = userRepository.findAll(Sort.by("uname").ascending());
		for(UserEntity ue : findAll2) {
			System.out.println(ue);
		}
		
		System.out.println("-------------------------------------------------------------");
		UserEntity entity = new UserEntity();
		entity.setAge(22);
		Example<UserEntity> of = Example.of(entity);
		List<UserEntity> findAll3 = userRepository.findAll(of);
		for(UserEntity ue : findAll3) {
			System.out.println(ue);
		}
		
		System.out.println("---------------------------Pagination--------------------------");
		PageRequest of2 = PageRequest.of(1, 3);
		Page<UserEntity> findAll4 = userRepository.findAll(of2);
		for(UserEntity ue : findAll4) {
			System.out.println(ue);
		}
		
	}

}
