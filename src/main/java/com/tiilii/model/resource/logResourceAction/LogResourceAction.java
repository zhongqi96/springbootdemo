/**
 *	create by tools 2016-12-20 15:24:04
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：LogResource.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.model.resource.logResourceAction;

import java.sql.Timestamp;

public class LogResourceAction{
	private Integer logActionUid;
	private Integer resourceUid;
	private String actionTypeId;
	private String appId;
	private Integer userUid;
	private Timestamp logActionDatetime;
	public Integer getLogActionUid() {
		return logActionUid;
	}
	public void setLogActionUid(Integer logActionUid) {
		this.logActionUid = logActionUid;
	}
	public Integer getResourceUid() {
		return resourceUid;
	}
	public void setResourceUid(Integer resourceUid) {
		this.resourceUid = resourceUid;
	}
	public String getActionTypeId() {
		return actionTypeId;
	}
	public void setActionTypeId(String actionTypeId) {
		this.actionTypeId = actionTypeId;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public Integer getUserUid() {
		return userUid;
	}
	public void setUserUid(Integer userUid) {
		this.userUid = userUid;
	}
	
	public Timestamp getLogActionDatetime() {
		return logActionDatetime;
	}
	public void setLogActionDatetime(Timestamp logActionDatetime) {
		this.logActionDatetime = logActionDatetime;
	}


	//课程
	private String courseBrief;
	public String getCourseBrief() {
		return courseBrief;
	}
	public void setCourseBrief(String courseBrief) {
		this.courseBrief = courseBrief;
	}
	private String pathName;
	private String courseName;
	
	public String getPathName() {
		return pathName;
	}
	public void setPathName(String pathName) {
		this.pathName = pathName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	//记录题目的初审和复审时间(题目专用)
	private Timestamp topicCheckDatetime;
	private Timestamp topicRecheckDatetime;
	
	
	public Timestamp getTopicCheckDatetime() {
		return topicCheckDatetime;
	}
	public void setTopicCheckDatetime(Timestamp topicCheckDatetime) {
		this.topicCheckDatetime = topicCheckDatetime;
	}
	public Timestamp getTopicRecheckDatetime() {
		return topicRecheckDatetime;
	}
	public void setTopicRecheckDatetime(Timestamp topicRecheckDatetime) {
		this.topicRecheckDatetime = topicRecheckDatetime;
	}


	//如果是视频日志记录视频的字段
	private String videoName;
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	
}
