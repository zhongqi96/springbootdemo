/**
 *	create by tools 2016-12-27 10:19:25
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：ICourse.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.model.resource.iCourse;

import java.util.List;

import com.tiilii.alldim.model.dim.dimCourse.DimCourse;
import com.tiilii.alldim.model.dim.dimKnowitem.DimKnowitem;
import com.tiilii.alldim.model.dim.dimPath.DimPath;
import com.tiilii.model.resource.iTextbook.ITextbook;

public class ICourse{

	private Integer courseUid;

	private String canCheckVideo;

	private String canRecheckTopicRequest;

	private String isPublic;

	private String canRecheckTopic;

	private String canCheckVideoRequest;

	private String pathId;

	private String canCheckTopic;

	private String enableId;

	private String courseId;

	private String canCheckTopicRequest;

	private String canPurchase;

	private String courseBrief;

	private String courseKeyword;

	private String courseImageUrl;

	private Integer courseRecheckRatio;
	
	public String getCanRecheckTopicRequest() {
		return canRecheckTopicRequest;
	}
	public void setCanRecheckTopicRequest(String canRecheckTopicRequest) {
		this.canRecheckTopicRequest = canRecheckTopicRequest;
	}
	public String getCanCheckVideoRequest() {
		return canCheckVideoRequest;
	}
	public void setCanCheckVideoRequest(String canCheckVideoRequest) {
		this.canCheckVideoRequest = canCheckVideoRequest;
	}
	public String getCanCheckTopicRequest() {
		return canCheckTopicRequest;
	}
	public void setCanCheckTopicRequest(String canCheckTopicRequest) {
		this.canCheckTopicRequest = canCheckTopicRequest;
	}
	public Integer getCourseRecheckRatio() {
		return courseRecheckRatio;
	}
	public void setCourseRecheckRatio(Integer courseRecheckRatio) {
		this.courseRecheckRatio = courseRecheckRatio;
	}

	private Integer resourceUid;   //一条资源
	public Integer getResourceUid() {
		return resourceUid;
	}
	public void setResourceUid(Integer resourceUid) {
		this.resourceUid = resourceUid;
	}

	private List<DimKnowitem> knowitems;
	private ICourse FullGradeCourse;

	public ICourse getFullGradeCourse() {
		return FullGradeCourse;
	}
	public void setFullGradeCourse(ICourse fullGradeCourse) {
		FullGradeCourse = fullGradeCourse;
	}

	public Integer getCourseUid() {

		return this.courseUid;
	}

	public void setCourseUid(Integer courseUid) {
		this.courseUid = courseUid;
	}

	public String getCourseBrief() {

		return this.courseBrief;
	}

	public void setCourseBrief(String courseBrief) {
		this.courseBrief = courseBrief;
	}

	
	public String getCanCheckTopic() {

		return this.canCheckTopic;
	}

	public void setCanCheckTopic(String canCheckTopic) {
		this.canCheckTopic = canCheckTopic;
	}

	public String getCanRecheckTopic() {

		return this.canRecheckTopic;
	}

	public void setCanRecheckTopic(String canRecheckTopic) {
		this.canRecheckTopic = canRecheckTopic;
	}

	public String getCanCheckVideo() {

		return this.canCheckVideo;
	}

	public void setCanCheckVideo(String canCheckVideo) {
		this.canCheckVideo = canCheckVideo;
	}

	public String getCanPurchase() {

		return this.canPurchase;
	}

	public void setCanPurchase(String canPurchase) {
		this.canPurchase = canPurchase;
	}

	public String getCourseId() {

		return this.courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getPathId() {

		return this.pathId;
	}

	public void setPathId(String pathId) {
		this.pathId = pathId;
	}

	public String getEnableId() {

		return this.enableId;
	}

	public void setEnableId(String enableId) {
		this.enableId = enableId;
	}

	public String getIsPublic() {

		return this.isPublic;
	}

	public void setIsPublic(String isPublic) {
		this.isPublic = isPublic;
	}

	public String getCourseKeyword() {

		return this.courseKeyword;
	}

	public void setCourseKeyword(String courseKeyword) {
		this.courseKeyword = courseKeyword;
	}

	public String getCourseImageUrl() {

		return this.courseImageUrl;
	}

	public void setCourseImageUrl(String courseImageUrl) {
		this.courseImageUrl = courseImageUrl;
	}
	public List<DimKnowitem> getKnowitems() {
		return knowitems;
	}

	public void setKnowitems(List<DimKnowitem> knowitems) {
		this.knowitems = knowitems;
	}

	List<ITextbook> textbookList;
	private DimPath dimPath;
	private DimCourse dimCourse;

	public DimPath getDimPath() {
		return dimPath;
	}
	public void setDimPath(DimPath dimPath) {
		this.dimPath = dimPath;
	}
	public DimCourse getDimCourse() {
		return dimCourse;
	}
	public void setDimCourse(DimCourse dimCourse) {
		this.dimCourse = dimCourse;
	}
	public List<ITextbook> getTextbookList() {
		return textbookList;
	}
	public void setTextbookList(List<ITextbook> textbookList) {
		this.textbookList = textbookList;
	}
	@Override
	public String toString() {
		return "ICourse [courseUid=" + courseUid + ", canCheckVideo=" + canCheckVideo + ", canRecheckTopicRequest="
				+ canRecheckTopicRequest + ", isPublic=" + isPublic + ", canRecheckTopic=" + canRecheckTopic
				+ ", canCheckVideoRequest=" + canCheckVideoRequest + ", pathId=" + pathId + ", canCheckTopic="
				+ canCheckTopic + ", enableId=" + enableId + ", courseId=" + courseId + ", canCheckTopicRequest="
				+ canCheckTopicRequest + ", canPurchase=" + canPurchase + ", courseBrief=" + courseBrief
				+ ", courseKeyword=" + courseKeyword + ", courseImageUrl=" + courseImageUrl + ", courseRecheckRatio="
				+ courseRecheckRatio + ", resourceUid=" + resourceUid + ", knowitems=" + knowitems
				+ ", FullGradeCourse=" + FullGradeCourse + ", textbookList=" + textbookList + "]";
	}
	
}
