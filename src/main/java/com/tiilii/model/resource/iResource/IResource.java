/**
 *	create by tools 2016-12-20 15:24:03
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：IResource.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.model.resource.iResource;

import com.tiilii.model.resource.iTopic.ITopic;

public class IResource{

	private Integer resourceUid;

	private Integer courseUid;

	private String resourceContentTypeId;

	private String languageId;
	private String isPublic;

	private int resourceYear;

	private int ownerUid;
	private ITopic topic;
	private String courseName;
	public Integer getResourceUid(){

			return this.resourceUid;
	}

	public void setResourceUid(Integer resourceUid){
		this.resourceUid=resourceUid;
	}

	public Integer getCourseUid(){

			return this.courseUid;
	}

	public void setCourseUid(Integer courseUid){
		this.courseUid=courseUid;
	}

	public String getResourceContentTypeId(){

			return this.resourceContentTypeId;
	}

	public void setResourceContentTypeId(String resourceContentTypeId){
		this.resourceContentTypeId=resourceContentTypeId;
	}

	public String getLanguageId() {
		return languageId;
	}

	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}

	public String getIsPublic() {
		return isPublic;
	}

	public void setIsPublic(String isPublic) {
		this.isPublic = isPublic;
	}

	public int getResourceYear() {
		return resourceYear;
	}

	public void setResourceYear(int resourceYear) {
		this.resourceYear = resourceYear;
	}

	public int getOwnerUid() {
		return ownerUid;
	}

	public void setOwnerUid(int ownerUid) {
		this.ownerUid = ownerUid;
	}

	public ITopic getTopic() {
		return topic;
	}

	public void setTopic(ITopic topic) {
		this.topic = topic;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
}
