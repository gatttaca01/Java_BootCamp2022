package oopwithnlayeredapp;

import java.util.logging.Logger;

import oopwithnlayeredapp.business.ProductManager;
import oopwithnlayeredapp.core.logging.DatabaseLogger;
import oopwithnlayeredapp.core.logging.FileLogger;
import oopwithnlayeredapp.dataAccesss.JdbcProductDao;
import oopwithnlayeredapp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * Katmanlar DA data access Business API UI
		 * 
		 * Parçalara ayırıp daha kolay yönetim Sürdürülebilirlik
		 * 
		 * JDBC veri ekleme çıkarma Hibernate-ORM JPA
		 *
		 */
		// entities veri tabanı nesneleri ürün müşteri ...

		Product product1 = new Product(1, "ıphone XR", 10000);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		
		ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
		productManager.add(product1);
		

	}
}
