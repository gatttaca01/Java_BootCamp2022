package oopwithnlayeredapp.dataAccesss;

import oopwithnlayeredapp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		// db erişim kodları buraya yazılır sql bilmek gerekir.
		System.out.println("HİBERNATES ile veri tabanına eklendi.");

	}

}
