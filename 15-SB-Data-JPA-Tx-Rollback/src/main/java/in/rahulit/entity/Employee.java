package in.rahulit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMP_TBL")
public class Employee {
	@Id
	@Column(name="EMP_Id")
	private Integer empId;
	private String empName;
	private Double empSal;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	

}
