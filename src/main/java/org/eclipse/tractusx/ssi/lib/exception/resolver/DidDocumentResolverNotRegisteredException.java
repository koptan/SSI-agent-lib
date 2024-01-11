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

/** The type Did document resolver not registered exception. */
public class DidDocumentResolverNotRegisteredException extends Exception {

  
  private static final long serialVersionUID = 1101625710675168299L;
  /**
   * Instantiates a new Did document resolver not registered exception.
   *
   * @param didMethod the did method
   */
  public DidDocumentResolverNotRegisteredException(DidMethod didMethod) {
    super(String.format("No DID document resolver registered for DID method '%s'", didMethod));
  }

  public DidDocumentResolverNotRegisteredException(String message) {
    super(message);
  }

  public DidDocumentResolverNotRegisteredException(String message, Throwable cause) {
    super(message, cause);
  }

  public DidDocumentResolverNotRegisteredException(Throwable cause) {
    super(cause);
  }

  public DidDocumentResolverNotRegisteredException(
      String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
