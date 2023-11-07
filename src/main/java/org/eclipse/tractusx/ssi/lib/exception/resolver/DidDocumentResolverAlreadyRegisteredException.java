/*
 * ******************************************************************************
 * Copyright (c) 2021,2023 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 * *******************************************************************************
 */

package org.eclipse.tractusx.ssi.lib.exception.resolver;

import org.eclipse.tractusx.ssi.lib.model.did.DidMethod;

/** The type SSI did document resolver already registered exception. */
public class DidDocumentResolverAlreadyRegisteredException extends Exception {

  /**
   * Instantiates a new did document resolver already registered exception.
   *
   * @param message the message
   */
  public DidDocumentResolverAlreadyRegisteredException(DidMethod didMethod) {
    super(String.format("No DID document resolver registered for DID method '%s'", didMethod));
  }

  /**
   * Instantiates a new did document resolver already registered exception.
   *
   * @param message the message
   * @param cause the cause
   */
  public DidDocumentResolverAlreadyRegisteredException(String message) {
    super(message);
  }

  /**
   * Instantiates a new did document resolver already registered exception.
   *
   * @param cause the cause
   */
  public DidDocumentResolverAlreadyRegisteredException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Instantiates a new did document resolver already registered exception.
   *
   * @param message the message
   * @param cause the cause
   */
  public DidDocumentResolverAlreadyRegisteredException(Throwable cause) {
    super(cause);
  }

  /**
   * Instantiates a new did document resolver already registered exception.
   *
   * @param message the message
   * @param cause the cause
   * @param enableSuppression the enable suppression
   * @param writableStackTrace the writable stack trace
   */
  public DidDocumentResolverAlreadyRegisteredException(
      String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}