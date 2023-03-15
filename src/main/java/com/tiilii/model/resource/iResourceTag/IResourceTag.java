/**
 *	create by tools 2017-2-18 20:13:50
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：IResourceTag.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.model.resource.iResourceTag;

public class IResourceTag{
	
	private int resourceTagUid;

	private String resourceTagTypeId;

	private String enableId;

	private int resourceUid;
	
	private int courseUid;
	
	private String logActionDatetime;
	
	public String getLogActionDatetime() {
		return logActionDatetime;
	}

	public void setLogActionDatetime(String logActionDatetime) {
		this.logActionDatetime = logActionDatetime;
	}

	public int getCourseUid() {
		return courseUid;
	}

	public void setCourseUid(int courseUid) {
		this.courseUid = courseUid;
	}

	public int getResourceTagUid(){

			return this.resourceTagUid;
	}

	public void setResourceTagUid(int resourceTagUid){
		this.resourceTagUid=resourceTagUid;
	}

	public String getResourceTagTypeId(){

			return this.resourceTagTypeId;
	}

	public void setResourceTagTypeId(String resourceTagTypeId){
		this.resourceTagTypeId=resourceTagTypeId;
	}

	public String getEnableId(){

			return this.enableId;
	}

	public void setEnableId(String enableId){
		this.enableId=enableId;
	}

	public int getResourceUid(){

			return this.resourceUid;
	}

	public void setResourceUid(int resourceUid){
		this.resourceUid=resourceUid;
	}

}
