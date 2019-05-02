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
 * Customer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-26T13:31:08.886Z")

public class Customer   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("mobileNumer")
  private String mobileNumer = null;

  @JsonProperty("birthDate")
  private String birthDate = null;

  @JsonProperty("wishList")
  private Object wishList = null;

  @JsonProperty("shoppingCart")
  private Object shoppingCart = null;

  @JsonProperty("orders")
  private Object orders = null;

  @JsonProperty("shoppingAddress")
  private Object shoppingAddress = null;

  @JsonProperty("address")
  private Object address = null;

  public Customer id(Long id) {
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

  public Customer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Customer lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Customer email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Customer userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Customer phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Customer mobileNumer(String mobileNumer) {
    this.mobileNumer = mobileNumer;
    return this;
  }

  /**
   * Get mobileNumer
   * @return mobileNumer
  **/
  @ApiModelProperty(value = "")


  public String getMobileNumer() {
    return mobileNumer;
  }

  public void setMobileNumer(String mobileNumer) {
    this.mobileNumer = mobileNumer;
  }

  public Customer birthDate(String birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Get birthDate
   * @return birthDate
  **/
  @ApiModelProperty(value = "")


  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public Customer wishList(Object wishList) {
    this.wishList = wishList;
    return this;
  }

  /**
   * لیست علاقه مندی
   * @return wishList
  **/
  @ApiModelProperty(value = "لیست علاقه مندی")


  public Object getWishList() {
    return wishList;
  }

  public void setWishList(Object wishList) {
    this.wishList = wishList;
  }

  public Customer shoppingCart(Object shoppingCart) {
    this.shoppingCart = shoppingCart;
    return this;
  }

  /**
   * سبد خرید
   * @return shoppingCart
  **/
  @ApiModelProperty(value = "سبد خرید")


  public Object getShoppingCart() {
    return shoppingCart;
  }

  public void setShoppingCart(Object shoppingCart) {
    this.shoppingCart = shoppingCart;
  }

  public Customer orders(Object orders) {
    this.orders = orders;
    return this;
  }

  /**
   * لیست سفارشات
   * @return orders
  **/
  @ApiModelProperty(value = "لیست سفارشات")


  public Object getOrders() {
    return orders;
  }

  public void setOrders(Object orders) {
    this.orders = orders;
  }

  public Customer shoppingAddress(Object shoppingAddress) {
    this.shoppingAddress = shoppingAddress;
    return this;
  }

  /**
   * آدرس تحویل سفارشات
   * @return shoppingAddress
  **/
  @ApiModelProperty(value = "آدرس تحویل سفارشات")


  public Object getShoppingAddress() {
    return shoppingAddress;
  }

  public void setShoppingAddress(Object shoppingAddress) {
    this.shoppingAddress = shoppingAddress;
  }

  public Customer address(Object address) {
    this.address = address;
    return this;
  }

  /**
   * آدرس مشتری
   * @return address
  **/
  @ApiModelProperty(value = "آدرس مشتری")


  public Object getAddress() {
    return address;
  }

  public void setAddress(Object address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) &&
        Objects.equals(this.name, customer.name) &&
        Objects.equals(this.lastName, customer.lastName) &&
        Objects.equals(this.email, customer.email) &&
        Objects.equals(this.userName, customer.userName) &&
        Objects.equals(this.phone, customer.phone) &&
        Objects.equals(this.mobileNumer, customer.mobileNumer) &&
        Objects.equals(this.birthDate, customer.birthDate) &&
        Objects.equals(this.wishList, customer.wishList) &&
        Objects.equals(this.shoppingCart, customer.shoppingCart) &&
        Objects.equals(this.orders, customer.orders) &&
        Objects.equals(this.shoppingAddress, customer.shoppingAddress) &&
        Objects.equals(this.address, customer.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, lastName, email, userName, phone, mobileNumer, birthDate, wishList, shoppingCart, orders, shoppingAddress, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    mobileNumer: ").append(toIndentedString(mobileNumer)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    wishList: ").append(toIndentedString(wishList)).append("\n");
    sb.append("    shoppingCart: ").append(toIndentedString(shoppingCart)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
    sb.append("    shoppingAddress: ").append(toIndentedString(shoppingAddress)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

