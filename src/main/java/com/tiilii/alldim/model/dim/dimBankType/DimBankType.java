/**
 *	create by tools 2019-1-15 17:16:56
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimBankType.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimBankType;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_bank_type")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimBankType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_BANKTYPEID = "bankTypeId";
	public static final String FIELD_BANKTYPENAME = "bankTypeName";

	@Column(name="bank_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String bankTypeId;

	@Column(name="bank_type_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String bankTypeName;

	public String getBankTypeId(){

			return this.bankTypeId;
	}

	public void setBankTypeId(String bankTypeId){
		this.bankTypeId=bankTypeId;
	}

	public String getBankTypeName(){

			return this.bankTypeName;
	}

	public void setBankTypeName(String bankTypeName){
		this.bankTypeName=bankTypeName;
	}

}
