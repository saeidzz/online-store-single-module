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
 * City
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-26T13:31:08.886Z")

public class City   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("state")
  private Object state = null;

  public City id(Long id) {
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

  public City name(String name) {
    this.name = name;
    return this;
  }

  /**
   * نام شهر
   * @return name
  **/
  @ApiModelProperty(value = "نام شهر")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public City state(Object state) {
    this.state = state;
    return this;
  }

  /**
   * استان
   * @return state
  **/
  @ApiModelProperty(value = "استان")


  public Object getState() {
    return state;
  }

  public void setState(Object state) {
    this.state = state;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    City city = (City) o;
    return Objects.equals(this.id, city.id) &&
        Objects.equals(this.name, city.name) &&
        Objects.equals(this.state, city.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class City {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

