package com.tiilii.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.CallableStatementCreator;
import org.springframework.jdbc.core.JdbcTemplate;

import com.tiilii.framework.core.exception.SystemException;

/**
 * @ClassName: CallProcedureUtil
 * @Description: 调用存储过程通用工具
 * @author hunter
 * @date 2019年9月24日 下午1:59:31
 *
 */
public class CallProcedureUtil {

	/**
	 * 
	 * @Title: runCallSql
	 * @Description: 调存储过程通用方法
	 * @param template 
	 * @param sql
	 * @param params
	 * @return
	 * @throws SystemException    参数
	 * @return List<Map<String,Object>>    返回类型
	 * @author hunter
	 * @date 2019年9月24日
	 */
	public static List<Map<String, Object>> runCallSql(final JdbcTemplate template, final String sql, final Object... params)
			throws SystemException {
		List<Map<String, Object>> resultMapList = (List<Map<String, Object>>) template
				.execute(new CallableStatementCreator() {
					public CallableStatement createCallableStatement(Connection con) throws SQLException {
						CallableStatement call = con.prepareCall(sql);
						int index = 1;
						for (Object param : params) {
							call.setObject(index, param);
							index++;
						}
						return call;
					}
				}, new CallableStatementCallback<List<Map<String, Object>>>() {
					public List<Map<String, Object>> doInCallableStatement(CallableStatement cs)
							throws SQLException, DataAccessException {
						List<Map<String, Object>> resultMapList = new ArrayList<Map<String, Object>>();
						cs.execute();
						while (true) {
							int rowCount = cs.getUpdateCount();
							if (rowCount > 0) {
								cs.getMoreResults();
								continue;
							}
							if (rowCount == 0) {
								cs.getMoreResults();
								continue;
							}
							ResultSet rs = cs.getResultSet();
							if (rs != null) {
								ResultSetMetaData metaData = rs.getMetaData();
								while (rs.next()) {
									Map<String, Object> map = new HashMap<String, Object>();
									for (int i = 0; i < metaData.getColumnCount(); i++) {
										String columnName = metaData.getColumnName(i + 1);
										String columnLabel = metaData.getColumnLabel(i + 1);
										Object value = rs.getObject(i + 1);
										map.put(columnLabel == null ? columnName : columnLabel, value);
									}
									resultMapList.add(map);
								}
							}
							break;
						}
						return resultMapList;
					}
				});
		return resultMapList;
	}
}
