package org.apache.flink.streaming.connectors.redis.common.mapper;


public enum RedisOperationType {
    /** query value from redis. */
    QUERY,
    /** del member at key. */
    DEL,
    /** add member at key. */
    INSERT,
    /** incr or decr at key. */
    ACC
}
