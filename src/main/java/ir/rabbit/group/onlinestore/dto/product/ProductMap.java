package ir.rabbit.group.onlinestore.dto.product;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductMap
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-26T13:31:08.886Z")

public class ProductMap   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("feature")
  private String feature = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("quantity")
  private String quantity = null;

  public ProductMap id(Long id) {
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

  public ProductMap feature(String feature) {
    this.feature = feature;
    return this;
  }

  /**
   * عنوان ویژگی
   * @return feature
  **/
  @ApiModelProperty(value = "عنوان ویژگی")


  public String getFeature() {
    return feature;
  }

  public void setFeature(String feature) {
    this.feature = feature;
  }

  public ProductMap value(String value) {
    this.value = value;
    return this;
  }

  /**
   * مقدار ویژگی
   * @return value
  **/
  @ApiModelProperty(value = "مقدار ویژگی")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ProductMap quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * واحد ویژگی 
   * @return quantity
  **/
  @ApiModelProperty(value = "واحد ویژگی ")


  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductMap productMap = (ProductMap) o;
    return Objects.equals(this.id, productMap.id) &&
        Objects.equals(this.feature, productMap.feature) &&
        Objects.equals(this.value, productMap.value) &&
        Objects.equals(this.quantity, productMap.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, feature, value, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductMap {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

