package in.rahulit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rahulit.entity.Student;
 

public interface StudentRepository extends JpaRepository<Student, Serializable>{
	
	 

}
