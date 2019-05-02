package ir.rabbit.group.onlinestore.dto.customer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerCheckedProducts
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-26T13:31:08.886Z")

public class CustomerCheckedProducts   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("products")
  private Object products = null;

  @JsonProperty("customer")
  private Object customer = null;

  public CustomerCheckedProducts id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CustomerCheckedProducts products(Object products) {
    this.products = products;
    return this;
  }

  /**
   * لیست محصولات
   * @return products
  **/
  @ApiModelProperty(value = "لیست محصولات")


  public Object getProducts() {
    return products;
  }

  public void setProducts(Object products) {
    this.products = products;
  }

  public CustomerCheckedProducts customer(Object customer) {
    this.customer = customer;
    return this;
  }

  /**
   * مشتری
   * @return customer
  **/
  @ApiModelProperty(value = "مشتری")


  public Object getCustomer() {
    return customer;
  }

  public void setCustomer(Object customer) {
    this.customer = customer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerCheckedProducts customerCheckedProducts = (CustomerCheckedProducts) o;
    return Objects.equals(this.id, customerCheckedProducts.id) &&
        Objects.equals(this.products, customerCheckedProducts.products) &&
        Objects.equals(this.customer, customerCheckedProducts.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, products, customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerCheckedProducts {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

