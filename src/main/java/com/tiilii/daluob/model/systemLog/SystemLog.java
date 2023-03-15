/**
 *	create by tools 2018-12-20 17:32:21
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：SystemLog.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.systemLog;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "sys_log")
@IDGenerator(generator=GeneratorType.IDENTITY)
public class SystemLog implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_SYSTEMLOGUID = "systemLogUid";
	public static final String FIELD_USERUID = "userUid";
	public static final String FIELD_APPID = "appId";
	public static final String FIELD_SYSTEMLOGDATETIME = "systemLogDatetime";
	public static final String FIELD_SYSTEMLOGFUNCTION = "systemLogFunction";
	public static final String FIELD_SYSTEMLOGIP = "systemLogIp";
	public static final String FIELD_SYSTEMLOGBROWSER = "systemLogBrowser";
	public static final String FIELD_SYSTEMLOGOS = "systemLogOs";
	public static final String FIELD_SYSTEMLOGDEVICE = "systemLogDevice";

	@Column(name="sys_log_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int systemLogUid;

	@Column(name="user_uid", isPk=false, isFk=true,isBlob=false,isClob=false)
	private int userUid;

	@Column(name="app_id", isPk=false, isFk=true,isBlob=false,isClob=false)
	private String appId;

	@Column(name="sys_log_datetime", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.util.Date systemLogDatetime;

	@Column(name="sys_log_function", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String systemLogFunction;

	@Column(name="sys_log_ip", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String systemLogIp;

	@Column(name="sys_log_browser", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String systemLogBrowser;

	@Column(name="sys_log_os", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String systemLogOs;

	@Column(name="sys_log_device", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String systemLogDevice;

	public int getSystemLogUid(){

			return this.systemLogUid;
	}

	public void setSystemLogUid(int systemLogUid){
		this.systemLogUid=systemLogUid;
	}

	public int getUserUid(){

			return this.userUid;
	}

	public void setUserUid(int userUid){
		this.userUid=userUid;
	}

	public String getAppId(){

			return this.appId;
	}

	public void setAppId(String appId){
		this.appId=appId;
	}

	public java.util.Date getSystemLogDatetime(){

			return this.systemLogDatetime;
	}

	public void setSystemLogDatetime(java.util.Date systemLogDatetime){
		this.systemLogDatetime=systemLogDatetime;
	}

	public String getSystemLogFunction(){

			return this.systemLogFunction;
	}

	public void setSystemLogFunction(String systemLogFunction){
		this.systemLogFunction=systemLogFunction;
	}

	public String getSystemLogIp(){

			return this.systemLogIp;
	}

	public void setSystemLogIp(String systemLogIp){
		this.systemLogIp=systemLogIp;
	}

	public String getSystemLogBrowser(){

			return this.systemLogBrowser;
	}

	public void setSystemLogBrowser(String systemLogBrowser){
		this.systemLogBrowser=systemLogBrowser;
	}

	public String getSystemLogOs(){

			return this.systemLogOs;
	}

	public void setSystemLogOs(String systemLogOs){
		this.systemLogOs=systemLogOs;
	}

	public String getSystemLogDevice(){

			return this.systemLogDevice;
	}

	public void setSystemLogDevice(String systemLogDevice){
		this.systemLogDevice=systemLogDevice;
	}

}
