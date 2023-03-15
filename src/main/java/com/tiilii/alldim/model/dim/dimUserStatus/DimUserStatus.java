/**
 *	create by tools 2019-1-15 17:16:59
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimUserStatus.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimUserStatus;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_user_status")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimUserStatus implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_USERSTATUSID = "userStatusId";
	public static final String FIELD_USERSTATUSNAME = "userStatusName";

	@Column(name="user_status_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String userStatusId;

	@Column(name="user_status_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String userStatusName;

	public String getUserStatusId(){

			return this.userStatusId;
	}

	public void setUserStatusId(String userStatusId){
		this.userStatusId=userStatusId;
	}

	public String getUserStatusName(){

			return this.userStatusName;
	}

	public void setUserStatusName(String userStatusName){
		this.userStatusName=userStatusName;
	}

}
