/**
 *	create by tools 2019-1-15 17:16:59
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimSmsActionType.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimSmsActionType;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_sms_action_type")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimSmsActionType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_SMSACTIONTYPEID = "smsActionTypeId";
	public static final String FIELD_SMSACTIONTYPENAME = "smsActionTypeName";

	@Column(name="sms_action_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String smsActionTypeId;

	@Column(name="sms_action_type_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String smsActionTypeName;

	public String getSmsActionTypeId(){

			return this.smsActionTypeId;
	}

	public void setSmsActionTypeId(String smsActionTypeId){
		this.smsActionTypeId=smsActionTypeId;
	}

	public String getSmsActionTypeName(){

			return this.smsActionTypeName;
	}

	public void setSmsActionTypeName(String smsActionTypeName){
		this.smsActionTypeName=smsActionTypeName;
	}

}
