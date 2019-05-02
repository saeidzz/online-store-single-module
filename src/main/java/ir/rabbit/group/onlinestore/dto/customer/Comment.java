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
 * Comment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-26T13:31:08.886Z")

public class Comment   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("customer")
  private Object customer = null;

  @JsonProperty("product")
  private Object product = null;

  public Comment id(Long id) {
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

  public Comment customer(Object customer) {
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

  public Comment product(Object product) {
    this.product = product;
    return this;
  }

  /**
   * محصول
   * @return product
  **/
  @ApiModelProperty(value = "محصول")


  public Object getProduct() {
    return product;
  }

  public void setProduct(Object product) {
    this.product = product;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(this.id, comment.id) &&
        Objects.equals(this.customer, comment.customer) &&
        Objects.equals(this.product, comment.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customer, product);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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

