package com.tiilii.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @ClassName: RedisSessionConfig
 * @Description: 开启spring session支持
 * @author hunter
 * @date 2019年9月27日 下午3:32:38
 *
 */
@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {
}
