/**
 *	create by tools 2019-1-15 17:16:59
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimTopicObjectOptionType.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimTopicObjectOptionType;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_topic_object_option_type")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimTopicObjectOptionType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_OBJECTOPTIONTYPEID = "objectOptionTypeId";
	public static final String FIELD_TOPICTYPEID = "topicTypeId";
	public static final String FIELD_OBJECTOPTIONTYPENAME = "objectOptionTypeName";

	@Column(name="object_option_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String objectOptionTypeId;

	@Column(name="topic_type_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String topicTypeId;

	@Column(name="object_option_type_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String objectOptionTypeName;

	public String getObjectOptionTypeId(){

			return this.objectOptionTypeId;
	}

	public void setObjectOptionTypeId(String objectOptionTypeId){
		this.objectOptionTypeId=objectOptionTypeId;
	}

	public String getTopicTypeId(){

			return this.topicTypeId;
	}

	public void setTopicTypeId(String topicTypeId){
		this.topicTypeId=topicTypeId;
	}

	public String getObjectOptionTypeName(){

			return this.objectOptionTypeName;
	}

	public void setObjectOptionTypeName(String objectOptionTypeName){
		this.objectOptionTypeName=objectOptionTypeName;
	}

}
