/**
 *	create by tools 2016-12-20 15:24:03
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：IKnowitem.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.model.resource.iKnowitem;

public class IKnowitem{

	private Integer knowitemUid;
	private String nodeId;
	private String knowitemId;

	public Integer getKnowitemUid(){

			return this.knowitemUid;
	}

	public void setKnowitemUid(Integer knowitemUid){
		this.knowitemUid=knowitemUid;
	}

	public String getNodeId(){

			return this.nodeId;
	}

	public void setNodeId(String nodeId){
		this.nodeId=nodeId;
	}

	public String getKnowitemId(){

			return this.knowitemId;
	}

	public void setKnowitemId(String knowitemId){
		this.knowitemId=knowitemId;
	}

}
