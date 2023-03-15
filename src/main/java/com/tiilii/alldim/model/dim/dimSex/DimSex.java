/**
 *	create by tools 2019-1-15 17:16:58
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimSex.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimSex;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_sex")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimSex implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_SEXID = "sexId";
	public static final String FIELD_SEXNAME = "sexName";

	@Column(name="sex_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String sexId;

	@Column(name="sex_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String sexName;

	public String getSexId(){

			return this.sexId;
	}

	public void setSexId(String sexId){
		this.sexId=sexId;
	}

	public String getSexName(){

			return this.sexName;
	}

	public void setSexName(String sexName){
		this.sexName=sexName;
	}

}
