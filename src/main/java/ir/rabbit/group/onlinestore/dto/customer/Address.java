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
 * Address
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-26T13:31:08.886Z")

public class Address   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("addressType")
  private Object addressType = null;

  @JsonProperty("city")
  private Object city = null;

  @JsonProperty("plainAddress")
  private String plainAddress = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  public Address id(Long id) {
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

  public Address addressType(Object addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * آدرس تحویل کالا یا آدرس مشتری
   * @return addressType
  **/
  @ApiModelProperty(value = "آدرس تحویل کالا یا آدرس مشتری")


  public Object getAddressType() {
    return addressType;
  }

  public void setAddressType(Object addressType) {
    this.addressType = addressType;
  }

  public Address city(Object city) {
    this.city = city;
    return this;
  }

  /**
   * شهر
   * @return city
  **/
  @ApiModelProperty(value = "شهر")


  public Object getCity() {
    return city;
  }

  public void setCity(Object city) {
    this.city = city;
  }

  public Address plainAddress(String plainAddress) {
    this.plainAddress = plainAddress;
    return this;
  }

  /**
   * Get plainAddress
   * @return plainAddress
  **/
  @ApiModelProperty(value = "")


  public String getPlainAddress() {
    return plainAddress;
  }

  public void setPlainAddress(String plainAddress) {
    this.plainAddress = plainAddress;
  }

  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * کد پستی
   * @return postalCode
  **/
  @ApiModelProperty(value = "کد پستی")


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.id, address.id) &&
        Objects.equals(this.addressType, address.addressType) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.plainAddress, address.plainAddress) &&
        Objects.equals(this.postalCode, address.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, addressType, city, plainAddress, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    plainAddress: ").append(toIndentedString(plainAddress)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

