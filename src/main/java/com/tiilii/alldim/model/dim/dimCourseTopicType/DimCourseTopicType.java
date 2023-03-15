/**
 *	create by tools 2019-1-15 17:16:56
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimCourseTopicType.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimCourseTopicType;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_course_topic_type")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimCourseTopicType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_COURSEID = "courseId";
	public static final String FIELD_TOPICTYPEID = "topicTypeId";
	public static final String FIELD_ISSINGLEDIFFICULTY = "isSingleDifficulty";

	@Column(name="course_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String courseId;

	@Column(name="topic_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String topicTypeId;
	
	@Column(name="is_single_difficulty", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String isSingleDifficulty;

	public String getCourseId(){

			return this.courseId;
	}

	public void setCourseId(String courseId){
		this.courseId=courseId;
	}

	public String getTopicTypeId(){

			return this.topicTypeId;
	}

	public void setTopicTypeId(String topicTypeId){
		this.topicTypeId=topicTypeId;
	}

	public String getIsSingleDifficulty() {
		return isSingleDifficulty;
	}

	public void setIsSingleDifficulty(String isSingleDifficulty) {
		this.isSingleDifficulty = isSingleDifficulty;
	}

	

}
