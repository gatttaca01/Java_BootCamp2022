package oopwithnlayeredapp.dataAccesss;

// product ı kullanabilmek içim import ettik.
// 
import oopwithnlayeredapp.entities.Product;

public class JdbcProductDao implements ProductDao{ 
	// data access object
	// implements demek implemente edilen interface içindeki fonksiyonları içerme zorunluluğu getirir.
	public void add(Product product) {
		// db erişim kodları buraya yazılır sql bilmek gerekir.
		System.out.println("JDBC ile veri tabanına eklendi.");

	}

}
/* ex:
 * hybernate e geçirmek gerekiyor
 * 
*/ 

