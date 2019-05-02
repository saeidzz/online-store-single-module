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
 * Order
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-26T13:31:08.886Z")

public class Order   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("products")
  private Object products = null;

  @JsonProperty("payment")
  private Object payment = null;

  @JsonProperty("complete")
  private Boolean complete = false;

  public Order id(Long id) {
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

  public Order products(Object products) {
    this.products = products;
    return this;
  }

  /**
   * محصولات سفارش داده شده
   * @return products
  **/
  @ApiModelProperty(value = "محصولات سفارش داده شده")


  public Object getProducts() {
    return products;
  }

  public void setProducts(Object products) {
    this.products = products;
  }

  public Order payment(Object payment) {
    this.payment = payment;
    return this;
  }

  /**
   * وضعیت پرداخت
   * @return payment
  **/
  @ApiModelProperty(value = "وضعیت پرداخت")


  public Object getPayment() {
    return payment;
  }

  public void setPayment(Object payment) {
    this.payment = payment;
  }

  public Order complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

  /**
   * Get complete
   * @return complete
  **/
  @ApiModelProperty(value = "")


  public Boolean isComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.products, order.products) &&
        Objects.equals(this.payment, order.payment) &&
        Objects.equals(this.complete, order.complete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, products, payment, complete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
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

