/**
 *	create by tools 2019-1-15 17:16:57
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimExamScoreStatus.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimExamScoreStatus;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_exam_score_status")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimExamScoreStatus implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_EXAMSCORESTATUSID = "examScoreStatusId";
	public static final String FIELD_EXAMSCORESTATUSNAME = "examScoreStatusName";

	@Column(name="exam_score_status_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String examScoreStatusId;

	@Column(name="exam_score_status_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String examScoreStatusName;

	public String getExamScoreStatusId(){

			return this.examScoreStatusId;
	}

	public void setExamScoreStatusId(String examScoreStatusId){
		this.examScoreStatusId=examScoreStatusId;
	}

	public String getExamScoreStatusName(){

			return this.examScoreStatusName;
	}

	public void setExamScoreStatusName(String examScoreStatusName){
		this.examScoreStatusName=examScoreStatusName;
	}

}
