/**
 *	create by tools 2019-1-15 17:16:59
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimTopicAnswerStatus.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimTopicAnswerStatus;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_topic_answer_status")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimTopicAnswerStatus implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_TOPICANSWERSTATUSID = "topicAnswerStatusId";
	public static final String FIELD_TOPICANSWERSTATUSNAME = "topicAnswerStatusName";

	@Column(name="topic_answer_status_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String topicAnswerStatusId;

	@Column(name="topic_answer_status_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String topicAnswerStatusName;

	public String getTopicAnswerStatusId(){

			return this.topicAnswerStatusId;
	}

	public void setTopicAnswerStatusId(String topicAnswerStatusId){
		this.topicAnswerStatusId=topicAnswerStatusId;
	}

	public String getTopicAnswerStatusName(){

			return this.topicAnswerStatusName;
	}

	public void setTopicAnswerStatusName(String topicAnswerStatusName){
		this.topicAnswerStatusName=topicAnswerStatusName;
	}

}
