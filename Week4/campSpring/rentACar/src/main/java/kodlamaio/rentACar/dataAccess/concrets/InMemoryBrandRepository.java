package kodlamaio.rentACar.dataAccess.concrets;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlamaio.rentACar.dataAccess.abstracts.BrandRepository;
import kodlamaio.rentACar.entities.concretes.Brand;
@Repository // sen br data Access nesnesisin demek Springe anlatır bunu.
public class InMemoryBrandRepository implements BrandRepository{
	
	List<Brand> brands;
	
	public InMemoryBrandRepository() {
		// boş bir array
		brands = new ArrayList<Brand>();
		brands.add(new Brand("B&M",1));
		brands.add(new Brand("Renault",2));
		brands.add(new Brand( "Mercedes",3));
		brands.add(new Brand( "Volkswagen",4));
		
	}
	
	@Override
	public List<Brand> getAll() {
		
		return brands;
	}
}

	
