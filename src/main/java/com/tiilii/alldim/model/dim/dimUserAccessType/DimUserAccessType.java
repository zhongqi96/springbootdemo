/**
 *	create by tools 2019-1-15 17:16:59
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimUserAccessType.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimUserAccessType;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_user_access_type")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimUserAccessType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_USERACCESSTYPEID = "userAccessTypeId";
	public static final String FIELD_USERACCESSTYPENAME = "userAccessTypeName";
	public static final String FIELD_DISPINDEX1 = "dispIndex1";

	@Column(name="user_access_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String userAccessTypeId;

	@Column(name="user_access_type_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String userAccessTypeName;

	@Column(name="disp_index_1", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String dispIndex1;

	public String getUserAccessTypeId(){

			return this.userAccessTypeId;
	}

	public void setUserAccessTypeId(String userAccessTypeId){
		this.userAccessTypeId=userAccessTypeId;
	}

	public String getUserAccessTypeName(){

			return this.userAccessTypeName;
	}

	public void setUserAccessTypeName(String userAccessTypeName){
		this.userAccessTypeName=userAccessTypeName;
	}

	public String getDispIndex1(){

			return this.dispIndex1;
	}

	public void setDispIndex1(String dispIndex1){
		this.dispIndex1=dispIndex1;
	}

}
