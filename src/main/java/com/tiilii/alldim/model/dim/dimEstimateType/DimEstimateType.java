/**
 *	create by tools 2019-1-15 17:16:57
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimEstimateType.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimEstimateType;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_estimate_type")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimEstimateType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_ESTIMATETYPEID = "estimateTypeId";
	public static final String FIELD_ESTIMATETYPENAME = "estimateTypeName";
	public static final String FIELD_DEGREE = "degree";
	public static final String FIELD_PARENTID = "parentId";
	public static final String FIELD_ESTIMATETYPEDESC = "estimateTypeDesc";

	@Column(name="estimate_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String estimateTypeId;

	@Column(name="estimate_type_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String estimateTypeName;

	@Column(name="degree", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int degree;

	@Column(name="parent_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String parentId;

	@Column(name="estimate_type_desc", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String estimateTypeDesc;

	public String getEstimateTypeId(){

			return this.estimateTypeId;
	}

	public void setEstimateTypeId(String estimateTypeId){
		this.estimateTypeId=estimateTypeId;
	}

	public String getEstimateTypeName(){

			return this.estimateTypeName;
	}

	public void setEstimateTypeName(String estimateTypeName){
		this.estimateTypeName=estimateTypeName;
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

	public String getEstimateTypeDesc(){

			return this.estimateTypeDesc;
	}

	public void setEstimateTypeDesc(String estimateTypeDesc){
		this.estimateTypeDesc=estimateTypeDesc;
	}

}
