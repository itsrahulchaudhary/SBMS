package in.rahulit.entity.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rahulit.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Serializable>{

}
