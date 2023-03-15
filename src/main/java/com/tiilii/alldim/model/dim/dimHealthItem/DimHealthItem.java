/**
 *	create by tools 2019-1-15 17:16:57
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimHealthItem.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimHealthItem;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_health_item")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimHealthItem implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_HEALTHITEMID = "healthItemId";
	public static final String FIELD_HEALTHITEMNAME = "healthItemName";
	public static final String FIELD_HEALTHITEMUNIT = "healthItemUnit";

	@Column(name="health_item_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String healthItemId;

	@Column(name="health_item_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String healthItemName;

	@Column(name="health_item_unit", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String healthItemUnit;

	public String getHealthItemId(){

			return this.healthItemId;
	}

	public void setHealthItemId(String healthItemId){
		this.healthItemId=healthItemId;
	}

	public String getHealthItemName(){

			return this.healthItemName;
	}

	public void setHealthItemName(String healthItemName){
		this.healthItemName=healthItemName;
	}

	public String getHealthItemUnit(){

			return this.healthItemUnit;
	}

	public void setHealthItemUnit(String healthItemUnit){
		this.healthItemUnit=healthItemUnit;
	}

}
