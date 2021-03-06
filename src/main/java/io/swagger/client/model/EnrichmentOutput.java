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
import io.swagger.client.model.Annotation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EnrichmentOutput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-01T09:30:57.014Z")
public class EnrichmentOutput {
  @SerializedName("annotations")
  private List<Annotation> annotations = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("useCaseId")
  private String useCaseId = null;

  public EnrichmentOutput annotations(List<Annotation> annotations) {
    this.annotations = annotations;
    return this;
  }

  public EnrichmentOutput addAnnotationsItem(Annotation annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<Annotation>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * the extracted annotations from the text
   * @return annotations
  **/
  @ApiModelProperty(value = "the extracted annotations from the text")
  public List<Annotation> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(List<Annotation> annotations) {
    this.annotations = annotations;
  }

  public EnrichmentOutput text(String text) {
    this.text = text;
    return this;
  }

   /**
   * the input text
   * @return text
  **/
  @ApiModelProperty(value = "the input text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public EnrichmentOutput useCaseId(String useCaseId) {
    this.useCaseId = useCaseId;
    return this;
  }

   /**
   * the use case run against the results
   * @return useCaseId
  **/
  @ApiModelProperty(value = "the use case run against the results")
  public String getUseCaseId() {
    return useCaseId;
  }

  public void setUseCaseId(String useCaseId) {
    this.useCaseId = useCaseId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrichmentOutput enrichmentOutput = (EnrichmentOutput) o;
    return Objects.equals(this.annotations, enrichmentOutput.annotations) &&
        Objects.equals(this.text, enrichmentOutput.text) &&
        Objects.equals(this.useCaseId, enrichmentOutput.useCaseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, text, useCaseId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrichmentOutput {\n");
    
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    useCaseId: ").append(toIndentedString(useCaseId)).append("\n");
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

