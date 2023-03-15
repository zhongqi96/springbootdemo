/**
 *	create by tools 2019-1-15 17:16:59
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimTopicType.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimTopicType;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_topic_type")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimTopicType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_TOPICTYPEID = "topicTypeId";
	public static final String FIELD_TOPICTYPENAME = "topicTypeName";
	public static final String FIELD_DISPINDEX1 = "dispIndex1";

	@Column(name="topic_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String topicTypeId;

	@Column(name="topic_type_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String topicTypeName;

	@Column(name="disp_index_1", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String dispIndex1;

	public String getTopicTypeId(){

			return this.topicTypeId;
	}

	public void setTopicTypeId(String topicTypeId){
		this.topicTypeId=topicTypeId;
	}

	public String getTopicTypeName(){

			return this.topicTypeName;
	}

	public void setTopicTypeName(String topicTypeName){
		this.topicTypeName=topicTypeName;
	}

	public String getDispIndex1(){

			return this.dispIndex1;
	}

	public void setDispIndex1(String dispIndex1){
		this.dispIndex1=dispIndex1;
	}

}
