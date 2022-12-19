package Human03;

public class Smartphone {
	private String company;
	private String os;
	
	public Smartphone(String company,String os) {
		this.company=company;
		this.os=os;
	}
	public String toString() {
		return(this.company + "-"+this.os);
	}
}
