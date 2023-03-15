/**
 *	create by tools 2017-2-8 10:53:03
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimWebservice.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.model.message.dim.dimEnable;


public class DimWebservice{
	private String webserviceId;

	private String webserviceName;

	public String getWebserviceId(){

			return this.webserviceId;
	}

	public void setWebserviceId(String webserviceId){
		this.webserviceId=webserviceId;
	}

	public String getWebserviceName(){

			return this.webserviceName;
	}

	public void setWebserviceName(String webserviceName){
		this.webserviceName=webserviceName;
	}

}
