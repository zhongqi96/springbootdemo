/**
 *	create by tools 2016-12-29 14:51:10
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：IMessageAttachment.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.model.message.iMessageAttachment;

import java.io.Serializable;

public class IMessageAttachment implements Serializable {

	private static final long serialVersionUID = 1L;

	private int messageAttachmentUid;

	private int messageUid;

	private String messageAttachmentUrl;

	private int messageAttachmentIndex;

	public int getMessageAttachmentUid(){

			return this.messageAttachmentUid;
	}

	public void setMessageAttachmentUid(int messageAttachmentUid){
		this.messageAttachmentUid=messageAttachmentUid;
	}

	public int getMessageUid(){

			return this.messageUid;
	}

	public void setMessageUid(int messageUid){
		this.messageUid=messageUid;
	}

	public String getMessageAttachmentUrl(){

			return this.messageAttachmentUrl;
	}

	public void setMessageAttachmentUrl(String messageAttachmentUrl){
		this.messageAttachmentUrl=messageAttachmentUrl;
	}

	public int getMessageAttachmentIndex(){

			return this.messageAttachmentIndex;
	}

	public void setMessageAttachmentIndex(int messageAttachmentIndex){
		this.messageAttachmentIndex=messageAttachmentIndex;
	}

}
