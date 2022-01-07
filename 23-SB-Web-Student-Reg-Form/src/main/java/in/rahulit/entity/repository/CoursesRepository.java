package in.rahulit.entity.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.rahulit.entity.Course;

public interface CoursesRepository extends JpaRepository<Course, Serializable>{

	@Query("select courseName from Course")
	public List<String> getCourseNames();
}
