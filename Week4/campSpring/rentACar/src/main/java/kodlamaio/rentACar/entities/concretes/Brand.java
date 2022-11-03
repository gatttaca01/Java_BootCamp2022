package kodlamaio.rentACar.entities.concretes;

public class Brand {
	private String name;
	private int iD;
	
	public Brand() {
		super();
	}

	public Brand(String name, int iD) {
		// base i olmadığından super() tutulabilir de tutulmayabilir de
		super();
		this.name = name;
		this.iD = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}
	
	
}
