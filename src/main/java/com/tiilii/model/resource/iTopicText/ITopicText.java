/**
 *	create by tools 2017-1-4 14:26:46
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：ITopic.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.model.resource.iTopicText;

public class ITopicText{

	private Integer topicUid;
	private String topicContent; // 题目题干i_topic_text
	private String topicAnswer; // 题目参考答案i_topic_text
	private String topicTrain; // 题目解题思路i_topic_text
	
	public Integer getTopicUid() {
		return topicUid;
	}

	public void setTopicUid(Integer topicUid) {
		this.topicUid = topicUid;
	}

	public String getTopicContent() {
		return topicContent;
	}

	public void setTopicContent(String topicContent) {
		this.topicContent = topicContent;
	}

	public String getTopicAnswer() {
		return topicAnswer;
	}

	public void setTopicAnswer(String topicAnswer) {
		this.topicAnswer = topicAnswer;
	}

	public String getTopicTrain() {
		return topicTrain;
	}

	public void setTopicTrain(String topicTrain) {
		this.topicTrain = topicTrain;
	}
}
