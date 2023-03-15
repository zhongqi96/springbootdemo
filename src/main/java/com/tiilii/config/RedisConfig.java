package com.tiilii.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @ClassName: RedisConfig
 * @Description: Redis 配置
 * @author hunter
 * @date 2019年9月22日 下午10:31:57
 *
 */
@Configuration
@ConfigurationProperties(prefix = "spring.redis")
public class RedisConfig extends CachingConfigurerSupport {
	private static final Logger logger = LoggerFactory.getLogger(ExecutorConfig.class);

	@Value("${spring.redis.host}")
	private String host;
	@Value("${spring.redis.port}")
	private int port;
	@Value("${spring.redis.password}")
	private String password;
	@Value("${spring.redis.timeout}")
	private int timeout;

	@SuppressWarnings("unused")
	@Bean
	public JedisPool redisPoolFactory() {
		logger.info("start initRedisPool");
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		JedisPool pool = null;
		if (StringUtils.isEmpty(password)) {
			pool = new JedisPool(jedisPoolConfig, host, port, timeout);
		} else {
			pool = new JedisPool(jedisPoolConfig, host, port, timeout, password);
		}
		if (pool == null) {
			logger.error("failed initRedisPool");
			return pool;
		}
		logger.info("end initRedisPool");
		return pool;
	}

	@Bean(name = "redisTemplate")
	public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
		logger.info("start redisTemplate");
		RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(redisConnectionFactory);

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setVisibility(PropertyAccessor.ALL, Visibility.ANY);
		objectMapper.enableDefaultTyping(DefaultTyping.NON_FINAL);

		Jackson2JsonRedisSerializer<Object> jsonRedisSerializer = new Jackson2JsonRedisSerializer<>(Object.class);
		jsonRedisSerializer.setObjectMapper(objectMapper);
		redisTemplate.setDefaultSerializer(jsonRedisSerializer);

		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.afterPropertiesSet();
		logger.info("end redisTemplate");
		return redisTemplate;
	}
}