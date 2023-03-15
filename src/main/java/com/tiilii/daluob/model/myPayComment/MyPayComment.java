/**
 *	create by tools 2019-2-28 14:05:47
 *	Copyright © 2018 武汉天量技术有限公司
 *	注意：MyPayComment.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.myPayComment;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "my_pay_comment")
@IDGenerator(generator=GeneratorType.IDENTITY)
public class MyPayComment implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_PAYCOMMENTUID = "payCommentUid";
	public static final String FIELD_PAYUID = "payUid";
	public static final String FIELD_PAYCOMMENTTYPE = "payCommentType";
	public static final String FIELD_PAYCOMMENT = "payComment";
	public static final String FIELD_PAYCOMMENTDATETIME = "payCommentDatetime";
	public static final String FIELD_PAYCOMMENTCOUNTOFGOOD = "payCommentCountOfGood";
	public static final String FIELD_PAYCOMMENTMESSAGEUID = "payCommentMessageUid";

	@Column(name="pay_comment_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int payCommentUid;

	@Column(name="pay_uid", isPk=false, isFk=true,isBlob=false,isClob=false)
	private int payUid;

	@Column(name="pay_comment_type", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String payCommentType;

	@Column(name="pay_comment", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String payComment;

	@Column(name="pay_comment_datetime", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.sql.Timestamp payCommentDatetime;

	@Column(name="pay_comment_count_of_good", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int payCommentCountOfGood;

	@Column(name="pay_comment_message_uid", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int payCommentMessageUid;

	public int getPayCommentUid(){

			return this.payCommentUid;
	}

	public void setPayCommentUid(int payCommentUid){
		this.payCommentUid=payCommentUid;
	}

	public int getPayUid(){

			return this.payUid;
	}

	public void setPayUid(int payUid){
		this.payUid=payUid;
	}

	public String getPayCommentType(){

			return this.payCommentType;
	}

	public void setPayCommentType(String payCommentType){
		this.payCommentType=payCommentType;
	}

	public String getPayComment(){

			return this.payComment;
	}

	public void setPayComment(String payComment){
		this.payComment=payComment;
	}

	public java.sql.Timestamp getPayCommentDatetime(){

			return this.payCommentDatetime;
	}

	public void setPayCommentDatetime(java.sql.Timestamp payCommentDatetime){
		this.payCommentDatetime=payCommentDatetime;
	}

	public int getPayCommentCountOfGood(){

			return this.payCommentCountOfGood;
	}

	public void setPayCommentCountOfGood(int payCommentCountOfGood){
		this.payCommentCountOfGood=payCommentCountOfGood;
	}

	public int getPayCommentMessageUid(){

			return this.payCommentMessageUid;
	}

	public void setPayCommentMessageUid(int payCommentMessageUid){
		this.payCommentMessageUid=payCommentMessageUid;
	}

}
