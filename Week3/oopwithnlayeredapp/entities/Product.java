package oopwithnlayeredapp.entities;

public class Product {
	
	private int id;
	private String name;
	private double unitPrice;
	
	// yapıcı blok
	public Product() {
		super();
	}
	
		//parametreli yapıcı blok
	public Product(int id, String name, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	

}
