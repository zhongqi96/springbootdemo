/**
 *	create by tools 2019-1-15 17:16:59
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimTlAccount.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimTlAccount;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_tl_account")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimTlAccount implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_TLACCOUNTID = "tlAccountId";
	public static final String FIELD_TLBANK = "tlBank";

	@Column(name="tl_account_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String tlAccountId;

	@Column(name="tl_bank", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String tlBank;

	public String getTlAccountId(){

			return this.tlAccountId;
	}

	public void setTlAccountId(String tlAccountId){
		this.tlAccountId=tlAccountId;
	}

	public String getTlBank(){

			return this.tlBank;
	}

	public void setTlBank(String tlBank){
		this.tlBank=tlBank;
	}

}
