package in.rahulit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rahulit.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Serializable> {

}
