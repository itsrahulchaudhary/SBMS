package in.rahulit.bindings;

 

 
public class User {
	private String uname;
	private String pwd;
	private String email;
	private Long phone;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [uname=" + uname + ", pwd=" + pwd + ", email=" + email + ", phone=" + phone + "]";
	}
	
	

}