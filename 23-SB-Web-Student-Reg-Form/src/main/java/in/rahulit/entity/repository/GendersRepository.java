package in.rahulit.entity.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.rahulit.entity.Gender;

public interface GendersRepository extends JpaRepository<Gender, Serializable> {

	@Query("select genderName from Gender")
	List<String> getGenderNames();
}
