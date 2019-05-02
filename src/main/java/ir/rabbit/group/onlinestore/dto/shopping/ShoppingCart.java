package ir.rabbit.group.onlinestore.dto.shopping;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ShoppingCart
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-26T13:31:08.886Z")

public class ShoppingCart   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("customer")
  private Object customer = null;

  @JsonProperty("products")
  private Object products = null;

  public ShoppingCart id(Long id) {
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

  public ShoppingCart customer(Object customer) {
    this.customer = customer;
    return this;
  }

  /**
   * مشخصات مشتری
   * @return customer
  **/
  @ApiModelProperty(value = "مشخصات مشتری")


  public Object getCustomer() {
    return customer;
  }

  public void setCustomer(Object customer) {
    this.customer = customer;
  }

  public ShoppingCart products(Object products) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShoppingCart shoppingCart = (ShoppingCart) o;
    return Objects.equals(this.id, shoppingCart.id) &&
        Objects.equals(this.customer, shoppingCart.customer) &&
        Objects.equals(this.products, shoppingCart.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customer, products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShoppingCart {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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

