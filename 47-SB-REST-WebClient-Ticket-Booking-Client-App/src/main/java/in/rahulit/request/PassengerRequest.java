package in.rahulit.request;

public class PassengerRequest {
	
	private String fname;
	private String lname;
	private String from;
	private String to;
	private String doj;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public PassengerRequest(String fname, String lname, String from, String to, String doj) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.from = from;
		this.to = to;
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "PassengerRequest [fname=" + fname + ", lname=" + lname + ", from=" + from + ", to=" + to + ", doj="
				+ doj + "]";
	}
	

}
