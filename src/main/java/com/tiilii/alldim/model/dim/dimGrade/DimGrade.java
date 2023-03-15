/**
 *	create by tools 2019-1-15 17:16:57
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimGrade.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimGrade;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_grade")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimGrade implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_GRADEID = "gradeId";
	public static final String FIELD_GRADENAME = "gradeName";
	public static final String FIELD_GRADEALIAS = "gradeAlias";
	public static final String FIELD_DEGREE = "degree";
	public static final String FIELD_PARENTID = "parentId";

	@Column(name="grade_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String gradeId;

	@Column(name="grade_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String gradeName;

	@Column(name="grade_alias", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String gradeAlias;

	@Column(name="degree", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int degree;

	@Column(name="parent_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String parentId;

	public String getGradeId(){

			return this.gradeId;
	}

	public void setGradeId(String gradeId){
		this.gradeId=gradeId;
	}

	public String getGradeName(){

			return this.gradeName;
	}

	public void setGradeName(String gradeName){
		this.gradeName=gradeName;
	}

	public String getGradeAlias(){

			return this.gradeAlias;
	}

	public void setGradeAlias(String gradeAlias){
		this.gradeAlias=gradeAlias;
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
