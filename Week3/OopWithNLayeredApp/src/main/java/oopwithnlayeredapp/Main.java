package oopwithnlayeredapp;

import oopwithnlayeredapp.business.ProductManager;
import oopwithnlayeredapp.entities.Product;

public class Main {
	
	public static void main(String[] args) throws Exception
	{
	/*
	 * Katmanlar
	 * DA data access
	 * Business
	 * 	API
	 * UI
	 * 
	 * Parçalara ayırıp daha kolay yönetim
	 * Sürdürülebilirlik
	 * 
	 * JDBC veri ekleme çıkarma
	 * Hibernate-ORM
	 * JPA
	 *
	 */
		// entities veri tabanı nesneleri ürün müşteri ...
	
	Product product1 = new Product(1, "ıphone XR", 10000);
	ProductManager productManager = new ProductManager();
	productManager.add(product1);
	
	}
}
