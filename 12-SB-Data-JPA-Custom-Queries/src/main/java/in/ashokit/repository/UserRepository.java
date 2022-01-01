package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import in.ashokit.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Serializable>{
	
	@Query("from UserEntity where email=:email")                    // HQL 
	public UserEntity findUserByEmail(String email);
	
	@Query("select userId, uname from UserEntity where age=:age")   // HQL
	public Object[] findUserByAge(Integer age);
	
	@Query(value="select * from user_details where user_id=:userId", nativeQuery = true)    // SQL
	public UserEntity findUserById(Integer userId);
	
	@Modifying
	@Transactional
	@Query(value="update user_details u SET u.user_name=:uname where u.user_id=:userId", nativeQuery = true)  // SQL
	public int updateById(Integer userId, String uname);
	
	@Modifying
	@Transactional
	@Query(value="insert into user_details(user_id, user_age, user_email, user_name)"+ "values(:userId,:age,:email,:uname)", nativeQuery = true)  // SQL
	public int insert(Integer userId, Integer age, String email, String uname);
	
	@Modifying
	@Transactional
	@Query(value="delete from user_details u where u.user_id=:userId", nativeQuery = true)  // SQL
	public int delete(Integer userId);

  

}
