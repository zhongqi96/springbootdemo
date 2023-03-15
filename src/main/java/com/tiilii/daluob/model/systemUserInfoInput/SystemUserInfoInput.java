/**
 *	create by tools 2018-8-16 14:32:24
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：SystemUserInfoInput.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.systemUserInfoInput;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "sys_user_info_input")
@IDGenerator(generator=GeneratorType.NATIVE)
public class SystemUserInfoInput implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_USERUID = "userUid";
	public static final String FIELD_INFOTYPEID = "infoTypeId";
	public static final String FIELD_INFOVALUE = "infoValue";

	@Column(name="user_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int userUid;

	@Column(name="info_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String infoTypeId;

	@Column(name="info_value", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String infoValue;

	public int getUserUid(){

			return this.userUid;
	}

	public void setUserUid(int userUid){
		this.userUid=userUid;
	}

	public String getInfoTypeId(){

			return this.infoTypeId;
	}

	public void setInfoTypeId(String infoTypeId){
		this.infoTypeId=infoTypeId;
	}

	public String getInfoValue(){

			return this.infoValue;
	}

	public void setInfoValue(String infoValue){
		this.infoValue=infoValue;
	}

}
