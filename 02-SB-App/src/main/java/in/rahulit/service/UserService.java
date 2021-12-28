package in.rahulit.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.rahulit.util.Car;

@Service
public class UserService {

	public UserService() {
		System.out.println("UserService::Constructor");
	}

}
