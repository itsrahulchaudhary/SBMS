package in.rahulit.bindings;

 
 
public class InsurancePolicy {

	private String policyName;
	private String startDate;
	private String endDate;
	private Double premiumAmt;
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Double getPremiumAmt() {
		return premiumAmt;
	}
	public void setPremiumAmt(Double premiumAmt) {
		this.premiumAmt = premiumAmt;
	}
	public InsurancePolicy(String policyName, String startDate, String endDate, Double premiumAmt) {
		super();
		this.policyName = policyName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.premiumAmt = premiumAmt;
	}
	public InsurancePolicy() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "InsurancePolicy [policyName=" + policyName + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", premiumAmt=" + premiumAmt + "]";
	}
	
	

}
