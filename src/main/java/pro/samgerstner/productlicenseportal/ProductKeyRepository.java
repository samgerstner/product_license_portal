package pro.samgerstner.productlicenseportal;

import org.springframework.data.repository.CrudRepository;
import pro.samgerstner.productlicenseportal.entities.ProductKey;

public interface ProductKeyRepository extends CrudRepository<ProductKey, Integer>
{
}