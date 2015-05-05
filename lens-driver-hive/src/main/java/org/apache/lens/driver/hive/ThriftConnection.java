/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.lens.driver.hive;

import java.io.Closeable;

import org.apache.lens.server.api.error.LensException;

import org.apache.hadoop.hive.conf.HiveConf;
import org.apache.hive.service.cli.CLIServiceClient;

/**
 * The Interface ThriftConnection.
 */
public interface ThriftConnection extends Closeable {

  /**
   * Gets the client.
   *
   * @return the client
   * @throws LensException the lens exception
   */
  CLIServiceClient getClient() throws LensException;

  /**
   * Initializes connection with conf.
   *
   * @param conf
   * @param user
   */
  void init(HiveConf conf, String user);
}
