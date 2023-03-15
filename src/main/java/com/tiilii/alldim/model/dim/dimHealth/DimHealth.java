/**
 *	create by tools 2019-1-15 17:16:57
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimHealth.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimHealth;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_health")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimHealth implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_HEALTHID = "healthId";
	public static final String FIELD_HEALTHNAME = "healthName";
	public static final String FIELD_DEGREE = "degree";
	public static final String FIELD_PARENTID = "parentId";
	public static final String FIELD_HEALTHDESC = "healthDesc";

	@Column(name="health_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String healthId;

	@Column(name="health_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String healthName;

	@Column(name="degree", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int degree;

	@Column(name="parent_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String parentId;

	@Column(name="health_desc", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String healthDesc;

	public String getHealthId(){

			return this.healthId;
	}

	public void setHealthId(String healthId){
		this.healthId=healthId;
	}

	public String getHealthName(){

			return this.healthName;
	}

	public void setHealthName(String healthName){
		this.healthName=healthName;
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

	public String getHealthDesc(){

			return this.healthDesc;
	}

	public void setHealthDesc(String healthDesc){
		this.healthDesc=healthDesc;
	}

}
