/**
 *	create by tools 2016-12-20 15:24:04
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：ReTextbookKnowitem.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.model.resource.reTextbookKnowitem;

public class ReTextbookKnowitem{
	private Integer textbookKnowitemUid;

	private String knowitemId;

	private Integer textbookStructureUid;

	private Integer knowitemRatio;

	public Integer getTextbookKnowitemUid(){

			return this.textbookKnowitemUid;
	}

	public void setTextbookKnowitemUid(Integer textbookKnowitemUid){
		this.textbookKnowitemUid=textbookKnowitemUid;
	}

	public String getKnowitemId(){

			return this.knowitemId;
	}

	public void setKnowitemId(String knowitemId){
		this.knowitemId=knowitemId;
	}

	public Integer getTextbookStructureUid(){

			return this.textbookStructureUid;
	}

	public void setTextbookStructureUid(Integer textbookStructureUid){
		this.textbookStructureUid=textbookStructureUid;
	}

	public Integer getKnowitemRatio(){

			return this.knowitemRatio;
	}

	public void setKnowitemRatio(Integer knowitemRatio){
		this.knowitemRatio=knowitemRatio;
	}

}
