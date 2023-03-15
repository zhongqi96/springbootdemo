/**
 *	create by tools 2019-1-15 17:16:56
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimCourseTopicTypeDao.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */

package com.tiilii.alldim.dao.dim.dimCourseTopicType;
import javax.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate; 
import com.tiilii.framework.core.dao.TemplateDao;
import com.tiilii.alldim.model.dim.dimCourseTopicType.DimCourseTopicType;
import org.springframework.stereotype.Repository;

@Repository
public class DimCourseTopicTypeDao extends TemplateDao<DimCourseTopicType> {
	@Resource(name="alldimTemplate")
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return this.template;
	}
}
