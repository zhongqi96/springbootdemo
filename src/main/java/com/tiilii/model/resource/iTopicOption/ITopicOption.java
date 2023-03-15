/**
 *	create by tools 2019-4-1 11:37:04
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：ITopicOption.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.model.resource.iTopicOption;

public class ITopicOption{

	private int topicOptionUid;

	private String isRight;

	private int topicUid;

	private String topicOption;

	public int getTopicOptionUid(){

			return this.topicOptionUid;
	}

	public void setTopicOptionUid(int topicOptionUid){
		this.topicOptionUid=topicOptionUid;
	}

	public String getIsRight(){

			return this.isRight;
	}

	public void setIsRight(String isRight){
		this.isRight=isRight;
	}

	public int getTopicUid(){

			return this.topicUid;
	}

	public void setTopicUid(int topicUid){
		this.topicUid=topicUid;
	}

	public String getTopicOption(){

			return this.topicOption;
	}

	public void setTopicOption(String topicOption){
		this.topicOption=topicOption;
	}

}
