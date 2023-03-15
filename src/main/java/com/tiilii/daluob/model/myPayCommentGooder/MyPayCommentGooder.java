/**
 *	create by tools 2019-2-28 14:05:47
 *	Copyright © 2018 武汉天量技术有限公司
 *	注意：MyPayCommentGooder.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.myPayCommentGooder;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "my_pay_comment_gooder")
@IDGenerator(generator=GeneratorType.NATIVE)
public class MyPayCommentGooder implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_GOODERUID = "gooderUid";
	public static final String FIELD_PAYCOMMENTUID = "payCommentUid";

	@Column(name="gooder_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int gooderUid;

	@Column(name="pay_comment_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int payCommentUid;

	public int getGooderUid(){

			return this.gooderUid;
	}

	public void setGooderUid(int gooderUid){
		this.gooderUid=gooderUid;
	}

	public int getPayCommentUid(){

			return this.payCommentUid;
	}

	public void setPayCommentUid(int payCommentUid){
		this.payCommentUid=payCommentUid;
	}

}
