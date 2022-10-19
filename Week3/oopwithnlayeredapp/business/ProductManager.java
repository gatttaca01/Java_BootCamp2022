package oopwithnlayeredapp.business;


import oopwithnlayeredapp.entities.Product;
import oopwithnlayeredapp.dataAccesss.JdbcProductDao;
import oopwithnlayeredapp.dataAccesss.ProductDao;

import java.util.List;
import java.util.logging.Logger;

import oopwithnlayeredapp.dataAccesss.HibernateProductDao;
public class ProductManager {

	//Dependency İnjection
	private ProductDao  productDao;
	// 3 class içinde loglama yapmasını istiyorsak
	// Logger[] yerine list  ide kullanılabilirdik.
	private Logger[] loggers;
	
public ProductManager(ProductDao productDao, Logger[] loggers) {
	// yeni bir productManager oluşturduğunda bana yeni productDao ver.
	// ProductDao uyduruk imza
		this.productDao = productDao;
		// productDao jdbc ve hibernate tarafından da gönderilebilir.
		this.loggers = loggers;
		//this konulmazsa kendine en yakın logger ı alır.
	}

public void add(Product product) throws Exception {
		// iş kuralları
		
		if (product.getUnitPrice()<10) {
			// hata fırlatma
			// bu koddan sonra kod çalışmaz.
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz. ");
		}
		
		//JdbcProductDao productDao = new JdbcProductDao();
		//HibernateProductDao productDao = new HibernateProductDao();
		
		// ProductDao bir interface fakat implemente ettiği sınıfların referansını"newini instanceını" tutabilir.
			/* privatele yeni productDao oluşturduğumuzdan bu kodu sildik.
			 * ProductDao productDao = new HibernateProductDao();
		*ProductDao productDao1 = new JdbcProductDao();
		*/
		productDao.add(product);
		// Bir katman başka bir katmanın interface ini kullanırken sadece interface inden erişmelidir.
		
		// sadece interface e bağlılık muslıcapable
		
		for(Logger logger : loggers) { //[db,mail]
			logger.log(product.getName());
			
			
		}




}


}
