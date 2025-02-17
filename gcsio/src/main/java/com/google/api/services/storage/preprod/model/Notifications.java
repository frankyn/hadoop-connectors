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
 * A list of notification subscriptions.
 *
 * <p>This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Storage JSON API. For a detailed explanation
 * see: <a
 * href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Notifications extends com.google.api.client.json.GenericJson {

  /** The list of items. The value may be {@code null}. */
  @com.google.api.client.util.Key private java.util.List<Notification> items;

  static {
    // hack to force ProGuard to consider Notification used, since otherwise it would be stripped
    // out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Notification.class);
  }

  /**
   * The kind of item this is. For lists of notifications, this is always storage#notifications. The
   * value may be {@code null}.
   */
  @com.google.api.client.util.Key private String kind;

  /**
   * The list of items.
   *
   * @return value or {@code null} for none
   */
  public java.util.List<Notification> getItems() {
    return items;
  }

  /**
   * The list of items.
   *
   * @param items items or {@code null} for none
   */
  public Notifications setItems(java.util.List<Notification> items) {
    this.items = items;
    return this;
  }

  /**
   * The kind of item this is. For lists of notifications, this is always storage#notifications.
   *
   * @return value or {@code null} for none
   */
  public String getKind() {
    return kind;
  }

  /**
   * The kind of item this is. For lists of notifications, this is always storage#notifications.
   *
   * @param kind kind or {@code null} for none
   */
  public Notifications setKind(String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public Notifications set(String fieldName, Object value) {
    return (Notifications) super.set(fieldName, value);
  }

  @Override
  public Notifications clone() {
    return (Notifications) super.clone();
  }
}
