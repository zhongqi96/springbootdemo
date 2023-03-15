/**
 *	create by tools 2019-1-15 17:16:57
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimHealthLevel.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimHealthLevel;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_health_level")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimHealthLevel implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_HEALTHLEVELID = "healthLevelId";
	public static final String FIELD_HEALTHLEVELNAME = "healthLevelName";

	@Column(name="health_level_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String healthLevelId;

	@Column(name="health_level_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String healthLevelName;

	public String getHealthLevelId(){

			return this.healthLevelId;
	}

	public void setHealthLevelId(String healthLevelId){
		this.healthLevelId=healthLevelId;
	}

	public String getHealthLevelName(){

			return this.healthLevelName;
	}

	public void setHealthLevelName(String healthLevelName){
		this.healthLevelName=healthLevelName;
	}

}
