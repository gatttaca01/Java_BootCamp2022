package kodlamaio.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.rentACar.business.abstracts.BrandService;
import kodlamaio.rentACar.entities.concretes.Brand;

//Restfull yapılar için konrolcü olduğunu söylememmiz gerekir. annotation yaparız.
@RestController //annotation
@RequestMapping("/api/brans") /* nasıl ulaşacaklarını söyler
 							   *tarayıcıdaki adresleme gibi*/
public class BrandsController {
	private BrandService brandService;

	@Autowired 
	/*git parametrelerine bak
	 *uygulamayı tara 
	 *implemente edeni bul
	 *! Spring yeni versiyonlarında autowired default çalışır.
	 */
	
	public BrandsController(BrandService brandService) {
		super();
		this.brandService = brandService;
	}
	// DependencyInjection
	// Spring bootta IoC "kutu" 
	/*Inversition of Control bellekte o ifadeyi new le isteyene ver
	 *Bir kere üret herkes kullansın. 
	 */
	@GetMapping("/getAll")
	public List<Brand> getAll(){
		return brandService.getAll();
	}
	
	
	
}
