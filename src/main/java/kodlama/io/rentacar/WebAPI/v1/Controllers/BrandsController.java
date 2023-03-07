package kodlama.io.rentacar.WebAPI.Controllers;

import kodlama.io.rentacar.Business.Abstract.BrandService;
import kodlama.io.rentacar.Entities.Concrete.Brand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/brands")
public class BrandsController {
    private BrandService _brandService;

    public BrandsController(BrandService brandService) {
        _brandService = brandService;
    }

    @GetMapping("")
    public List<Brand> getAll() {
        return _brandService.getAll();
    }
}
