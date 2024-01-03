package pro.samgerstner.productlicenseportal;

import org.springframework.data.repository.CrudRepository;
import pro.samgerstner.productlicenseportal.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>
{
}