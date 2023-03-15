/**
 *	create by tools 2019-1-15 17:16:59
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimUserWarningType.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimUserWarningType;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_user_warning_type")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimUserWarningType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_USERWARNINGTYPEID = "userWarningTypeId";
	public static final String FIELD_USERWARNINGTYPENAME = "userWarningTypeName";

	@Column(name="user_warning_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String userWarningTypeId;

	@Column(name="user_warning_type_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String userWarningTypeName;

	public String getUserWarningTypeId(){

			return this.userWarningTypeId;
	}

	public void setUserWarningTypeId(String userWarningTypeId){
		this.userWarningTypeId=userWarningTypeId;
	}

	public String getUserWarningTypeName(){

			return this.userWarningTypeName;
	}

	public void setUserWarningTypeName(String userWarningTypeName){
		this.userWarningTypeName=userWarningTypeName;
	}

}
