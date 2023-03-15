/**
 *	create by tools 2019-1-15 17:16:59
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimTriStatus.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimTriStatus;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_tri_status")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimTriStatus implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_TRISTATUSID = "triStatusId";
	public static final String FIELD_TRISTATUSNAME = "triStatusName";

	@Column(name="tri_status_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String triStatusId;

	@Column(name="tri_status_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String triStatusName;

	public String getTriStatusId(){

			return this.triStatusId;
	}

	public void setTriStatusId(String triStatusId){
		this.triStatusId=triStatusId;
	}

	public String getTriStatusName(){

			return this.triStatusName;
	}

	public void setTriStatusName(String triStatusName){
		this.triStatusName=triStatusName;
	}

}
