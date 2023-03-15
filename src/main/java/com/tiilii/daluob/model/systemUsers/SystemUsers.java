/**
 *	create by tools 2018-8-16 14:32:24
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：SystemUsers.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.systemUsers;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "sys_users")
@IDGenerator(generator=GeneratorType.IDENTITY)
public class SystemUsers implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_USERUID = "userUid";
	public static final String FIELD_SEXID = "sexId";
	public static final String FIELD_ACCOUNTSTATUSID = "accountStatusId";
	public static final String FIELD_USERLOGINNAME = "userLoginName";
	public static final String FIELD_USERNAME = "userName";
	public static final String FIELD_USERPASSWORD = "userPassword";
	public static final String FIELD_USERBIRTHDAY = "userBirthday";
	public static final String FIELD_USERREGISTERDATETIME = "userRegisterDatetime";
	public static final String FIELD_USERLASTLOGINDATETIME = "userLastLoginDatetime";

	@Column(name="user_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int userUid;

	@Column(name="sex_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String sexId;

	@Column(name="account_status_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String accountStatusId;

	@Column(name="user_login_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String userLoginName;

	@Column(name="user_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String userName;

	@Column(name="user_password", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String userPassword;

	@Column(name="user_birthday", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.util.Date userBirthday;

	@Column(name="user_register_datetime", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.sql.Timestamp userRegisterDatetime;

	@Column(name="user_last_login_datetime", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.sql.Timestamp userLastLoginDatetime;

	public int getUserUid(){

			return this.userUid;
	}

	public void setUserUid(int userUid){
		this.userUid=userUid;
	}

	public String getSexId(){

			return this.sexId;
	}

	public void setSexId(String sexId){
		this.sexId=sexId;
	}

	public String getAccountStatusId(){

			return this.accountStatusId;
	}

	public void setAccountStatusId(String accountStatusId){
		this.accountStatusId=accountStatusId;
	}

	public String getUserLoginName(){

			return this.userLoginName;
	}

	public void setUserLoginName(String userLoginName){
		this.userLoginName=userLoginName;
	}

	public String getUserName(){

			return this.userName;
	}

	public void setUserName(String userName){
		this.userName=userName;
	}

	public String getUserPassword(){

			return this.userPassword;
	}

	public void setUserPassword(String userPassword){
		this.userPassword=userPassword;
	}

	public java.util.Date getUserBirthday(){

			return this.userBirthday;
	}

	public void setUserBirthday(java.util.Date userBirthday){
		this.userBirthday=userBirthday;
	}

	public java.sql.Timestamp getUserRegisterDatetime(){

			return this.userRegisterDatetime;
	}

	public void setUserRegisterDatetime(java.sql.Timestamp userRegisterDatetime){
		this.userRegisterDatetime=userRegisterDatetime;
	}

	public java.sql.Timestamp getUserLastLoginDatetime(){

			return this.userLastLoginDatetime;
	}

	public void setUserLastLoginDatetime(java.sql.Timestamp userLastLoginDatetime){
		this.userLastLoginDatetime=userLastLoginDatetime;
	}

}
