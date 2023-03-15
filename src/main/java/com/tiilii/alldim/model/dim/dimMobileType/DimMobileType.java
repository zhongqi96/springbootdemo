/**
 *	create by tools 2019-1-15 17:16:58
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimMobileType.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimMobileType;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_mobile_type")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimMobileType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_MOBILETYPEID = "mobileTypeId";
	public static final String FIELD_MOBILETYPENAME = "mobileTypeName";

	@Column(name="mobile_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String mobileTypeId;

	@Column(name="mobile_type_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String mobileTypeName;

	public String getMobileTypeId(){

			return this.mobileTypeId;
	}

	public void setMobileTypeId(String mobileTypeId){
		this.mobileTypeId=mobileTypeId;
	}

	public String getMobileTypeName(){

			return this.mobileTypeName;
	}

	public void setMobileTypeName(String mobileTypeName){
		this.mobileTypeName=mobileTypeName;
	}

}
