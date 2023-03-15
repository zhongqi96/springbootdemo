/**
 *	create by tools 2019-1-15 17:16:58
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimSchoolRecord.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimSchoolRecord;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_school_record")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimSchoolRecord implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_SCHOOLRECORDID = "schoolRecordId";
	public static final String FIELD_SCHOOLRECORDNAME = "schoolRecordName";
	public static final String FIELD_DEGREE = "degree";
	public static final String FIELD_PARENTID = "parentId";

	@Column(name="school_record_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String schoolRecordId;

	@Column(name="school_record_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String schoolRecordName;

	@Column(name="degree", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int degree;

	@Column(name="parent_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String parentId;

	public String getSchoolRecordId(){

			return this.schoolRecordId;
	}

	public void setSchoolRecordId(String schoolRecordId){
		this.schoolRecordId=schoolRecordId;
	}

	public String getSchoolRecordName(){

			return this.schoolRecordName;
	}

	public void setSchoolRecordName(String schoolRecordName){
		this.schoolRecordName=schoolRecordName;
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
