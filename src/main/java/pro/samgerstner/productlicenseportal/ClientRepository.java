package pro.samgerstner.productlicenseportal;

import org.springframework.data.repository.CrudRepository;
import pro.samgerstner.productlicenseportal.entities.Client;

public interface ClientRepository extends CrudRepository<Client, Integer>
{
}