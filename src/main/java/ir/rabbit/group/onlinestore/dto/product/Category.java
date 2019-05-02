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
 * Category
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-26T13:31:08.886Z")

public class Category   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("subCategories")
  private Object subCategories = null;

  public Category id(Long id) {
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

  public Category name(String name) {
    this.name = name;
    return this;
  }

  /**
   * نام دسته
   * @return name
  **/
  @ApiModelProperty(value = "نام دسته")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Category subCategories(Object subCategories) {
    this.subCategories = subCategories;
    return this;
  }

  /**
   * زیر دسته ها
   * @return subCategories
  **/
  @ApiModelProperty(value = "زیر دسته ها")


  public Object getSubCategories() {
    return subCategories;
  }

  public void setSubCategories(Object subCategories) {
    this.subCategories = subCategories;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return Objects.equals(this.id, category.id) &&
        Objects.equals(this.name, category.name) &&
        Objects.equals(this.subCategories, category.subCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, subCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subCategories: ").append(toIndentedString(subCategories)).append("\n");
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

