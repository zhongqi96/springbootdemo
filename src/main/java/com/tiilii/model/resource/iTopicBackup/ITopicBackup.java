/**
 *	create by tools 2017-2-21 16:27:59
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：ITopicBackup.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.model.resource.iTopicBackup;

public class ITopicBackup{

	private int topicUid;

	private String resourceBackupTypeId;

	private String topicTypeId;

	private int topicOptionCount;

	private double topicScore;

	private int topicAnswerTime;

	private int topicDifficulty;

	private int topicDifferentiation;

	private int topicKnowitemCount;

	private String topicContentText;

	private String topicAnswerText;

	private String topicTrainText;

	private java.util.Date topicBackupDatetime;

	public int getTopicUid(){

			return this.topicUid;
	}

	public void setTopicUid(int topicUid){
		this.topicUid=topicUid;
	}

	public String getResourceBackupTypeId(){

			return this.resourceBackupTypeId;
	}

	public void setResourceBackupTypeId(String resourceBackupTypeId){
		this.resourceBackupTypeId=resourceBackupTypeId;
	}

	public String getTopicTypeId(){

			return this.topicTypeId;
	}

	public void setTopicTypeId(String topicTypeId){
		this.topicTypeId=topicTypeId;
	}

	public int getTopicOptionCount(){

			return this.topicOptionCount;
	}

	public void setTopicOptionCount(int topicOptionCount){
		this.topicOptionCount=topicOptionCount;
	}

	public double getTopicScore(){

			return this.topicScore;
	}

	public void setTopicScore(double topicScore){
		this.topicScore=topicScore;
	}

	public int getTopicAnswerTime(){

			return this.topicAnswerTime;
	}

	public void setTopicAnswerTime(int topicAnswerTime){
		this.topicAnswerTime=topicAnswerTime;
	}

	public int getTopicDifficulty(){

			return this.topicDifficulty;
	}

	public void setTopicDifficulty(int topicDifficulty){
		this.topicDifficulty=topicDifficulty;
	}

	public int getTopicDifferentiation(){

			return this.topicDifferentiation;
	}

	public void setTopicDifferentiation(int topicDifferentiation){
		this.topicDifferentiation=topicDifferentiation;
	}

	public int getTopicKnowitemCount(){

			return this.topicKnowitemCount;
	}

	public void setTopicKnowitemCount(int topicKnowitemCount){
		this.topicKnowitemCount=topicKnowitemCount;
	}

	public String getTopicContentText(){

			return this.topicContentText;
	}

	public void setTopicContentText(String topicContentText){
		this.topicContentText=topicContentText;
	}

	public String getTopicAnswerText(){

			return this.topicAnswerText;
	}

	public void setTopicAnswerText(String topicAnswerText){
		this.topicAnswerText=topicAnswerText;
	}

	public String getTopicTrainText(){

			return this.topicTrainText;
	}

	public void setTopicTrainText(String topicTrainText){
		this.topicTrainText=topicTrainText;
	}

	public java.util.Date getTopicBackupDatetime(){

			return this.topicBackupDatetime;
	}

	public void setTopicBackupDatetime(java.util.Date topicBackupDatetime){
		this.topicBackupDatetime=topicBackupDatetime;
	}

}
