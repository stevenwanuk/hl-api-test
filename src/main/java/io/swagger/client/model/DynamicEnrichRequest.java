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
import io.swagger.client.model.DynamicAnnotatorStep;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DynamicEnrichRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-01T09:30:57.014Z")
public class DynamicEnrichRequest {
  @SerializedName("annotationTypes")
  private List<String> annotationTypes = null;

  @SerializedName("requestId")
  private String requestId = null;

  @SerializedName("steps")
  private List<DynamicAnnotatorStep> steps = null;

  @SerializedName("text")
  private String text = null;

  public DynamicEnrichRequest annotationTypes(List<String> annotationTypes) {
    this.annotationTypes = annotationTypes;
    return this;
  }

  public DynamicEnrichRequest addAnnotationTypesItem(String annotationTypesItem) {
    if (this.annotationTypes == null) {
      this.annotationTypes = new ArrayList<String>();
    }
    this.annotationTypes.add(annotationTypesItem);
    return this;
  }

   /**
   * Get annotationTypes
   * @return annotationTypes
  **/
  @ApiModelProperty(value = "")
  public List<String> getAnnotationTypes() {
    return annotationTypes;
  }

  public void setAnnotationTypes(List<String> annotationTypes) {
    this.annotationTypes = annotationTypes;
  }

  public DynamicEnrichRequest requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @ApiModelProperty(value = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public DynamicEnrichRequest steps(List<DynamicAnnotatorStep> steps) {
    this.steps = steps;
    return this;
  }

  public DynamicEnrichRequest addStepsItem(DynamicAnnotatorStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<DynamicAnnotatorStep>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @ApiModelProperty(value = "")
  public List<DynamicAnnotatorStep> getSteps() {
    return steps;
  }

  public void setSteps(List<DynamicAnnotatorStep> steps) {
    this.steps = steps;
  }

  public DynamicEnrichRequest text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicEnrichRequest dynamicEnrichRequest = (DynamicEnrichRequest) o;
    return Objects.equals(this.annotationTypes, dynamicEnrichRequest.annotationTypes) &&
        Objects.equals(this.requestId, dynamicEnrichRequest.requestId) &&
        Objects.equals(this.steps, dynamicEnrichRequest.steps) &&
        Objects.equals(this.text, dynamicEnrichRequest.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotationTypes, requestId, steps, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicEnrichRequest {\n");
    
    sb.append("    annotationTypes: ").append(toIndentedString(annotationTypes)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
