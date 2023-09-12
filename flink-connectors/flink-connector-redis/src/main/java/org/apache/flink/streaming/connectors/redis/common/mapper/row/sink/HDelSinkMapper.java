package org.apache.flink.streaming.connectors.redis.common.mapper.row.sink;

import org.apache.flink.configuration.ReadableConfig;
import org.apache.flink.streaming.connectors.redis.common.mapper.RedisCommand;

/** */
public class HDelSinkMapper extends RowRedisSinkMapper {
    public HDelSinkMapper() {
        super(RedisCommand.HDEL);
    }

    public HDelSinkMapper(ReadableConfig readableConfig) {
        super(RedisCommand.HDEL, readableConfig);
    }
}
