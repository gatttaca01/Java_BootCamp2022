package kodlamaio.rentACar.business.concrets;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.rentACar.business.abstracts.BrandService;
import kodlamaio.rentACar.dataAccess.abstracts.BrandRepository;
import kodlamaio.rentACar.entities.concretes.Brand;
@Service //Bu sınıf bir business nesnesidir.
public class BrandManager implements BrandService {
	private BrandRepository brandRepository;
	//gevşek bağlı sistem
	
	public BrandManager(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}
	
	@Override
	public List<Brand> getAll() {
		// iş kuralları
		
		return brandRepository.getAll();
	}
	

}
