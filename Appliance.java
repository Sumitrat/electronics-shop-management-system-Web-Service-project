package product;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity @Table(name="appliance") @XmlRootElement
@NamedQueries({
@NamedQuery(name="Appliance.findAll",query="SELECT a FROM Appliance a"),
@NamedQuery(name="Appliance.findByProductid",query="SELECT a FROM Appliance a WHERE a.productid=:productid"),
@NamedQuery(name="Appliance.findByProductname",query="SELECT a FROM Appliance a WHERE a.productname=:productname"),
@NamedQuery(name="Appliance.findByProducttype",query="SELECT a FROM Appliance a WHERE a.producttype=:producttype"),
@NamedQuery(name="Appliance.findByComapnyname",query="SELECT a FROM Appliance a WHERE a.comapnyname=:comapnyname"),
@NamedQuery(name="Appliance.findByProductprice",query="SELECT a FROM Appliance a WHERE a.productprice=:productprice"),
@NamedQuery(name="Appliance.findByDiscountprice",query="SELECT a FROM Appliance a WHERE a.discountprice=:discountprice"),
@NamedQuery(name="Appliance.findByDescription",query="SELECT a FROM Appliance a WHERE a.description=:description"),
@NamedQuery(name="Appliance.findByStockavailable",query="SELECT a FROM Appliance a WHERE a.stockavailable=:stockavailable"),
@NamedQuery(name="Appliance.findByManufacturer",query="SELECT a FROM Appliance a WHERE a.manufacturer=:manufacturer"),
@NamedQuery(name="Appliance.findByProductcode",query="SELECT a FROM Appliance a WHERE a.productcode=:productcode")})
public class Appliance implements Serializable {
private static final long serialVersionUID=1L;
@Id @Basic(optional=false) @NotNull @Column(name="productid") private Integer productid;
@Size(max=20) @Column(name="productname") private String productname;
@Size(max=20) @Column(name="producttype") private String producttype;
@Size(max=20) @Column(name="comapnyname") private String comapnyname;
@Size(max=20) @Column(name="productprice") private String productprice;
@Size(max=20) @Column(name="discountprice") private String discountprice;
@Size(max=80) @Column(name="description") private String description;
@Size(max=20) @Column(name="stockavailable") private String stockavailable;
@Size(max=20) @Column(name="manufacturer") private String manufacturer;
@Size(max=20) @Column(name="productcode") private String productcode;
public Appliance(){} public Appliance(Integer id){productid=id;}
public Integer getProductid(){return productid;} public void setProductid(Integer v){productid=v;}
public String getProductname(){return productname;} public void setProductname(String v){productname=v;}
public String getProducttype(){return producttype;} public void setProducttype(String v){producttype=v;}
public String getComapnyname(){return comapnyname;} public void setComapnyname(String v){comapnyname=v;}
public String getProductprice(){return productprice;} public void setProductprice(String v){productprice=v;}
public String getDiscountprice(){return discountprice;} public void setDiscountprice(String v){discountprice=v;}
public String getDescription(){return description;} public void setDescription(String v){description=v;}
public String getStockavailable(){return stockavailable;} public void setStockavailable(String v){stockavailable=v;}
public String getManufacturer(){return manufacturer;} public void setManufacturer(String v){manufacturer=v;}
public String getProductcode(){return productcode;} public void setProductcode(String v){productcode=v;}
}