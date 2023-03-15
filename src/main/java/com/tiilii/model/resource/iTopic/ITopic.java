/**
 *	create by tools 2017-1-4 14:26:46
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：ITopic.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.model.resource.iTopic;

import java.util.List;

import com.tiilii.alldim.model.dim.dimKnowitem.DimKnowitem;
import com.tiilii.model.resource.iCourse.ICourse;
import com.tiilii.model.resource.iTopicOption.ITopicOption;
import com.tiilii.model.resource.iTopicText.ITopicText;

public class ITopic{
	private Integer topicUid;
	private String topicStatusId;
	private String topicTypeId;
	private String topicComeFromId;
	private Integer topicOptionCount;
	private Double topicScore;
	private Integer topicAnswerTime;
	private Integer topicDifficulty;
	private Integer topicDifferentiation;
	private Integer topicKnowitemCount;
	private Integer topicUsedCount;
	private Integer topicSkipCount;
	private String topicSegment;
	private int index;
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}

	private ICourse iCourse; // 课程
	private ITopicText topicText; // 文本
	private String topicTypeName; // 题型名称
	public String getTopicSegment() {
		return topicSegment;
	}
	public void setTopicSegment(String topicSegment) {
		this.topicSegment = topicSegment;
	}
	
	public String getTopicTypeName() {
		return topicTypeName;
	}
	public void setTopicTypeName(String topicTypeName) {
		this.topicTypeName = topicTypeName;
	}
	public ICourse getICourse() {
		return iCourse;
	}

	public void setICourse(ICourse iCourse) {
		this.iCourse = iCourse;
	}
	
	public ICourse getiCourse() {
		return iCourse;
	}
	public void setiCourse(ICourse iCourse) {
		this.iCourse = iCourse;
	}
	public ITopicText getTopicText() {
		return topicText;
	}
	public void setTopicText(ITopicText topicText) {
		this.topicText = topicText;
	}

	public Integer getTopicUid(){
			return this.topicUid;
	}

	public void setTopicUid(Integer topicUid){
		this.topicUid=topicUid;
	}

	public String getTopicStatusId(){

			return this.topicStatusId;
	}

	public void setTopicStatusId(String topicStatusId){
		this.topicStatusId=topicStatusId;
	}

	public String getTopicTypeId(){

			return this.topicTypeId;
	}

	public void setTopicTypeId(String topicTypeId){
		this.topicTypeId=topicTypeId;
	}

	public String getTopicComeFromId(){

			return this.topicComeFromId;
	}

	public void setTopicComeFromId(String topicComeFromId){
		this.topicComeFromId=topicComeFromId;
	}

	public Integer getTopicOptionCount(){

			return this.topicOptionCount;
	}

	public void setTopicOptionCount(Integer topicOptionCount){
		this.topicOptionCount=topicOptionCount;
	}

	public Double getTopicScore(){

			return this.topicScore;
	}

	public void setTopicScore(Double topicScore){
		this.topicScore=topicScore;
	}

	public Integer getTopicAnswerTime(){

			return this.topicAnswerTime;
	}

	public void setTopicAnswerTime(Integer topicAnswerTime){
		this.topicAnswerTime=topicAnswerTime;
	}

	public Integer getTopicDifficulty(){

			return this.topicDifficulty;
	}

	public void setTopicDifficulty(Integer topicDifficulty){
		this.topicDifficulty=topicDifficulty;
	}

	public Integer getTopicDifferentiation(){

			return this.topicDifferentiation;
	}

	public void setTopicDifferentiation(Integer topicDifferentiation){
		this.topicDifferentiation=topicDifferentiation;
	}

	public Integer getTopicKnowitemCount(){

			return this.topicKnowitemCount;
	}

	public void setTopicKnowitemCount(Integer topicKnowitemCount){
		this.topicKnowitemCount=topicKnowitemCount;
	}

	public Integer getTopicUsedCount(){

			return this.topicUsedCount;
	}

	public void setTopicUsedCount(Integer topicUsedCount){
		this.topicUsedCount=topicUsedCount;
	}

	public Integer getTopicSkipCount(){

			return this.topicSkipCount;
	}

	public void setTopicSkipCount(Integer topicSkipCount){
		this.topicSkipCount=topicSkipCount;
	}
	
	private List<DimKnowitem> Knowitems;
	public List<DimKnowitem> getKnowitems() {
		return Knowitems;
	}
	public void setKnowitems(List<DimKnowitem> knowitems) {
		Knowitems = knowitems;
	}
	private List<ITopicOption> optionList;
	
	public List<ITopicOption> getOptionList() {
		return optionList;
	}
	public void setOptionList(List<ITopicOption> optionList) {
		this.optionList = optionList;
	}

	private double topicScoreInResource; // 库中的分数
	private double topicScoreInPaper;   // 出卷的分数
	public double getTopicScoreInResource() {
		return topicScoreInResource;
	}
	public void setTopicScoreInResource(double topicScoreInResource) {
		this.topicScoreInResource = topicScoreInResource;
	}
	public double getTopicScoreInPaper() {
		return topicScoreInPaper;
	}
	public void setTopicScoreInPaper(double topicScoreInPaper) {
		this.topicScoreInPaper = topicScoreInPaper;
	}
	
}
