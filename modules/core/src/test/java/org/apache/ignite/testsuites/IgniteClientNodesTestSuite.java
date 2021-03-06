/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.testsuites;

import junit.framework.TestSuite;
import org.apache.ignite.internal.processors.cache.distributed.IgniteCacheClientNodeConcurrentStart;
import org.apache.ignite.internal.processors.cache.distributed.IgniteCacheClientReconnectTest;
import org.apache.ignite.internal.processors.cache.distributed.IgniteCacheManyClientsTest;

/**
 *
 */
public class IgniteClientNodesTestSuite extends TestSuite {
    /**
     * @return Test suite.
     * @throws Exception In case of error.
     */
    public static TestSuite suite() throws Exception {
        TestSuite suite = new TestSuite("Ignite Client Nodes Reconnect Test Suite");

        suite.addTest(IgniteClientReconnectTestSuite.suite());

        suite.addTestSuite(IgniteCacheManyClientsTest.class);
        suite.addTestSuite(IgniteCacheClientNodeConcurrentStart.class);
        suite.addTestSuite(IgniteCacheClientReconnectTest.class);

        return suite;
    }
}