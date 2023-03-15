/**
 *	create by tools 2018-11-22 10:09:19
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：MyPay.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.myPay;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "my_pay")
@IDGenerator(generator=GeneratorType.IDENTITY)
public class MyPay implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_PAYUID = "payUid";
	public static final String FIELD_APPID = "appId";
	public static final String FIELD_PAYSTATUSID = "payStatusId";
	public static final String FIELD_REQUESTERUID = "requesterUid";
	public static final String FIELD_PAYERUID = "payerUid";
	public static final String FIELD_APPUID = "appUid";
	public static final String FIELD_PAYMONEY = "payMoney";
	public static final String FIELD_PAYCREATEDATETIME = "payCreateDatetime";
	public static final String FIELD_PAYDATETIME = "payDatetime";
	public static final String FIELD_PAYNOTES = "payNotes";

	@Column(name="pay_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int payUid;

	@Column(name="app_id", isPk=false, isFk=true,isBlob=false,isClob=false)
	private String appId;

	@Column(name="pay_status_id", isPk=false, isFk=true,isBlob=false,isClob=false)
	private String payStatusId;

	@Column(name="requester_uid", isPk=false, isFk=true,isBlob=false,isClob=false)
	private int requesterUid;

	@Column(name="payer_uid", isPk=false, isFk=true,isBlob=false,isClob=false)
	private int payerUid;

	@Column(name="app_uid", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int appUid;

	@Column(name="pay_money", isPk=false, isFk=false,isBlob=false,isClob=false)
	private double payMoney;

	@Column(name="pay_create_datetime", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.util.Date payCreateDatetime;

	@Column(name="pay_datetime", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.util.Date payDatetime;

	@Column(name="pay_notes", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String payNotes;

	public int getPayUid(){

			return this.payUid;
	}

	public void setPayUid(int payUid){
		this.payUid=payUid;
	}

	public String getAppId(){

			return this.appId;
	}

	public void setAppId(String appId){
		this.appId=appId;
	}

	public String getPayStatusId(){

			return this.payStatusId;
	}

	public void setPayStatusId(String payStatusId){
		this.payStatusId=payStatusId;
	}

	public int getRequesterUid(){

			return this.requesterUid;
	}

	public void setRequesterUid(int requesterUid){
		this.requesterUid=requesterUid;
	}

	public int getPayerUid(){

			return this.payerUid;
	}

	public void setPayerUid(int payerUid){
		this.payerUid=payerUid;
	}

	public int getAppUid(){

			return this.appUid;
	}

	public void setAppUid(int appUid){
		this.appUid=appUid;
	}

	public double getPayMoney(){

			return this.payMoney;
	}

	public void setPayMoney(double payMoney){
		this.payMoney=payMoney;
	}

	public java.util.Date getPayCreateDatetime(){

			return this.payCreateDatetime;
	}

	public void setPayCreateDatetime(java.util.Date payCreateDatetime){
		this.payCreateDatetime=payCreateDatetime;
	}

	public java.util.Date getPayDatetime(){

			return this.payDatetime;
	}

	public void setPayDatetime(java.util.Date payDatetime){
		this.payDatetime=payDatetime;
	}

	public String getPayNotes(){

			return this.payNotes;
	}

	public void setPayNotes(String payNotes){
		this.payNotes=payNotes;
	}

}
