package in.rahulit.response;

public class Covid19DataResponse {

	private String country;
	private String code;
	private Long confirmed;
	private Long recovered;
	private Long critical;
	private Long deaths;
	private Double latitude;
	private Double longitude;
	private String lastChange;
	private String lastUpdate;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Long getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(Long confirmed) {
		this.confirmed = confirmed;
	}
	public Long getRecovered() {
		return recovered;
	}
	public void setRecovered(Long recovered) {
		this.recovered = recovered;
	}
	public Long getCritical() {
		return critical;
	}
	public void setCritical(Long critical) {
		this.critical = critical;
	}
	public Long getDeaths() {
		return deaths;
	}
	public void setDeaths(Long deaths) {
		this.deaths = deaths;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public String getLastChange() {
		return lastChange;
	}
	public void setLastChange(String lastChange) {
		this.lastChange = lastChange;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	@Override
	public String toString() {
		return "Covid19DataResponse => [country=" + country + ", code=" + code + ", confirmed=" + confirmed
				+ ", recovered=" + recovered + ", critical=" + critical + ", deaths=" + deaths + ", latitude="
				+ latitude + ", longitude=" + longitude + ", lastChange=" + lastChange + ", lastUpdate=" + lastUpdate
				+ "]";
	}
	
	

}
