package in.rahulit.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.rahulit.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Serializable>{

	 public UserEntity findByEmail(String email);
	 
	 public UserEntity findByUname(String name);
	 
	 public  List<UserEntity> findByAge(Integer age);

	 public UserEntity findByEmailAndUname(String email, String uname);
	 

}
