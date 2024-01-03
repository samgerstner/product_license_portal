package pro.samgerstner.productlicenseportal;

import org.springframework.data.repository.CrudRepository;
import pro.samgerstner.productlicenseportal.entities.ApplicationRole;

public interface ApplicationRoleRepository extends CrudRepository<ApplicationRole, Integer>
{
}