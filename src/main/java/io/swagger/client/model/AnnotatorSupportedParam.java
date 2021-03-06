/*
 * LE Indexer API
 * &copy; 2018 Health Language
 *
 * OpenAPI spec version: 8.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AnnotatorSupportedParam
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-01T09:30:57.014Z")
public class AnnotatorSupportedParam {
  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("singleCardinality")
  private Boolean singleCardinality = null;

  public AnnotatorSupportedParam description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AnnotatorSupportedParam id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AnnotatorSupportedParam required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @ApiModelProperty(value = "")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public AnnotatorSupportedParam singleCardinality(Boolean singleCardinality) {
    this.singleCardinality = singleCardinality;
    return this;
  }

   /**
   * Get singleCardinality
   * @return singleCardinality
  **/
  @ApiModelProperty(value = "")
  public Boolean isSingleCardinality() {
    return singleCardinality;
  }

  public void setSingleCardinality(Boolean singleCardinality) {
    this.singleCardinality = singleCardinality;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotatorSupportedParam annotatorSupportedParam = (AnnotatorSupportedParam) o;
    return Objects.equals(this.description, annotatorSupportedParam.description) &&
        Objects.equals(this.id, annotatorSupportedParam.id) &&
        Objects.equals(this.required, annotatorSupportedParam.required) &&
        Objects.equals(this.singleCardinality, annotatorSupportedParam.singleCardinality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, required, singleCardinality);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotatorSupportedParam {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    singleCardinality: ").append(toIndentedString(singleCardinality)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

