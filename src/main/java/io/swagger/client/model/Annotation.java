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
import io.swagger.client.model.Coding;
import io.swagger.client.model.Quantity;
import io.swagger.client.model.Range;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Annotation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-01T09:30:57.014Z")
public class Annotation {
  @SerializedName("coding")
  private List<Coding> coding = null;

  @SerializedName("endIndex")
  private Integer endIndex = null;

  @SerializedName("negated")
  private Boolean negated = null;

  @SerializedName("properties")
  private Map<String, List<String>> properties = null;

  @SerializedName("quantity")
  private Quantity quantity = null;

  @SerializedName("range")
  private Range range = null;

  @SerializedName("score")
  private Double score = null;

  @SerializedName("startIndex")
  private Integer startIndex = null;

  @SerializedName("statement")
  private String statement = null;

  @SerializedName("type")
  private String type = null;

  public Annotation coding(List<Coding> coding) {
    this.coding = coding;
    return this;
  }

  public Annotation addCodingItem(Coding codingItem) {
    if (this.coding == null) {
      this.coding = new ArrayList<Coding>();
    }
    this.coding.add(codingItem);
    return this;
  }

   /**
   * the extracted concepts
   * @return coding
  **/
  @ApiModelProperty(value = "the extracted concepts")
  public List<Coding> getCoding() {
    return coding;
  }

  public void setCoding(List<Coding> coding) {
    this.coding = coding;
  }

  public Annotation endIndex(Integer endIndex) {
    this.endIndex = endIndex;
    return this;
  }

   /**
   * Get endIndex
   * @return endIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getEndIndex() {
    return endIndex;
  }

  public void setEndIndex(Integer endIndex) {
    this.endIndex = endIndex;
  }

  public Annotation negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

   /**
   * indicator if the annotation was negated
   * @return negated
  **/
  @ApiModelProperty(example = "false", value = "indicator if the annotation was negated")
  public Boolean isNegated() {
    return negated;
  }

  public void setNegated(Boolean negated) {
    this.negated = negated;
  }

  public Annotation properties(Map<String, List<String>> properties) {
    this.properties = properties;
    return this;
  }

  public Annotation putPropertiesItem(String key, List<String> propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, List<String>>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * extra metadata and annotator-specific properties
   * @return properties
  **/
  @ApiModelProperty(value = "extra metadata and annotator-specific properties")
  public Map<String, List<String>> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, List<String>> properties) {
    this.properties = properties;
  }

  public Annotation quantity(Quantity quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * a numeric value extracted from the text
   * @return quantity
  **/
  @ApiModelProperty(value = "a numeric value extracted from the text")
  public Quantity getQuantity() {
    return quantity;
  }

  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }

  public Annotation range(Range range) {
    this.range = range;
    return this;
  }

   /**
   * a range of numeric values extracted from the text
   * @return range
  **/
  @ApiModelProperty(value = "a range of numeric values extracted from the text")
  public Range getRange() {
    return range;
  }

  public void setRange(Range range) {
    this.range = range;
  }

  public Annotation score(Double score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(value = "")
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public Annotation startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

   /**
   * Get startIndex
   * @return startIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public Annotation statement(String statement) {
    this.statement = statement;
    return this;
  }

   /**
   * the extracted text
   * @return statement
  **/
  @ApiModelProperty(value = "the extracted text")
  public String getStatement() {
    return statement;
  }

  public void setStatement(String statement) {
    this.statement = statement;
  }

  public Annotation type(String type) {
    this.type = type;
    return this;
  }

   /**
   * the type of annotation returned
   * @return type
  **/
  @ApiModelProperty(value = "the type of annotation returned")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Annotation annotation = (Annotation) o;
    return Objects.equals(this.coding, annotation.coding) &&
        Objects.equals(this.endIndex, annotation.endIndex) &&
        Objects.equals(this.negated, annotation.negated) &&
        Objects.equals(this.properties, annotation.properties) &&
        Objects.equals(this.quantity, annotation.quantity) &&
        Objects.equals(this.range, annotation.range) &&
        Objects.equals(this.score, annotation.score) &&
        Objects.equals(this.startIndex, annotation.startIndex) &&
        Objects.equals(this.statement, annotation.statement) &&
        Objects.equals(this.type, annotation.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coding, endIndex, negated, properties, quantity, range, score, startIndex, statement, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Annotation {\n");
    
    sb.append("    coding: ").append(toIndentedString(coding)).append("\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
    sb.append("    negated: ").append(toIndentedString(negated)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

