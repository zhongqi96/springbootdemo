/**
 *	create by tools 2019-1-15 17:16:57
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimExamStatus.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimExamStatus;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_exam_status")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimExamStatus implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_EXAMSTATUSID = "examStatusId";
	public static final String FIELD_EXAMSTATUSNAME = "examStatusName";

	@Column(name="exam_status_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String examStatusId;

	@Column(name="exam_status_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String examStatusName;

	public String getExamStatusId(){

			return this.examStatusId;
	}

	public void setExamStatusId(String examStatusId){
		this.examStatusId=examStatusId;
	}

	public String getExamStatusName(){

			return this.examStatusName;
	}

	public void setExamStatusName(String examStatusName){
		this.examStatusName=examStatusName;
	}

}
