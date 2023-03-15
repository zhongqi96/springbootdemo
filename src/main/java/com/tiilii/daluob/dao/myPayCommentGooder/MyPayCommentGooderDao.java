/**
 *	create by tools 2019-2-28 14:05:47
 *	Copyright © 2018 武汉天量技术有限公司
 *	注意：MyPayCommentGooderDao.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */

package com.tiilii.daluob.dao.myPayCommentGooder;
import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tiilii.daluob.model.myPayCommentGooder.MyPayCommentGooder;
import com.tiilii.framework.core.dao.TemplateDao;

@Repository
public class MyPayCommentGooderDao extends TemplateDao<MyPayCommentGooder> {
	@Resource(name="daluobTemplate")
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return this.template;
	}
}
