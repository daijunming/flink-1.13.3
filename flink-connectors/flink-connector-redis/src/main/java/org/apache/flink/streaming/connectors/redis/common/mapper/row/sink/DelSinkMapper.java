package org.apache.flink.streaming.connectors.redis.common.mapper.row.sink;

import org.apache.flink.configuration.ReadableConfig;
import org.apache.flink.streaming.connectors.redis.common.mapper.RedisCommand;

/** */
public class DelSinkMapper extends RowRedisSinkMapper {
    public DelSinkMapper() {
        super(RedisCommand.DEL);
    }

    public DelSinkMapper(ReadableConfig readableConfig) {
        super(RedisCommand.DEL, readableConfig);
    }
}
