package pro.samgerstner.productlicenseportal;

import org.springframework.data.repository.CrudRepository;
import pro.samgerstner.productlicenseportal.entities.AdminUser;

public interface AdminUserRepository extends CrudRepository<AdminUser, Integer>
{
}