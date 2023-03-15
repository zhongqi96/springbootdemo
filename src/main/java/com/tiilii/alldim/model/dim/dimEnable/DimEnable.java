/**
 *	create by tools 2019-1-15 17:16:56
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimEnable.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimEnable;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_enable")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimEnable implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_ENABLEID = "enableId";
	public static final String FIELD_ENABLENAME = "enableName";

	@Column(name="enable_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String enableId;

	@Column(name="enable_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String enableName;

	public String getEnableId(){

			return this.enableId;
	}

	public void setEnableId(String enableId){
		this.enableId=enableId;
	}

	public String getEnableName(){

			return this.enableName;
	}

	public void setEnableName(String enableName){
		this.enableName=enableName;
	}

}
