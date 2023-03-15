/**
 *	create by tools 2014-8-6 16:07:24
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：SystemIni.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.systemIni;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "sys_ini")
@IDGenerator(generator=GeneratorType.NATIVE)
public class SystemIni implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_SYSTEMINIID = "systemIniId";
	public static final String FIELD_APPID = "appId";
	public static final String FIELD_SYSTEMINI = "systemIni";
	public static final String FIELD_SYSTEMINIVALUES = "systemIniValues";
	public static final String FIELD_SYSTEMINITYPE = "systemIniType";
	public static final String FIELD_SYSTEMINICREATEDATETIME = "systemIniCreateDatetime";

	@Column(name="sys_ini_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String systemIniId;

	@Column(name="app_id", isPk=false, isFk=true,isBlob=false,isClob=false)
	private String appId;

	@Column(name="sys_ini", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String systemIni;

	@Column(name="sys_ini_values", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String systemIniValues;

	@Column(name="sys_ini_type", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String systemIniType;

	@Column(name="sys_ini_create_datetime", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.util.Date systemIniCreateDatetime;

	public String getSystemIniId(){

			return this.systemIniId;
	}

	public void setSystemIniId(String systemIniId){
		this.systemIniId=systemIniId;
	}

	public String getAppId(){

			return this.appId;
	}

	public void setAppId(String appId){
		this.appId=appId;
	}

	public String getSystemIni(){

			return this.systemIni;
	}

	public void setSystemIni(String systemIni){
		this.systemIni=systemIni;
	}

	public String getSystemIniValues(){

			return this.systemIniValues;
	}

	public void setSystemIniValues(String systemIniValues){
		this.systemIniValues=systemIniValues;
	}

	public String getSystemIniType(){

			return this.systemIniType;
	}

	public void setSystemIniType(String systemIniType){
		this.systemIniType=systemIniType;
	}

	public java.util.Date getSystemIniCreateDatetime(){

			return this.systemIniCreateDatetime;
	}

	public void setSystemIniCreateDatetime(java.util.Date systemIniCreateDatetime){
		this.systemIniCreateDatetime=systemIniCreateDatetime;
	}

}
