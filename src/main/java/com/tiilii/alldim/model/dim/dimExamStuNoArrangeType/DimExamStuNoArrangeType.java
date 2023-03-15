/**
 *	create by tools 2019-1-15 17:16:57
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimExamStuNoArrangeType.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimExamStuNoArrangeType;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_exam_stu_no_arrange_type")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimExamStuNoArrangeType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_EXAMSTUNOARRANGETYPEID = "examStuNoArrangeTypeId";
	public static final String FIELD_EXAMSTUNOARRANGETYPENAME = "examStuNoArrangeTypeName";

	@Column(name="exam_stu_no_arrange_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String examStuNoArrangeTypeId;

	@Column(name="exam_stu_no_arrange_type_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String examStuNoArrangeTypeName;

	public String getExamStuNoArrangeTypeId(){

			return this.examStuNoArrangeTypeId;
	}

	public void setExamStuNoArrangeTypeId(String examStuNoArrangeTypeId){
		this.examStuNoArrangeTypeId=examStuNoArrangeTypeId;
	}

	public String getExamStuNoArrangeTypeName(){

			return this.examStuNoArrangeTypeName;
	}

	public void setExamStuNoArrangeTypeName(String examStuNoArrangeTypeName){
		this.examStuNoArrangeTypeName=examStuNoArrangeTypeName;
	}

}
