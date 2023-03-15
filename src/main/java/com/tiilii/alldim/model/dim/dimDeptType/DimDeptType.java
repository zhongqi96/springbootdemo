/**
 *	create by tools 2019-1-15 17:16:56
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimDeptType.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimDeptType;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_dept_type")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimDeptType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_DEPTTYPEID = "deptTypeId";
	public static final String FIELD_DEPTTYPENAME = "deptTypeName";

	@Column(name="dept_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String deptTypeId;

	@Column(name="dept_type_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String deptTypeName;

	public String getDeptTypeId(){

			return this.deptTypeId;
	}

	public void setDeptTypeId(String deptTypeId){
		this.deptTypeId=deptTypeId;
	}

	public String getDeptTypeName(){

			return this.deptTypeName;
	}

	public void setDeptTypeName(String deptTypeName){
		this.deptTypeName=deptTypeName;
	}

}
