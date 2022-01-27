package in.rahulit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="rest_student")
@XmlRootElement
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="STUDENT_ID")
	private Integer sid;
	@Column(name="STUDENT_NAME")
	private String sname;
	@Column(name="STUDENT_EMAIL")
	private String semail;
	@Column(name="STUDENT_AGE")
	private Integer sage;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	
	

}
