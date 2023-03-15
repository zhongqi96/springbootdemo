/**
 *	create by tools 2016-12-20 15:24:04
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：LogTopicSegment.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.model.resource.logTopicSegment;

public class LogTopicSegment{

	private Integer topicSegmentUid;

	private Integer topicUid;

	private String topicSegmentDatetime;

	private String topicSegment;

	public Integer getTopicSegmentUid(){

			return this.topicSegmentUid;
	}

	public void setTopicSegmentUid(Integer topicSegmentUid){
		this.topicSegmentUid=topicSegmentUid;
	}

	public Integer getTopicUid(){

			return this.topicUid;
	}

	public void setTopicUid(Integer topicUid){
		this.topicUid=topicUid;
	}

	public String getTopicSegmentDatetime(){

			return this.topicSegmentDatetime;
	}

	public void setTopicSegmentDatetime(String topicSegmentDatetime){
		this.topicSegmentDatetime=topicSegmentDatetime;
	}

	public String getTopicSegment(){

			return this.topicSegment;
	}

	public void setTopicSegment(String topicSegment){
		this.topicSegment=topicSegment;
	}

}
