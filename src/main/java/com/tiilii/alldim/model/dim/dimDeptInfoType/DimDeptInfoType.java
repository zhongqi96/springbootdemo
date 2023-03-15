/**
 *	create by tools 2019-1-15 17:16:56
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimDeptInfoType.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimDeptInfoType;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_dept_info_type")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimDeptInfoType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_DEPTINFOTYPEID = "deptInfoTypeId";
	public static final String FIELD_DEPTINFOTYPENAME = "deptInfoTypeName";

	@Column(name="dept_info_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String deptInfoTypeId;

	@Column(name="dept_info_type_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String deptInfoTypeName;

	public String getDeptInfoTypeId(){

			return this.deptInfoTypeId;
	}

	public void setDeptInfoTypeId(String deptInfoTypeId){
		this.deptInfoTypeId=deptInfoTypeId;
	}

	public String getDeptInfoTypeName(){

			return this.deptInfoTypeName;
	}

	public void setDeptInfoTypeName(String deptInfoTypeName){
		this.deptInfoTypeName=deptInfoTypeName;
	}

}
