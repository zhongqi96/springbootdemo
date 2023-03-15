package com.tiilii.exampaper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tiilii.util.RedisLockUtils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @ClassName: RedisLockTest
 * @Description: 测试Redis锁
 * 	debugger处打个断点 先debug运行testLock01; 然后运行testLock02, 发现testLock01可以拿到锁， 而testLock02拿不到锁！
 * @author hunter
 * @date 2019年9月22日 下午10:39:02
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisLockTest {
    @Autowired
    private JedisPool jedisPool;

    private static final String LOCK_NAME = "LOCK_ID";
    private static final String PATH = "TEST_UUID/TEST";

	@Test
	public void testLock01() {
        Jedis jedis = jedisPool.getResource();
        boolean lockStatus = RedisLockUtils.tryLock(jedis, LOCK_NAME, PATH, 100000);
        if (lockStatus) {
            System.out.println("拿到锁了");
            // debugger
            RedisLockUtils.release(jedis, LOCK_NAME, PATH);
        } else {
            System.out.println("没有拿到锁");
        }
    }

	@Test
    public void testLock02() {
        Jedis jedis = jedisPool.getResource();
        boolean lockStatus = RedisLockUtils.tryLock(jedis, LOCK_NAME, PATH, 5000);
        if (lockStatus) {
            System.out.println("拿到锁了");
            RedisLockUtils.release(jedis, LOCK_NAME, PATH);
        } else {
            System.out.println("没有拿到锁");
        }
    }
}
