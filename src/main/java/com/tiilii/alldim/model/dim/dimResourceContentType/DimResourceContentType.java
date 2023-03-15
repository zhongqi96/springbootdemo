/**
 *	create by tools 2019-1-15 17:16:58
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimResourceContentType.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimResourceContentType;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_resource_content_type")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimResourceContentType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_RESOURCECONTENTTYPEID = "resourceContentTypeId";
	public static final String FIELD_RESOURCECONTENTTYPENAME = "resourceContentTypeName";

	@Column(name="resource_content_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String resourceContentTypeId;

	@Column(name="resource_content_type_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String resourceContentTypeName;

	public String getResourceContentTypeId(){

			return this.resourceContentTypeId;
	}

	public void setResourceContentTypeId(String resourceContentTypeId){
		this.resourceContentTypeId=resourceContentTypeId;
	}

	public String getResourceContentTypeName(){

			return this.resourceContentTypeName;
	}

	public void setResourceContentTypeName(String resourceContentTypeName){
		this.resourceContentTypeName=resourceContentTypeName;
	}

}
