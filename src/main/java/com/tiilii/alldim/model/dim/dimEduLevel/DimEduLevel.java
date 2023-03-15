/**
 *	create by tools 2019-1-15 17:16:56
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimEduLevel.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimEduLevel;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_edu_level")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimEduLevel implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_EDULEVELID = "eduLevelId";
	public static final String FIELD_EDULEVELNAME = "eduLevelName";
	public static final String FIELD_DEGREE = "degree";
	public static final String FIELD_PARENTID = "parentId";

	@Column(name="edu_level_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String eduLevelId;

	@Column(name="edu_level_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String eduLevelName;

	@Column(name="degree", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int degree;

	@Column(name="parent_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String parentId;

	public String getEduLevelId(){

			return this.eduLevelId;
	}

	public void setEduLevelId(String eduLevelId){
		this.eduLevelId=eduLevelId;
	}

	public String getEduLevelName(){

			return this.eduLevelName;
	}

	public void setEduLevelName(String eduLevelName){
		this.eduLevelName=eduLevelName;
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

}
