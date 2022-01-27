package in.rahulit.response;

public class TicketResponse {
	
	private String pnr;
	private String ticketPrice;
	private String ticketStatus;
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	@Override
	public String toString() {
		return "TicketResponse=> [pnr=" + pnr + ", ticketPrice=" + ticketPrice + ", ticketStatus=" + ticketStatus + "]";
	}
	
	

}
