package pro.samgerstner.productlicenseportal;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pro.samgerstner.productlicenseportal.entities.Client;

public interface ClientRepository extends CrudRepository<Client, Integer>
{
   @Query("select c from Client c where c.firstName like '%?1%' or c.lastName like '%?2%' or c.email like '%?3%'")
   Page<Client> findByFirstNameOrLastNameOrEmail(String search, Pageable pageable);

   @Query("select c from Client c")
   Page<Client> findAllPageable(Pageable pageable);
}