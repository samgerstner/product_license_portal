package pro.samgerstner.productlicenseportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pro.samgerstner.productlicenseportal.entities.ApplicationRole;
import java.util.Arrays;

@Component
public class InitializeDatabase implements CommandLineRunner
{
   @Autowired
   ApplicationRoleRepository roleRepo;

   @Override
   public void run(String... args) throws Exception
   {
      if(!roleRepo.existsById(1))
      {
         roleRepo.saveAll(Arrays.asList(
                 new ApplicationRole(1, "Client Manager"),
                 new ApplicationRole(2, "Product Manager"),
                 new ApplicationRole(3, "Key Manager"),
                 new ApplicationRole(4, "Administrator"),
                 new ApplicationRole(5, "Super Admin")
         ));
      }
   }
}