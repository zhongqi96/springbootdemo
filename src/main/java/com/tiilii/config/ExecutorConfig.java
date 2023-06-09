package com.tiilii.config;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @ClassName: ExecutorConfig
 * @Description: 线程池配置
 * @author hunter
 * @date 2019年9月22日 下午10:50:24
 *
 */
@Configuration
@ConfigurationProperties(prefix = "threadpool")
@EnableAsync
public class ExecutorConfig {

	private static final Logger logger = LoggerFactory.getLogger(ExecutorConfig.class);

	@Value("${threadpool.core-pool-size}")
	private int corePoolSize;

	@Value("${threadpool.max-pool-size}")
	private int maxPoolSize;

	@Value("${threadpool.queue-capacity}")
	private int queueCapacity;

	@Value("${threadpool.thread-name-prefix}")
	private String threadNamePrefix;

	@Bean
	public Executor asyncServiceExecutor() {
		logger.info("start asyncServiceExecutor");
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		// 配置核心线程数
		executor.setCorePoolSize(corePoolSize);
		// 配置最大线程数
		executor.setMaxPoolSize(maxPoolSize);
		// 配置队列大小
		executor.setQueueCapacity(queueCapacity);
		// 配置线程池中的线程的名称前缀
		executor.setThreadNamePrefix(threadNamePrefix);

		// rejection-policy：当pool已经达到max size的时候，如何处理新任务
		// CALLER_RUNS：不在新线程中执行任务，而是有调用者所在的线程来执行
		executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
		// 执行初始化
		executor.initialize();
		logger.info("end asyncServiceExecutor");
		return executor;
	}
}
