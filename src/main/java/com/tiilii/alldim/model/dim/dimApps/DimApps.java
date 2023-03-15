/**
 *	create by tools 2019-1-15 17:16:56
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimApps.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimApps;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_apps")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimApps implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_APPID = "appId";
	public static final String FIELD_APPNAME = "appName";
	public static final String FIELD_APPBRIEF = "appBrief";
	public static final String FIELD_APPKEY = "appKey";
	public static final String FIELD_APPIMAGE32X32 = "appImage32x32";
	public static final String FIELD_APPIMAGE100X100 = "appImage100x100";
	public static final String FIELD_APPIMAGE200X200 = "appImage200x200";
	public static final String FIELD_APPLINK = "appLink";
	public static final String FIELD_APPCREATEDATE = "appCreateDate";
	public static final String FIELD_APPSSOURL = "appSsoUrl";
	public static final String FIELD_APPSESSION = "appSession";
	public static final String FIELD_APPSTATUS = "appStatus";

	@Column(name="app_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String appId;

	@Column(name="app_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String appName;

	@Column(name="app_brief", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String appBrief;

	@Column(name="app_key", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String appKey;

	@Column(name="app_image_32x32", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String appImage32x32;

	@Column(name="app_image_100x100", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String appImage100x100;

	@Column(name="app_image_200x200", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String appImage200x200;

	@Column(name="app_link", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String appLink;

	@Column(name="app_create_date", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.util.Date appCreateDate;

	@Column(name="app_sso_url", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String appSsoUrl;

	@Column(name="app_session", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int appSession;

	@Column(name="app_status", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String appStatus;

	public String getAppId(){

			return this.appId;
	}

	public void setAppId(String appId){
		this.appId=appId;
	}

	public String getAppName(){

			return this.appName;
	}

	public void setAppName(String appName){
		this.appName=appName;
	}

	public String getAppBrief(){

			return this.appBrief;
	}

	public void setAppBrief(String appBrief){
		this.appBrief=appBrief;
	}

	public String getAppKey(){

			return this.appKey;
	}

	public void setAppKey(String appKey){
		this.appKey=appKey;
	}

	public String getAppImage32x32(){

			return this.appImage32x32;
	}

	public void setAppImage32x32(String appImage32x32){
		this.appImage32x32=appImage32x32;
	}

	public String getAppImage100x100(){

			return this.appImage100x100;
	}

	public void setAppImage100x100(String appImage100x100){
		this.appImage100x100=appImage100x100;
	}

	public String getAppImage200x200(){

			return this.appImage200x200;
	}

	public void setAppImage200x200(String appImage200x200){
		this.appImage200x200=appImage200x200;
	}

	public String getAppLink(){

			return this.appLink;
	}

	public void setAppLink(String appLink){
		this.appLink=appLink;
	}

	public java.util.Date getAppCreateDate(){

			return this.appCreateDate;
	}

	public void setAppCreateDate(java.util.Date appCreateDate){
		this.appCreateDate=appCreateDate;
	}

	public String getAppSsoUrl(){

			return this.appSsoUrl;
	}

	public void setAppSsoUrl(String appSsoUrl){
		this.appSsoUrl=appSsoUrl;
	}

	public int getAppSession(){

			return this.appSession;
	}

	public void setAppSession(int appSession){
		this.appSession=appSession;
	}

	public String getAppStatus(){

			return this.appStatus;
	}

	public void setAppStatus(String appStatus){
		this.appStatus=appStatus;
	}

}
