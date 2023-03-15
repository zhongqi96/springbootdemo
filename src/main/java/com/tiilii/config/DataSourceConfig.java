package com.tiilii.config;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @ClassName: DataSourceConfig
 * @Description: 多数据源配置
 * @author hunter
 * @date 2019年9月20日 下午11:09:09
 *
 */
@Configuration
public class DataSourceConfig {
	private static Logger logger = LoggerFactory.getLogger(DataSourceConfig.class);

	@Bean(name = "firstDataSource")
	@Qualifier("firstDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.first")
	public DataSource firstDataSource(DataSourceProperties properties) {
		logger.info("init first data source：{}", properties);
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "secondDataSource")
	@Qualifier("secondDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.second")
	public DataSource secondDataSource(DataSourceProperties properties) {
		logger.info("init second data source：{}", properties);
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "daluobTemplate")
	public JdbcTemplate daluobTemplate(@Qualifier("firstDataSource") DataSource dataSource) {
		logger.info("start init daluobTemplate");
		JdbcTemplate daluobTemplate = new JdbcTemplate(dataSource);
		logger.info("daluobTemplate init success");
		return daluobTemplate;
	}

	@Bean(name = "alldimTemplate")
	public JdbcTemplate alldimTemplate(@Qualifier("secondDataSource") DataSource dataSource) {
		logger.info("start init alldimTemplate");
		JdbcTemplate alldimTemplate = new JdbcTemplate(dataSource);
		logger.info("alldimTemplate init success");
		return alldimTemplate;
	}
}