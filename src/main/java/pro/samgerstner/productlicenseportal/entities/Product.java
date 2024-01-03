package pro.samgerstner.productlicenseportal.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Product
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;

   @Column(name = "product_name", nullable = false)
   private String productName;

   @Column(name = "product_description")
   private String productDescription;

   @Column(name = "product_expires", nullable = false)
   private boolean productExpires;

   @Column(name = "key_octets", nullable = false)
   private int keyOctets;

   @Column(name = "octet_length", nullable = false)
   private int octetLength;

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

   public String getProductName()
   {

      return productName;
   }

   public void setProductName(String productName)
   {

      this.productName = productName;
   }

   public String getProductDescription()
   {

      return productDescription;
   }

   public void setProductDescription(String productDescription)
   {

      this.productDescription = productDescription;
   }

   public boolean isProductExpires()
   {

      return productExpires;
   }

   public void setProductExpires(boolean productExpires)
   {

      this.productExpires = productExpires;
   }

   public int getKeyOctets()
   {

      return keyOctets;
   }

   public void setKeyOctets(int keyOctets)
   {

      this.keyOctets = keyOctets;
   }

   public int getOctetLength()
   {

      return octetLength;
   }

   public void setOctetLength(int octetLength)
   {

      this.octetLength = octetLength;
   }

   public List<ProductKey> getProductKeys()
   {

      return productKeys;
   }

   public void setProductKeys(List<ProductKey> productKeys)
   {

      this.productKeys = productKeys;
   }
}
