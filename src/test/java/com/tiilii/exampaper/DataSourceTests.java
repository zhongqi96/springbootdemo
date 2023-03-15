package com.tiilii.exampaper;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName: SpringbootJdbcApplicationTests
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author hunter
 * @date 2019年9月21日 上午11:37:14
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSourceTests {

	@Autowired 
	@Qualifier("firstDataSource")
	private DataSource firstDataSource;
	
	@Autowired 
	@Qualifier("secondDataSource")
	private DataSource secondDataSource;

	@Test
	public void contextLoads() {
		System.out.println("====>" + firstDataSource);
		System.out.println("====>" + secondDataSource);
	}
}
