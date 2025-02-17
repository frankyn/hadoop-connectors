/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * Modify at your own risk.
 */

package com.google.api.services.storage.preprod.model;

/**
 * Represents an expression text. Example: title: "User account presence" description: "Determines
 * whether the request has a user account" expression: "size(request.user) > 0"
 *
 * <p>This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Storage JSON API. For a detailed explanation
 * see: <a
 * href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Expr extends com.google.api.client.json.GenericJson {

  /**
   * An optional description of the expression. This is a longer text which describes the
   * expression, e.g. when hovered over it in a UI. The value may be {@code null}.
   */
  @com.google.api.client.util.Key private String description;

  /**
   * Textual representation of an expression in Common Expression Language syntax. The application
   * context of the containing message determines which well-known feature set of CEL is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key private String expression;

  /**
   * An optional string indicating the location of the expression for error reporting, e.g. a file
   * name and a position in the file. The value may be {@code null}.
   */
  @com.google.api.client.util.Key private String location;

  /**
   * An optional title for the expression, i.e. a short string describing its purpose. This can be
   * used e.g. in UIs which allow to enter the expression. The value may be {@code null}.
   */
  @com.google.api.client.util.Key private String title;

  /**
   * An optional description of the expression. This is a longer text which describes the
   * expression, e.g. when hovered over it in a UI.
   *
   * @return value or {@code null} for none
   */
  public String getDescription() {
    return description;
  }

  /**
   * An optional description of the expression. This is a longer text which describes the
   * expression, e.g. when hovered over it in a UI.
   *
   * @param description description or {@code null} for none
   */
  public Expr setDescription(String description) {
    this.description = description;
    return this;
  }

  /**
   * Textual representation of an expression in Common Expression Language syntax. The application
   * context of the containing message determines which well-known feature set of CEL is supported.
   *
   * @return value or {@code null} for none
   */
  public String getExpression() {
    return expression;
  }

  /**
   * Textual representation of an expression in Common Expression Language syntax. The application
   * context of the containing message determines which well-known feature set of CEL is supported.
   *
   * @param expression expression or {@code null} for none
   */
  public Expr setExpression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * An optional string indicating the location of the expression for error reporting, e.g. a file
   * name and a position in the file.
   *
   * @return value or {@code null} for none
   */
  public String getLocation() {
    return location;
  }

  /**
   * An optional string indicating the location of the expression for error reporting, e.g. a file
   * name and a position in the file.
   *
   * @param location location or {@code null} for none
   */
  public Expr setLocation(String location) {
    this.location = location;
    return this;
  }

  /**
   * An optional title for the expression, i.e. a short string describing its purpose. This can be
   * used e.g. in UIs which allow to enter the expression.
   *
   * @return value or {@code null} for none
   */
  public String getTitle() {
    return title;
  }

  /**
   * An optional title for the expression, i.e. a short string describing its purpose. This can be
   * used e.g. in UIs which allow to enter the expression.
   *
   * @param title title or {@code null} for none
   */
  public Expr setTitle(String title) {
    this.title = title;
    return this;
  }

  @Override
  public Expr set(String fieldName, Object value) {
    return (Expr) super.set(fieldName, value);
  }

  @Override
  public Expr clone() {
    return (Expr) super.clone();
  }
}
