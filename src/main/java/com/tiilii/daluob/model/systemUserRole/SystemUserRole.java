/**
 *	create by tools 2019-2-28 14:05:58
 *	Copyright © 2018 武汉天量技术有限公司
 *	注意：SystemUserRole.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.systemUserRole;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "sys_user_role")
@IDGenerator(generator=GeneratorType.IDENTITY)
public class SystemUserRole implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_USERROLEUID = "userRoleUid";
	public static final String FIELD_USERUID = "userUid";
	public static final String FIELD_ROLEUID = "roleUid";
	public static final String FIELD_APPID = "appId";

	@Column(name="user_role_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int userRoleUid;

	@Column(name="user_uid", isPk=false, isFk=true,isBlob=false,isClob=false)
	private int userUid;

	@Column(name="role_uid", isPk=false, isFk=true,isBlob=false,isClob=false)
	private int roleUid;

	@Column(name="app_id", isPk=false, isFk=true,isBlob=false,isClob=false)
	private String appId;

	public int getUserRoleUid(){

			return this.userRoleUid;
	}

	public void setUserRoleUid(int userRoleUid){
		this.userRoleUid=userRoleUid;
	}

	public int getUserUid(){

			return this.userUid;
	}

	public void setUserUid(int userUid){
		this.userUid=userUid;
	}

	public int getRoleUid(){

			return this.roleUid;
	}

	public void setRoleUid(int roleUid){
		this.roleUid=roleUid;
	}

	public String getAppId(){

			return this.appId;
	}

	public void setAppId(String appId){
		this.appId=appId;
	}

}
