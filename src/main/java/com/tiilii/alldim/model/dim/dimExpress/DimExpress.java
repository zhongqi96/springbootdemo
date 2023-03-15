/**
 *	create by tools 2019-1-15 17:16:57
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimExpress.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimExpress;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_express")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimExpress implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_EXPRESSID = "expressId";
	public static final String FIELD_EXPRESSNAME = "expressName";

	@Column(name="express_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String expressId;

	@Column(name="express_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String expressName;

	public String getExpressId(){

			return this.expressId;
	}

	public void setExpressId(String expressId){
		this.expressId=expressId;
	}

	public String getExpressName(){

			return this.expressName;
	}

	public void setExpressName(String expressName){
		this.expressName=expressName;
	}

}
