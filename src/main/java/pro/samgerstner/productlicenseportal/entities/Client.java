package pro.samgerstner.productlicenseportal.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "clients")
public class Client
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;

   @Column(name = "first_name", nullable = false)
   private String firstName;

   @Column(name = "last_name", nullable = false)
   private String lastName;

   @Column(name = "email", nullable = false)
   private String email;

   @OneToMany(fetch = FetchType.LAZY)
   private List<ProductKey> productKeys;

   public Integer getId()
   {

      return id;
   }

   public void setId(Integer id)
   {

      this.id = id;
   }

   public String getFirstName()
   {

      return firstName;
   }

   public void setFirstName(String firstName)
   {

      this.firstName = firstName;
   }

   public String getLastName()
   {

      return lastName;
   }

   public void setLastName(String lastName)
   {

      this.lastName = lastName;
   }

   public String getEmail()
   {

      return email;
   }

   public void setEmail(String email)
   {

      this.email = email;
   }
}
