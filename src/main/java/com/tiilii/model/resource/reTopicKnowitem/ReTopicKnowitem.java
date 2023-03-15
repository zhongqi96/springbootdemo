/**
 *	create by tools 2016-12-20 15:24:04
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：ReTopicKnowitem.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.model.resource.reTopicKnowitem;

public class ReTopicKnowitem{
	private Integer topicKnowitemUid;

	private String knowitemId;

	private Integer topicUid;

	private Integer weight;

	public Integer getTopicKnowitemUid(){

			return this.topicKnowitemUid;
	}

	public void setTopicKnowitemUid(Integer topicKnowitemUid){
		this.topicKnowitemUid=topicKnowitemUid;
	}

	public String getKnowitemId(){

			return this.knowitemId;
	}

	public void setKnowitemId(String knowitemId){
		this.knowitemId=knowitemId;
	}

	public Integer getTopicUid(){

			return this.topicUid;
	}

	public void setTopicUid(Integer topicUid){
		this.topicUid=topicUid;
	}

	public Integer getWeight(){

			return this.weight;
	}

	public void setWeight(Integer weight){
		this.weight=weight;
	}

}
