package com.tiilii;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.tiilii.listener.MyApplicationEnvironmentPreparedEventListener;
import com.tiilii.listener.WebContextListener;
/**
 * 
 * @ClassName: Application
 * @Description: 项目启动主类
 * @author hunter
 * @date 2019年9月23日 上午12:01:58
 *
 */
@EnableAutoConfiguration
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	private static Logger logger = Logger.getLogger(Application.class);

	/**
	 * Start
	 */
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.addListeners(new WebContextListener());
		app.addListeners(new MyApplicationEnvironmentPreparedEventListener());
		app.run(args);
		logger.info("SpringBoot Start Success");
	}

	/**
	 ** 需要把web项目打成war包部署到外部tomcat运行时需要改变启动方式    
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}

}
