/**
 *	create by tools 2019-1-15 17:16:56
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimCourse.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimCourse;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_course")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimCourse implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_COURSEID = "courseId";
	public static final String FIELD_COURSENAME = "courseName";
	public static final String FIELD_DEGREE = "degree";
	public static final String FIELD_PARENTID = "parentId";
	public static final String FIELD_COURSEIMG = "courseImg";
	public static final String FIELD_COURSEDESC = "courseDesc";

	@Column(name="course_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String courseId;

	@Column(name="course_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String courseName;

	@Column(name="degree", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int degree;

	@Column(name="parent_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String parentId;

	@Column(name="course_img", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String courseImg;

	@Column(name="course_desc", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String courseDesc;

	public String getCourseId(){

			return this.courseId;
	}

	public void setCourseId(String courseId){
		this.courseId=courseId;
	}

	public String getCourseName(){

			return this.courseName;
	}

	public void setCourseName(String courseName){
		this.courseName=courseName;
	}

	public int getDegree(){

			return this.degree;
	}

	public void setDegree(int degree){
		this.degree=degree;
	}

	public String getParentId(){

			return this.parentId;
	}

	public void setParentId(String parentId){
		this.parentId=parentId;
	}

	public String getCourseImg(){

			return this.courseImg;
	}

	public void setCourseImg(String courseImg){
		this.courseImg=courseImg;
	}

	public String getCourseDesc(){

			return this.courseDesc;
	}

	public void setCourseDesc(String courseDesc){
		this.courseDesc=courseDesc;
	}

}
