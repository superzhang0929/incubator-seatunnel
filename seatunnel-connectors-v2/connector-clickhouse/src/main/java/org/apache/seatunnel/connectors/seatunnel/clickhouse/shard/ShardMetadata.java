/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.seatunnel.connectors.seatunnel.clickhouse.shard;

import java.io.Serializable;
import java.util.Objects;

public class ShardMetadata implements Serializable {

    private static final long serialVersionUID = -1L;

    private String shardKey;
    private String shardKeyType;
    private String database;
    private String table;
    private boolean splitMode;
    private Shard defaultShard;
    private String username;
    private String password;

    public ShardMetadata(String shardKey,
                         String shardKeyType,
                         String database,
                         String table,
                         boolean splitMode,
                         Shard defaultShard,
                         String username,
                         String password) {
        this.shardKey = shardKey;
        this.shardKeyType = shardKeyType;
        this.database = database;
        this.table = table;
        this.splitMode = splitMode;
        this.defaultShard = defaultShard;
        this.username = username;
        this.password = password;
    }

    public String getShardKey() {
        return shardKey;
    }

    public void setShardKey(String shardKey) {
        this.shardKey = shardKey;
    }

    public String getShardKeyType() {
        return shardKeyType;
    }

    public void setShardKeyType(String shardKeyType) {
        this.shardKeyType = shardKeyType;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public boolean getSplitMode() {
        return splitMode;
    }

    public void setSplitMode(boolean splitMode) {
        this.splitMode = splitMode;
    }

    public Shard getDefaultShard() {
        return defaultShard;
    }

    public void setDefaultShard(Shard defaultShard) {
        this.defaultShard = defaultShard;
    }

    public boolean isSplitMode() {
        return splitMode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShardMetadata that = (ShardMetadata) o;
        return splitMode == that.splitMode
                && Objects.equals(shardKey, that.shardKey)
                && Objects.equals(shardKeyType, that.shardKeyType)
                && Objects.equals(database, that.database)
                && Objects.equals(table, that.table)
                && Objects.equals(defaultShard, that.defaultShard)
                && Objects.equals(username, that.username)
                && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shardKey, shardKeyType, database, table, splitMode, defaultShard, username, password);
    }
}
