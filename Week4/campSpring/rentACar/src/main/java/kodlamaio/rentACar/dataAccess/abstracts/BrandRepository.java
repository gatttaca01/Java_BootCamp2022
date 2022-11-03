package kodlamaio.rentACar.dataAccess.abstracts;

import java.util.List;

import kodlamaio.rentACar.entities.concretes.Brand;

public interface BrandRepository {
	//veri tabanı işleri yapacak sınıflara verilen isimlerdir.
// Sayı olarak 1 den fazla olduğundan array de tutulmalıdır.
	/*
	 * Genelde  bu şekilde array Brand[] getAll(); kullanılmaz çünkü boyut genişletme yorucudur.
	 * o yüzden list <> kullnırız.
	 */
	List<Brand> getAll();
	
	
	
}
