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

package io.shardingsphere.transaction.common;

import io.shardingsphere.core.constant.TransactionType;
import io.shardingsphere.transaction.api.TransactionManager;
import io.shardingsphere.transaction.common.event.TransactionEvent;
import io.shardingsphere.transaction.common.event.LocalTransactionEvent;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Hold Transaction Context.
 *
 * @author zhaojun
 */
@NoArgsConstructor
@Getter
public final class TransactionContext {
    
    private TransactionManager transactionManager;
    
    private TransactionType transactionType = TransactionType.XA;
    
    private Class<? extends TransactionEvent> transactionEventClazz = LocalTransactionEvent.class;

    public TransactionContext(final TransactionManager transactionManager, final TransactionType transactionType, final Class<? extends TransactionEvent> clazz) {
        this.transactionManager = transactionManager;
        this.transactionType = transactionType;
        this.transactionEventClazz = clazz;
    }
}
