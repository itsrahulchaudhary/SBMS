package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_TBL")
public class Student {
	@Id
	@Column(name="STUDENT_ID")
	@GeneratedValue
	private Integer studentId;
	@Column(name="STUDENT_NAME")
	private String studentName;
	@Column(name="STUDENT_EMAIL")
	private String studentEmail;
	@Column(name="STUDENT_RANK")
	private String studentRank;
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentRank() {
		return studentRank;
	}
	public void setStudentRank(String studentRank) {
		this.studentRank = studentRank;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", studentRank=" + studentRank + "]";
	}

}
