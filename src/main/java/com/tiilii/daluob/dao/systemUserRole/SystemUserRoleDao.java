/**
 *	create by tools 2019-2-28 14:05:58
 *	Copyright © 2018 武汉天量技术有限公司
 *	注意：SystemUserRoleDao.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */

package com.tiilii.daluob.dao.systemUserRole;
import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tiilii.daluob.model.systemUserRole.SystemUserRole;
import com.tiilii.framework.core.dao.TemplateDao;

@Repository
public class SystemUserRoleDao extends TemplateDao<SystemUserRole> {
	@Resource(name="daluobTemplate")
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return this.template;
	}
}
