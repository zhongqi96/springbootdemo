package com.tiilii.util;

import java.util.Collections;

import redis.clients.jedis.Jedis;

/**
 * @ClassName: RedisUtils
 * @Description: Redis 锁工具
 * @author hunter
 * @date 2019年9月22日 下午10:35:20
 *
 */
public class RedisLockUtils {
    private static final String SET_IF_NOT_EXIST = "NX";
    private static final String SET_WITH_EXPIRE_TIME = "PX";
    private static final String LOCK_SUCCESS = "OK";
    private static final Long RELEASE_SUCCESS = 1L;

    /**
     * 
     * @Title: tryLock
     * @Description: 尝试获取锁
     * @param jedis
     * @param lockName
     * @param resourcePath
     * @param expireTime
     * @return    参数
     * @return boolean    返回类型
     * @author hunter
     * @date 2019年9月22日
     */
    public static boolean tryLock(Jedis jedis, String lockName, String resourcePath, int expireTime) {
        String result = jedis.set(lockName, resourcePath, SET_IF_NOT_EXIST, SET_WITH_EXPIRE_TIME, expireTime);
        if (LOCK_SUCCESS.equals(result)) {
            return true;
        }
        return false;
    }

    /**
     * 
     * @Title: release
     * @Description: 释放锁
     * @param jedis
     * @param lockName
     * @param resourcePath
     * @return    参数
     * @return boolean    返回类型
     * @author hunter
     * @date 2019年9月22日
     */
    public static boolean release(Jedis jedis, String lockName, String resourcePath) {
        String script = "if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', KEYS[1]) else return 0 end";
        Object result = jedis.eval(script, Collections.singletonList(lockName), Collections.singletonList(resourcePath));
        if (RELEASE_SUCCESS.equals(result)) {
            return true;
        }
        return false;
    }
}

