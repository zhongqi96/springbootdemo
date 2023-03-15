/**
 *	create by tools 2019-1-15 17:16:57
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimFamily.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimFamily;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_family")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimFamily implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_FAMILYID = "familyId";
	public static final String FIELD_FAMILYNAME = "familyName";

	@Column(name="family_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String familyId;

	@Column(name="family_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String familyName;

	public String getFamilyId(){

			return this.familyId;
	}

	public void setFamilyId(String familyId){
		this.familyId=familyId;
	}

	public String getFamilyName(){

			return this.familyName;
	}

	public void setFamilyName(String familyName){
		this.familyName=familyName;
	}

}
