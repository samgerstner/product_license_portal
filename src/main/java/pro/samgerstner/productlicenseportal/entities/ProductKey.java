package pro.samgerstner.productlicenseportal.entities;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "product_keys")
public class ProductKey
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;

   @Column(name = "product_key", nullable = false)
   private String productKey;

   @Column(name = "effective_date")
   private Date effectiveDate;

   @Column(name = "expire_date")
   private Date expireDate;

   @ManyToOne(fetch = FetchType.LAZY)
   private Product product;

   @ManyToOne(fetch = FetchType.LAZY)
   private Client client;

   public Integer getId()
   {

      return id;
   }

   public void setId(Integer id)
   {

      this.id = id;
   }

   public String getProductKey()
   {

      return productKey;
   }

   public void setProductKey(String productKey)
   {

      this.productKey = productKey;
   }

   public Date getEffectiveDate()
   {

      return effectiveDate;
   }

   public void setEffectiveDate(Date effectiveDate)
   {

      this.effectiveDate = effectiveDate;
   }

   public Date getExpireDate()
   {

      return expireDate;
   }

   public void setExpireDate(Date expireDate)
   {

      this.expireDate = expireDate;
   }

   public Product getProduct()
   {

      return product;
   }

   public void setProduct(Product product)
   {

      this.product = product;
   }

   public Client getClient()
   {

      return client;
   }

   public void setClient(Client client)
   {

      this.client = client;
   }
}
