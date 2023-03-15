/**
 *	create by tools 2019-1-15 17:16:59
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimTopicComeFromType.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimTopicComeFromType;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_topic_come_from_type")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimTopicComeFromType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_TOPICCOMEFROMTYPEID = "topicComeFromTypeId";
	public static final String FIELD_TOPICCOMEFROMTYPE = "topicComeFromType";

	@Column(name="topic_come_from_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String topicComeFromTypeId;

	@Column(name="topic_come_from_type", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String topicComeFromType;

	public String getTopicComeFromTypeId(){

			return this.topicComeFromTypeId;
	}

	public void setTopicComeFromTypeId(String topicComeFromTypeId){
		this.topicComeFromTypeId=topicComeFromTypeId;
	}

	public String getTopicComeFromType(){

			return this.topicComeFromType;
	}

	public void setTopicComeFromType(String topicComeFromType){
		this.topicComeFromType=topicComeFromType;
	}

}
