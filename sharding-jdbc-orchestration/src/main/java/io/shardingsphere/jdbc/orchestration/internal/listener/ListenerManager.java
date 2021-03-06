/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingsphere.jdbc.orchestration.internal.listener;

import io.shardingsphere.core.jdbc.core.datasource.MasterSlaveDataSource;
import io.shardingsphere.core.jdbc.core.datasource.ShardingDataSource;

/**
 * Registry center's listener manager.
 *
 * @author caohao
 * @author panjuan
 */
public interface ListenerManager {
    
    /**
     * Start sharding datasource change listener.
     *
     * @param shardingDataSource sharding datasource
     */
    void start(ShardingDataSource shardingDataSource);
    
    
    /**
     * Start master-slave datasource change listener.
     *
     * @param masterSlaveDataSource master-slave datasource
     */
    void start(MasterSlaveDataSource masterSlaveDataSource);
    
    
    /**
     * Start proxy configuration change listener.
     *
     */
    void start();
}
