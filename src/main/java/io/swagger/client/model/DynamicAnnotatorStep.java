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
import io.swagger.client.model.DynamicEnrichAnnotator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DynamicAnnotatorStep
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-01T09:30:57.014Z")
public class DynamicAnnotatorStep {
  @SerializedName("annotators")
  private List<DynamicEnrichAnnotator> annotators = null;

  public DynamicAnnotatorStep annotators(List<DynamicEnrichAnnotator> annotators) {
    this.annotators = annotators;
    return this;
  }

  public DynamicAnnotatorStep addAnnotatorsItem(DynamicEnrichAnnotator annotatorsItem) {
    if (this.annotators == null) {
      this.annotators = new ArrayList<DynamicEnrichAnnotator>();
    }
    this.annotators.add(annotatorsItem);
    return this;
  }

   /**
   * Get annotators
   * @return annotators
  **/
  @ApiModelProperty(value = "")
  public List<DynamicEnrichAnnotator> getAnnotators() {
    return annotators;
  }

  public void setAnnotators(List<DynamicEnrichAnnotator> annotators) {
    this.annotators = annotators;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicAnnotatorStep dynamicAnnotatorStep = (DynamicAnnotatorStep) o;
    return Objects.equals(this.annotators, dynamicAnnotatorStep.annotators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotators);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicAnnotatorStep {\n");
    
    sb.append("    annotators: ").append(toIndentedString(annotators)).append("\n");
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

