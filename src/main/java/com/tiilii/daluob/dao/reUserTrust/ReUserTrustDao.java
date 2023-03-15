/**
 *	create by tools 2018-10-24 16:25:48
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：ReUserTrustDao.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */

package com.tiilii.daluob.dao.reUserTrust;
import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tiilii.daluob.model.reUserTrust.ReUserTrust;
import com.tiilii.framework.core.dao.TemplateDao;

@Repository
public class ReUserTrustDao extends TemplateDao<ReUserTrust> {
	@Resource(name="daluobTemplate")
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return this.template;
	}
}
