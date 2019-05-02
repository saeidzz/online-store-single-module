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
 * Product
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-26T13:31:08.886Z")

public class Product   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("manufacturer")
  private String manufacturer = null;

  @JsonProperty("Categories")
  private Object categories = null;

  @JsonProperty("comments")
  private Object comments = null;

  @JsonProperty("features")
  private Object features = null;

  @JsonProperty("images")
  private Object images = null;

  public Product id(Long id) {
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

  public Product name(String name) {
    this.name = name;
    return this;
  }

  /**
   * نام
   * @return name
  **/
  @ApiModelProperty(value = "نام")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

  /**
   * تولید کننده
   * @return manufacturer
  **/
  @ApiModelProperty(value = "تولید کننده")


  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public Product categories(Object categories) {
    this.categories = categories;
    return this;
  }

  /**
   * لیست دسته های این محصول
   * @return categories
  **/
  @ApiModelProperty(value = "لیست دسته های این محصول")


  public Object getCategories() {
    return categories;
  }

  public void setCategories(Object categories) {
    this.categories = categories;
  }

  public Product comments(Object comments) {
    this.comments = comments;
    return this;
  }

  /**
   * لیست نظرات
   * @return comments
  **/
  @ApiModelProperty(value = "لیست نظرات")


  public Object getComments() {
    return comments;
  }

  public void setComments(Object comments) {
    this.comments = comments;
  }

  public Product features(Object features) {
    this.features = features;
    return this;
  }

  /**
   * لیست ویژگی های محصول
   * @return features
  **/
  @ApiModelProperty(value = "لیست ویژگی های محصول")


  public Object getFeatures() {
    return features;
  }

  public void setFeatures(Object features) {
    this.features = features;
  }

  public Product images(Object images) {
    this.images = images;
    return this;
  }

  /**
   * لیست عکس های محصول
   * @return images
  **/
  @ApiModelProperty(value = "لیست عکس های محصول")


  public Object getImages() {
    return images;
  }

  public void setImages(Object images) {
    this.images = images;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.manufacturer, product.manufacturer) &&
        Objects.equals(this.categories, product.categories) &&
        Objects.equals(this.comments, product.comments) &&
        Objects.equals(this.features, product.features) &&
        Objects.equals(this.images, product.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, manufacturer, categories, comments, features, images);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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

