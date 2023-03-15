package com.tiilii.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class ConfigPropertiesUtil {

	/**
	 * 
	 * @Title: proName
	 * @Description: 获取指定配置文件的值
	 * @param path
	 * @return
	 * @throws UnsupportedEncodingException
	 *             参数
	 * @return Properties 返回类型
	 * @author hunter
	 * @date 2019年9月25日
	 */
	public static Properties proName(String path) throws UnsupportedEncodingException {
		Properties prop = new Properties();
		try {
			String classesPath = getClassesPath();
			File configFile = new File(classesPath + path);
			if (configFile != null && configFile.exists()) {
				prop.load(new FileInputStream(configFile));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}

	/**
	 * 
	 * @Title: getClassesPath
	 * @Description: 获取classes路径
	 * @return 参数
	 * @return String 返回类型
	 * @author hunter
	 * @date 2019年9月25日
	 */
	public static String getClassesPath() {
		String classesPath = ConfigPropertiesUtil.class.getClassLoader().getResource("").getFile();
		// .substring(1)是为了去掉最前的"/",如果linux环境去掉"/"就不能正确获取路径
		// classesPath = classesPath.substring(1);
		return classesPath;
	}
	// 获取内容如下：D:/apacheTomcat/apache-tomcat-7.0.59/webapps/test/WEB-INF/classes/

	/**
	 * @Title: main
	 * @Description: 测试， 在src/main/resources下放下wsdl.properties
	 * @param args
	 *            参数
	 * @return void 返回类型
	 * @author hunter
	 * @throws UnsupportedEncodingException
	 * @date 2019年9月25日
	 */

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		Properties properties = ConfigPropertiesUtil.proName("wsdl.properties");
		System.out.println(properties.get("fs_wsdl"));
	}
}
