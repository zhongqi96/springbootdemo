/**
 *	create by tools 2019-1-15 17:16:59
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimUserInfoType.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimUserInfoType;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_user_info_type")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimUserInfoType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_USERINFOTYPEID = "userInfoTypeId";
	public static final String FIELD_USERINFOTYPENAME = "userInfoTypeName";

	@Column(name="user_info_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String userInfoTypeId;

	@Column(name="user_info_type_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String userInfoTypeName;

	public String getUserInfoTypeId(){

			return this.userInfoTypeId;
	}

	public void setUserInfoTypeId(String userInfoTypeId){
		this.userInfoTypeId=userInfoTypeId;
	}

	public String getUserInfoTypeName(){

			return this.userInfoTypeName;
	}

	public void setUserInfoTypeName(String userInfoTypeName){
		this.userInfoTypeName=userInfoTypeName;
	}

}
