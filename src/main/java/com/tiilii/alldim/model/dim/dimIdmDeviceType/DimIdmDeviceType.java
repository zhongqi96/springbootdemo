/**
 *	create by tools 2019-1-15 17:16:57
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimIdmDeviceType.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimIdmDeviceType;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_idm_device_type")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimIdmDeviceType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_DEVICETYPEID = "deviceTypeId";
	public static final String FIELD_DEVICETYPENAME = "deviceTypeName";

	@Column(name="device_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String deviceTypeId;

	@Column(name="device_type_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String deviceTypeName;

	public String getDeviceTypeId(){

			return this.deviceTypeId;
	}

	public void setDeviceTypeId(String deviceTypeId){
		this.deviceTypeId=deviceTypeId;
	}

	public String getDeviceTypeName(){

			return this.deviceTypeName;
	}

	public void setDeviceTypeName(String deviceTypeName){
		this.deviceTypeName=deviceTypeName;
	}

}
