/**
 *	Develop by Calen at  2012-5-8 下午02:51:54
 *	Copyright © 2011 武汉市天量数据技术有限公司
 *	注意：RequestUtil.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */

package com.tiilii.util;

import java.lang.reflect.Type;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;



public class RequestUtil {
	/**
	 * 获得请求参数，如果参数值为null，则返回默认值
	 * 
	 * @param request
	 * @param paramName
	 * @param defaultValue
	 * @return {@link String}
	 */
	public static String getParamValue(HttpServletRequest request,
			String paramName, String defaultValue) {
		String value = defaultValue;
		if (request.getParameter(paramName) != null
				&& request.getParameter(paramName) != "") {
			value = request.getParameter(paramName);
		}
		return value;
	}

	/**
	 * 获得请求参数，如果参数值为null，则返回默认值
	 * 
	 * @param request
	 * @param paramName
	 * @param defaultValue
	 * @return {@link Integer}
	 */
	public static int getParamValue(HttpServletRequest request,
			String paramName, int defaultValue) {
		int value = defaultValue;
		if (request.getParameter(paramName) != null) {
			value = Integer.parseInt(request.getParameter(paramName));
		}

		return value;
	}


	/**
	 * 根据类中字段的属性，按照对应的方法在结果集中取数据<br>
	 * 这个方法需要扩展，目前只支持基本数据类型
	 * 
	 * @param t
	 * @param columnName
	 * @return {@link Object}
	 * @throws SQLException
	 */
	protected static Object getValueFromValue(Type t, String columnName,
			String value) throws Exception {

		String type = t.toString();
		try {
			if (type.equals("int") || type.equals("class java.lang.Integer")) {
				return (value == null || value.trim().equals("")) ? 0 : Integer
						.parseInt(value);
			} else if (type.equals("float")
					|| type.equals("class java.lang.Float")) {
				return (value == null || value.trim().equals("")) ? 0 : Float
						.parseFloat(value);
			} else if (type.equals("double")
					|| type.equals("class java.lang.Double")) {
				return (value == null || value.trim().equals("")) ? 0 : Double
						.parseDouble(value);
			} else if (type.equals("long")
					|| type.equals("class java.lang.Long")) {
				return (value == null || value.trim().equals("")) ? 0 : Long
						.parseLong(value);
			} else if (type.equals("class java.lang.String")) {
				return value;
			} else {
				return null;
			}
		} catch (Exception e) {
			throw new Exception("SQLException when get field:" + columnName
					+ "\n" + e);
		}

	}

}
