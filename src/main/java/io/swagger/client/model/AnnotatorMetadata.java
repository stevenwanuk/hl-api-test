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
import io.swagger.client.model.AnnotatorSupportedParam;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AnnotatorMetadata
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-01T09:30:57.014Z")
public class AnnotatorMetadata {
  @SerializedName("apiVersions")
  private List<String> apiVersions = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("supportedParams")
  private List<AnnotatorSupportedParam> supportedParams = null;

  public AnnotatorMetadata apiVersions(List<String> apiVersions) {
    this.apiVersions = apiVersions;
    return this;
  }

  public AnnotatorMetadata addApiVersionsItem(String apiVersionsItem) {
    if (this.apiVersions == null) {
      this.apiVersions = new ArrayList<String>();
    }
    this.apiVersions.add(apiVersionsItem);
    return this;
  }

   /**
   * Get apiVersions
   * @return apiVersions
  **/
  @ApiModelProperty(value = "")
  public List<String> getApiVersions() {
    return apiVersions;
  }

  public void setApiVersions(List<String> apiVersions) {
    this.apiVersions = apiVersions;
  }

  public AnnotatorMetadata description(String description) {
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

  public AnnotatorMetadata id(String id) {
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

  public AnnotatorMetadata supportedParams(List<AnnotatorSupportedParam> supportedParams) {
    this.supportedParams = supportedParams;
    return this;
  }

  public AnnotatorMetadata addSupportedParamsItem(AnnotatorSupportedParam supportedParamsItem) {
    if (this.supportedParams == null) {
      this.supportedParams = new ArrayList<AnnotatorSupportedParam>();
    }
    this.supportedParams.add(supportedParamsItem);
    return this;
  }

   /**
   * Get supportedParams
   * @return supportedParams
  **/
  @ApiModelProperty(value = "")
  public List<AnnotatorSupportedParam> getSupportedParams() {
    return supportedParams;
  }

  public void setSupportedParams(List<AnnotatorSupportedParam> supportedParams) {
    this.supportedParams = supportedParams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotatorMetadata annotatorMetadata = (AnnotatorMetadata) o;
    return Objects.equals(this.apiVersions, annotatorMetadata.apiVersions) &&
        Objects.equals(this.description, annotatorMetadata.description) &&
        Objects.equals(this.id, annotatorMetadata.id) &&
        Objects.equals(this.supportedParams, annotatorMetadata.supportedParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersions, description, id, supportedParams);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotatorMetadata {\n");
    
    sb.append("    apiVersions: ").append(toIndentedString(apiVersions)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    supportedParams: ").append(toIndentedString(supportedParams)).append("\n");
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

