package com.tiilii.exampaper;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import org.junit.Test;

import com.tiilii.framework.core.exception.SystemException;
import com.tiilii.util.ConfigPropertiesUtil;

/**
 * @ClassName: ConfigPropertiesUtilTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author hunter
 * @date 2019年9月25日 上午9:53:19
 *
 */
public class ConfigPropertiesUtilTest extends BaseSpringBootTest {

	@Test
	public void proNameTest() throws SystemException, UnsupportedEncodingException {
		Properties properties = ConfigPropertiesUtil.proName("wsdl.properties");
		System.out.println(properties.get("fs_wsdl"));
	}
}
