package in.rahulit.bindings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

 
public class Person {

	private Integer personId;
	private String personName;
	private String personEmail;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(Integer personId, String personName, String personEmail) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personEmail = personEmail;
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonEmail() {
		return personEmail;
	}
	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}

}
