/**
 *	create by tools 2019-1-15 17:16:59
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimStudyTopicErrorType.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimStudyTopicErrorType;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_study_topic_error_type")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimStudyTopicErrorType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_STUDYTOPICERRORTYPEID = "studyTopicErrorTypeId";
	public static final String FIELD_STUDYTOPICERRORTYPENAME = "studyTopicErrorTypeName";

	@Column(name="study_topic_error_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String studyTopicErrorTypeId;

	@Column(name="study_topic_error_type_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String studyTopicErrorTypeName;

	public String getStudyTopicErrorTypeId(){

			return this.studyTopicErrorTypeId;
	}

	public void setStudyTopicErrorTypeId(String studyTopicErrorTypeId){
		this.studyTopicErrorTypeId=studyTopicErrorTypeId;
	}

	public String getStudyTopicErrorTypeName(){

			return this.studyTopicErrorTypeName;
	}

	public void setStudyTopicErrorTypeName(String studyTopicErrorTypeName){
		this.studyTopicErrorTypeName=studyTopicErrorTypeName;
	}

}
