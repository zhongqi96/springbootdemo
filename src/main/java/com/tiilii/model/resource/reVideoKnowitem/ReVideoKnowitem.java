/**
 *	create by tools 2016-12-20 15:24:04
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：ReVideoKnowitem.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.model.resource.reVideoKnowitem;

public class ReVideoKnowitem{

	private Integer videoKnowitemUid;

	private String knowitemId;

	private Integer videoUid;

	private Integer weight;

	public Integer getVideoKnowitemUid(){

			return this.videoKnowitemUid;
	}

	public void setVideoKnowitemUid(Integer videoKnowitemUid){
		this.videoKnowitemUid=videoKnowitemUid;
	}

	public String getKnowitemId(){

			return this.knowitemId;
	}

	public void setKnowitemId(String knowitemId){
		this.knowitemId=knowitemId;
	}

	public Integer getVideoUid(){

			return this.videoUid;
	}

	public void setVideoUid(Integer videoUid){
		this.videoUid=videoUid;
	}

	public Integer getWeight(){

			return this.weight;
	}

	public void setWeight(Integer weight){
		this.weight=weight;
	}

}
