/**
 *	create by tools 2019-1-15 17:16:56
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimCourseGrade.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimCourseGrade;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_course_grade")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimCourseGrade implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_COURSEID = "courseId";
	public static final String FIELD_GRADEID = "gradeId";

	@Column(name="course_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String courseId;

	@Column(name="grade_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String gradeId;

	public String getCourseId(){

			return this.courseId;
	}

	public void setCourseId(String courseId){
		this.courseId=courseId;
	}

	public String getGradeId(){

			return this.gradeId;
	}

	public void setGradeId(String gradeId){
		this.gradeId=gradeId;
	}

}
