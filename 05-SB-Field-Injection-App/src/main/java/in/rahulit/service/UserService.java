package in.rahulit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.rahulit.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userdao;

	public void save() {
		boolean isSaved = userdao.saveUser();
		System.out.println("Is Record Saved ?? :: " + isSaved);
	}
}
