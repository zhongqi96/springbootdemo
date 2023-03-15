/**
 *	create by tools 2019-1-15 17:16:56
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimBlood.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimBlood;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_blood")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimBlood implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_BLOODID = "bloodId";
	public static final String FIELD_BLOODNAME = "bloodName";
	public static final String FIELD_BLOODALIAS = "bloodAlias";

	@Column(name="blood_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String bloodId;

	@Column(name="blood_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String bloodName;

	@Column(name="blood_alias", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String bloodAlias;

	public String getBloodId(){

			return this.bloodId;
	}

	public void setBloodId(String bloodId){
		this.bloodId=bloodId;
	}

	public String getBloodName(){

			return this.bloodName;
	}

	public void setBloodName(String bloodName){
		this.bloodName=bloodName;
	}

	public String getBloodAlias(){

			return this.bloodAlias;
	}

	public void setBloodAlias(String bloodAlias){
		this.bloodAlias=bloodAlias;
	}

}
