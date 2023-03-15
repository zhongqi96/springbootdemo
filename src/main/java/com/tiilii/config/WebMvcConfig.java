package com.tiilii.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @ClassName: WebMvcConfig
 * @Description: Web配置
 * @author hunter
 * @date 2019年9月21日 下午5:55:31
 *
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// 设定静态文件路径，js,css等
		// 注意这里配置 applicaiton.properties中spring.mvc.static-path-patter配置不生效
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
		super.addResourceHandlers(registry);
	}
}
