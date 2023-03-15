/**
 *	create by tools 2016-12-20 15:24:03
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：IPublisher.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.model.resource.iPublisher;

public class IPublisher{

	private String publisherIsbn;

	private String enableId;

	private String publisherName;

	private String publisherBrife;

	private String dispIndex1;

	public String getPublisherIsbn(){

			return this.publisherIsbn;
	}

	public void setPublisherIsbn(String publisherIsbn){
		this.publisherIsbn=publisherIsbn;
	}

	public String getEnableId(){

			return this.enableId;
	}

	public void setEnableId(String enableId){
		this.enableId=enableId;
	}

	public String getPublisherName(){

			return this.publisherName;
	}

	public void setPublisherName(String publisherName){
		this.publisherName=publisherName;
	}

	public String getPublisherBrife(){

			return this.publisherBrife;
	}

	public void setPublisherBrife(String publisherBrife){
		this.publisherBrife=publisherBrife;
	}

	public String getDispIndex1(){

			return this.dispIndex1;
	}

	public void setDispIndex1(String dispIndex1){
		this.dispIndex1=dispIndex1;
	}

}
