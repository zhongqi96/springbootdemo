/**
 *	create by tools 2016-12-20 15:24:03
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：ITextbook.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.model.resource.iTextbook;

import java.util.List;

import com.tiilii.model.resource.iCourse.ICourse;
import com.tiilii.model.resource.iPublisher.IPublisher;
import com.tiilii.model.resource.iTextbookStructure.ITextbookStructure;

public class ITextbook{
	private Integer textbookUid;

	private String textbookTypeId;

	private String textbookCreateTypeId;

	private String publisherIsbn;

	private String textbookName;
	private String textbookAuthor;

	private String textbookVer;

	private java.util.Date textbookPublishDate;

	private String textbookIsbn;
	private String textbookBrief;

	private String textbookCoverImg;
	private String textbookKeyword;
	
	public String getTextbookBrief() {
		return textbookBrief;
	}

	public void setTextbookBrief(String textbookBrief) {
		this.textbookBrief = textbookBrief;
	}

	public String getTextbookKeyword() {
		return textbookKeyword;
	}

	public void setTextbookKeyword(String textbookKeyword) {
		this.textbookKeyword = textbookKeyword;
	}

	public ICourse getiCourse() {
		return iCourse;
	}

	public void setiCourse(ICourse iCourse) {
		this.iCourse = iCourse;
	}

	private List<ITextbookStructure> textbookStructures;
	private IPublisher publisher;

	public List<ITextbookStructure> getTextbookStructures() {
		return textbookStructures;
	}

	public void setTextbookStructures(List<ITextbookStructure> textbookStructures) {
		this.textbookStructures = textbookStructures;
	}

	public IPublisher getPublisher() {
		return publisher;
	}

	public void setPublisher(IPublisher publisher) {
		this.publisher = publisher;
	}

	private ICourse iCourse;

	public ICourse getICourse() {
		return iCourse;
	}

	public void setICourse(ICourse iCourse) {
		this.iCourse = iCourse;
	}

	public Integer getTextbookUid(){

			return this.textbookUid;
	}

	public void setTextbookUid(Integer textbookUid){
		this.textbookUid=textbookUid;
	}

	public String getTextbookTypeId(){

			return this.textbookTypeId;
	}

	public void setTextbookTypeId(String textbookTypeId){
		this.textbookTypeId=textbookTypeId;
	}

	public String getTextbookCreateTypeId(){

			return this.textbookCreateTypeId;
	}

	public void setTextbookCreateTypeId(String textbookCreateTypeId){
		this.textbookCreateTypeId=textbookCreateTypeId;
	}

	public String getPublisherIsbn(){

			return this.publisherIsbn;
	}

	public void setPublisherIsbn(String publisherIsbn){
		this.publisherIsbn=publisherIsbn;
	}

	public String getTextbookName(){

			return this.textbookName;
	}

	public void setTextbookName(String textbookName){
		this.textbookName=textbookName;
	}

	public String getTextbookVer(){

			return this.textbookVer;
	}

	public void setTextbookVer(String textbookVer){
		this.textbookVer=textbookVer;
	}

	public java.util.Date getTextbookPublishDate(){

			return this.textbookPublishDate;
	}

	public void setTextbookPublishDate(java.util.Date textbookPublishDate){
		this.textbookPublishDate=textbookPublishDate;
	}

	public String getTextbookIsbn(){

			return this.textbookIsbn;
	}

	public void setTextbookIsbn(String textbookIsbn){
		this.textbookIsbn=textbookIsbn;
	}

	public String getTextbookCoverImg(){

			return this.textbookCoverImg;
	}

	public void setTextbookCoverImg(String textbookCoverImg){
		this.textbookCoverImg=textbookCoverImg;
	}

	private int courseUid;

	public int getCourseUid() {
		return courseUid;
	}

	public void setCourseUid(int courseUid) {
		this.courseUid = courseUid;
	}

	public String getTextbookAuthor() {
		return textbookAuthor;
	}

	public void setTextbookAuthor(String textbookAuthor) {
		this.textbookAuthor = textbookAuthor;
	}

	@Override
	public String toString() {
		return "ITextbook [textbookUid=" + textbookUid + ", textbookTypeId=" + textbookTypeId
				+ ", textbookCreateTypeId=" + textbookCreateTypeId + ", publisherIsbn=" + publisherIsbn
				+ ", textbookName=" + textbookName + ", textbookAuthor=" + textbookAuthor + ", textbookVer="
				+ textbookVer + ", textbookPublishDate=" + textbookPublishDate + ", textbookIsbn=" + textbookIsbn
				+ ", textbookBrief=" + textbookBrief + ", textbookCoverImg=" + textbookCoverImg + ", textbookKeyword="
				+ textbookKeyword + ", textbookStructures=" + textbookStructures + ", publisher=" + publisher
				+ ", iCourse=" + iCourse + ", courseUid=" + courseUid + "]";
	}
	
	
}
