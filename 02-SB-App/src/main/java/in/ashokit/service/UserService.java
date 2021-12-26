package in.ashokit.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.ashokit.util.Car;

@Service
public class UserService {

	public UserService() {
		System.out.println("UserService::Constructor");
	}

}
