package oopwithnlayeredapp.business;

import oopwithnlayeredapp.entities.Product;
import oopwithnlayeredapp.dataAccesss.JdbcProductDao;
public class ProductManager {

public void add(Product product) throws Exception {
		// iş kuralları
		
		if (product.getUnitPrice()<10) {
			// hata fırlatma
			// bu koddan sonra kod çalışmaz.
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz. ");
		}
		
		JdbcProductDao productDao = new JdbcProductDao();
		productDao.add(product);
		
		
		
	}
}
