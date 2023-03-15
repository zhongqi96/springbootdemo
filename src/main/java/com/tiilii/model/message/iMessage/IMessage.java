/**
 *	create by tools 2016-12-29 14:51:10
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：IMessage.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.model.message.iMessage;

import java.util.List;

import com.tiilii.model.message.iMessageAttachment.IMessageAttachment;
import com.tiilii.model.message.iMessageMember.IMessageMember;

public class IMessage {

	private int messageUid;

	private int parentUid;

	private String appId;

	private String enableId;

	private int ppUid;

	private int messageTypeUid;

	private int userUid;

	private String messageEditTime;

	private String messageNotes;

	public int getMessageUid() {
		return this.messageUid;
	}

	public void setMessageUid(int messageUid) {
		this.messageUid = messageUid;
	}

	public int getParentUid() {

		return this.parentUid;
	}

	public void setParentUid(int parentUid) {
		this.parentUid = parentUid;
	}

	public String getAppId() {

		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getEnableId() {

		return this.enableId;
	}

	public void setEnableId(String enableId) {
		this.enableId = enableId;
	}

	public int getPpUid() {

		return this.ppUid;
	}

	public void setPpUid(int ppUid) {
		this.ppUid = ppUid;
	}

	public int getMessageTypeUid() {

		return this.messageTypeUid;
	}

	public void setMessageTypeUid(int messageTypeUid) {
		this.messageTypeUid = messageTypeUid;
	}

	public int getUserUid() {

		return this.userUid;
	}

	public void setUserUid(int userUid) {
		this.userUid = userUid;
	}

	public String getMessageEditTime() {

		return this.messageEditTime;
	}

	public void setMessageEditTime(String messageEditTime) {
		this.messageEditTime = messageEditTime;
	}

	public String getMessageNotes() {

		return this.messageNotes;
	}

	public void setMessageNotes(String messageNotes) {
		this.messageNotes = messageNotes;
	}

	private List<IMessageMember> messageMembers;
	private List<IMessageAttachment> messageAttachments;

	public List<IMessageMember> getMessageMembers() {
		return messageMembers;
	}

	public void setMessageMembers(List<IMessageMember> messageMembers) {
		this.messageMembers = messageMembers;
	}

	public List<IMessageAttachment> getMessageAttachments() {
		return messageAttachments;
	}

	public void setMessageAttachments(List<IMessageAttachment> messageAttachments) {
		this.messageAttachments = messageAttachments;
	}
}
