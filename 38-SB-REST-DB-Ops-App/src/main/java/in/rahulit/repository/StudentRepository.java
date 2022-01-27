package in.rahulit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rahulit.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	public List<Student> findBySageGreaterThanEqual(Integer age);

}
