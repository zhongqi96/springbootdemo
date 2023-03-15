/**
 *	create by tools 2019-1-15 17:16:58
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimNationality.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimNationality;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_nationality")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimNationality implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_NATIONALITYID = "nationalityId";
	public static final String FIELD_NATIONALITYNAME = "nationalityName";

	@Column(name="nationality_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String nationalityId;

	@Column(name="nationality_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String nationalityName;

	public String getNationalityId(){

			return this.nationalityId;
	}

	public void setNationalityId(String nationalityId){
		this.nationalityId=nationalityId;
	}

	public String getNationalityName(){

			return this.nationalityName;
	}

	public void setNationalityName(String nationalityName){
		this.nationalityName=nationalityName;
	}

}
