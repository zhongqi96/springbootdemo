/**
 *	create by tools 2018-10-24 16:25:48
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：ReUserTrust.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.reUserTrust;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "re_user_trust")
@IDGenerator(generator=GeneratorType.IDENTITY)
public class ReUserTrust implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_USERTRUSTUID = "userTrustUid";
	public static final String FIELD_REQUESTERUID = "requesterUid";
	public static final String FIELD_ENABLEID = "enableId";
	public static final String FIELD_PAYERUID = "payerUid";
	public static final String FIELD_USERTRUSTCREATEDATETIME = "userTrustCreateDatetime";
	public static final String FIELD_USERTRUSTCANCELDATETIME = "userTrustCancelDatetime";

	@Column(name="user_trust_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int userTrustUid;

	@Column(name="requester_uid", isPk=false, isFk=true,isBlob=false,isClob=false)
	private int requesterUid;

	@Column(name="enable_id", isPk=false, isFk=true,isBlob=false,isClob=false)
	private String enableId;

	@Column(name="payer_uid", isPk=false, isFk=true,isBlob=false,isClob=false)
	private int payerUid;

	@Column(name="user_trust_create_datetime", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.util.Date userTrustCreateDatetime;

	@Column(name="user_trust_cancel_datetime", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.util.Date userTrustCancelDatetime;

	public int getUserTrustUid(){

			return this.userTrustUid;
	}

	public void setUserTrustUid(int userTrustUid){
		this.userTrustUid=userTrustUid;
	}

	public int getRequesterUid(){

			return this.requesterUid;
	}

	public void setRequesterUid(int requesterUid){
		this.requesterUid=requesterUid;
	}

	public String getEnableId(){

			return this.enableId;
	}

	public void setEnableId(String enableId){
		this.enableId=enableId;
	}

	public int getPayerUid(){

			return this.payerUid;
	}

	public void setPayerUid(int payerUid){
		this.payerUid=payerUid;
	}

	public java.util.Date getUserTrustCreateDatetime(){

			return this.userTrustCreateDatetime;
	}

	public void setUserTrustCreateDatetime(java.util.Date userTrustCreateDatetime){
		this.userTrustCreateDatetime=userTrustCreateDatetime;
	}

	public java.util.Date getUserTrustCancelDatetime(){

			return this.userTrustCancelDatetime;
	}

	public void setUserTrustCancelDatetime(java.util.Date userTrustCancelDatetime){
		this.userTrustCancelDatetime=userTrustCancelDatetime;
	}

}
