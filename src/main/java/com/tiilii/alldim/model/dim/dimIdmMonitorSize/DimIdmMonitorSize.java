/**
 *	create by tools 2019-1-15 17:16:58
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimIdmMonitorSize.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimIdmMonitorSize;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_idm_monitor_size")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimIdmMonitorSize implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_MONITORSIZEID = "monitorSizeId";
	public static final String FIELD_MONITORSIZENAME = "monitorSizeName";

	@Column(name="monitor_size_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String monitorSizeId;

	@Column(name="monitor_size_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String monitorSizeName;

	public String getMonitorSizeId(){

			return this.monitorSizeId;
	}

	public void setMonitorSizeId(String monitorSizeId){
		this.monitorSizeId=monitorSizeId;
	}

	public String getMonitorSizeName(){

			return this.monitorSizeName;
	}

	public void setMonitorSizeName(String monitorSizeName){
		this.monitorSizeName=monitorSizeName;
	}

}
