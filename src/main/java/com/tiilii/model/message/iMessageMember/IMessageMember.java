/**
 *	create by tools 2016-12-29 14:51:10
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：IMessageMember.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.model.message.iMessageMember;

public class IMessageMember{

	private int messageMemberUid;

	private String hasRead;

	private String appId;

	private String enableId;

	private int messageUid;

	private int userUid;

	private String messageReadDatetime;

	public int getMessageMemberUid(){

			return this.messageMemberUid;
	}

	public void setMessageMemberUid(int messageMemberUid){
		this.messageMemberUid=messageMemberUid;
	}

	public String getHasRead(){

			return this.hasRead;
	}

	public void setHasRead(String hasRead){
		this.hasRead=hasRead;
	}

	public String getAppId(){

			return this.appId;
	}

	public void setAppId(String appId){
		this.appId=appId;
	}

	public int getMessageUid(){

			return this.messageUid;
	}

	public void setMessageUid(int messageUid){
		this.messageUid=messageUid;
	}
	public String getEnableId(){

		return this.enableId;
    }

   public void setEnableId(String enableId){
	this.enableId=enableId;
    }
	
	
	public int getUserUid(){

			return this.userUid;
	}

	public void setUserUid(int userUid){
		this.userUid=userUid;
	}

	public String getMessageReadDatetime(){

			return this.messageReadDatetime;
	}

	public void setMessageReadDatetime(String messageReadDatetime){
		this.messageReadDatetime=messageReadDatetime;
	}

}
