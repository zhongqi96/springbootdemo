/**
 *	create by tools 2018-11-22 10:09:19
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：MyMoneyFlow.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.myMoneyFlow;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "my_money_flow")
@IDGenerator(generator = GeneratorType.IDENTITY)
public class MyMoneyFlow implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_MYMONEYFLOWUID = "myMoneyFlowUid";
	public static final String FIELD_FLOWTYPEID = "flowTypeId";
	public static final String FIELD_REQUESTERUID = "requesterUid";
	public static final String FIELD_FLOWSTATUSID = "flowStatusId";
	public static final String FIELD_TLACCOUNTID = "tlAccountId";
	public static final String FIELD_CHECKERUID = "checkerUid";
	public static final String FIELD_USERBANKUID = "userBankUid";
	public static final String FIELD_MYMONEYORDERNO = "myMoneyOrderNo";
	public static final String FIELD_MYMONEYFLOWJOINUID = "myMoneyFlowJoinUid";
	public static final String FIELD_MYMONEYACCOUNT = "myMoneyAccount";
	public static final String FIELD_MYMONEYREQUESTDATETIME = "myMoneyRequestDatetime";
	public static final String FIELD_MYMONEYREQUESTDATETIMESTR = "myMoneyRequestDatetimeStr";
	public static final String FIELD_MYMONEYFINISHDATETIME = "myMoneyFinishDatetime";
	public static final String FIELD_MYMONEYFLOW = "myMoneyFlow";
	public static final String FIELD_MYMONEYFLOWFEE = "myMoneyFlowFee";
	public static final String FIELD_MYMONEYROADSUID = "myMoneyRoadsUid";
	public static final String FIELD_MYMONEYBANKORDERID = "myMoneyBankOrderId";
	public static final String FIELD_MYMONEYNOTES = "myMoneyNotes";
	public static final String FIELD_MYMONEYBANKNOTES = "myMoneyBankNotes";

	@Column(name = "my_money_flow_uid", isPk = true, isFk = false, isBlob = false, isClob = false)
	private int myMoneyFlowUid;

	@Column(name = "flow_type_id", isPk = false, isFk = true, isBlob = false, isClob = false)
	private String flowTypeId;

	@Column(name = "requester_uid", isPk = false, isFk = true, isBlob = false, isClob = false)
	private int requesterUid;

	@Column(name = "flow_status_id", isPk = false, isFk = true, isBlob = false, isClob = false)
	private String flowStatusId;

	@Column(name = "tl_account_id", isPk = false, isFk = false, isBlob = false, isClob = false)
	private String tlAccountId;

	@Column(name = "checker_uid", isPk = false, isFk = true, isBlob = false, isClob = false)
	private int checkerUid;

	@Column(name = "user_bank_uid", isPk = false, isFk = true, isBlob = false, isClob = false)
	private int userBankUid;

	@Column(name = "my_money_order_no", isPk = false, isFk = false, isBlob = false, isClob = false)
	private String myMoneyOrderNo;

	@Column(name = "my_money_flow_join_uid", isPk = false, isFk = false, isBlob = false, isClob = false)
	private int myMoneyFlowJoinUid;

	@Column(name = "my_money_account", isPk = false, isFk = false, isBlob = false, isClob = false)
	private String myMoneyAccount;

	@Column(name = "my_money_request_datetime", isPk = false, isFk = false, isBlob = false, isClob = false)
	private java.sql.Timestamp myMoneyRequestDatetime;

	@Column(name = "my_money_request_datetime_str", isPk = false, isFk = false, isBlob = false, isClob = false)
	private String myMoneyRequestDatetimeStr;

	@Column(name = "my_money_finish_datetime", isPk = false, isFk = false, isBlob = false, isClob = false)
	private java.sql.Timestamp myMoneyFinishDatetime;

	@Column(name = "my_money_flow", isPk = false, isFk = false, isBlob = false, isClob = false)
	private double myMoneyFlow;

	@Column(name = "my_money_flow_fee", isPk = false, isFk = false, isBlob = false, isClob = false)
	private double myMoneyFlowFee;

	@Column(name = "my_money_roads_uid", isPk = false, isFk = false, isBlob = false, isClob = false)
	private int myMoneyRoadsUid;

	@Column(name = "my_money_bank_order_id", isPk = false, isFk = false, isBlob = false, isClob = false)
	private String myMoneyBankOrderId;

	@Column(name = "my_money_notes", isPk = false, isFk = false, isBlob = false, isClob = false)
	private String myMoneyNotes;

	@Column(name = "my_money_bank_notes", isPk = false, isFk = false, isBlob = false, isClob = false)
	private String myMoneyBankNotes;

	public int getMyMoneyFlowUid() {

		return this.myMoneyFlowUid;
	}

	public void setMyMoneyFlowUid(int myMoneyFlowUid) {
		this.myMoneyFlowUid = myMoneyFlowUid;
	}

	public String getFlowTypeId() {

		return this.flowTypeId;
	}

	public void setFlowTypeId(String flowTypeId) {
		this.flowTypeId = flowTypeId;
	}

	public int getRequesterUid() {

		return this.requesterUid;
	}

	public void setRequesterUid(int requesterUid) {
		this.requesterUid = requesterUid;
	}

	public String getFlowStatusId() {

		return this.flowStatusId;
	}

	public void setFlowStatusId(String flowStatusId) {
		this.flowStatusId = flowStatusId;
	}

	public String getTlAccountId() {

		return this.tlAccountId;
	}

	public void setTlAccountId(String tlAccountId) {
		this.tlAccountId = tlAccountId;
	}

	public int getCheckerUid() {

		return this.checkerUid;
	}

	public void setCheckerUid(int checkerUid) {
		this.checkerUid = checkerUid;
	}

	public int getUserBankUid() {

		return this.userBankUid;
	}

	public void setUserBankUid(int userBankUid) {
		this.userBankUid = userBankUid;
	}

	public String getMyMoneyOrderNo() {

		return this.myMoneyOrderNo;
	}

	public void setMyMoneyOrderNo(String myMoneyOrderNo) {
		this.myMoneyOrderNo = myMoneyOrderNo;
	}

	public int getMyMoneyFlowJoinUid() {

		return this.myMoneyFlowJoinUid;
	}

	public void setMyMoneyFlowJoinUid(int myMoneyFlowJoinUid) {
		this.myMoneyFlowJoinUid = myMoneyFlowJoinUid;
	}

	public String getMyMoneyAccount() {

		return this.myMoneyAccount;
	}

	public void setMyMoneyAccount(String myMoneyAccount) {
		this.myMoneyAccount = myMoneyAccount;
	}

	public String getMyMoneyRequestDatetimeStr() {

		return this.myMoneyRequestDatetimeStr;
	}

	public java.sql.Timestamp getMyMoneyRequestDatetime() {
		return myMoneyRequestDatetime;
	}

	public void setMyMoneyRequestDatetime(java.sql.Timestamp myMoneyRequestDatetime) {
		this.myMoneyRequestDatetime = myMoneyRequestDatetime;
	}

	public void setMyMoneyRequestDatetimeStr(String myMoneyRequestDatetimeStr) {
		this.myMoneyRequestDatetimeStr = myMoneyRequestDatetimeStr;
	}

	public java.sql.Timestamp getMyMoneyFinishDatetime() {
		return myMoneyFinishDatetime;
	}

	public void setMyMoneyFinishDatetime(java.sql.Timestamp myMoneyFinishDatetime) {
		this.myMoneyFinishDatetime = myMoneyFinishDatetime;
	}

	public double getMyMoneyFlow() {

		return this.myMoneyFlow;
	}

	public void setMyMoneyFlow(double myMoneyFlow) {
		this.myMoneyFlow = myMoneyFlow;
	}

	public double getMyMoneyFlowFee() {

		return this.myMoneyFlowFee;
	}

	public void setMyMoneyFlowFee(double myMoneyFlowFee) {
		this.myMoneyFlowFee = myMoneyFlowFee;
	}

	public int getMyMoneyRoadsUid() {

		return this.myMoneyRoadsUid;
	}

	public void setMyMoneyRoadsUid(int myMoneyRoadsUid) {
		this.myMoneyRoadsUid = myMoneyRoadsUid;
	}

	public String getMyMoneyBankOrderId() {

		return this.myMoneyBankOrderId;
	}

	public void setMyMoneyBankOrderId(String myMoneyBankOrderId) {
		this.myMoneyBankOrderId = myMoneyBankOrderId;
	}

	public String getMyMoneyNotes() {

		return this.myMoneyNotes;
	}

	public void setMyMoneyNotes(String myMoneyNotes) {
		this.myMoneyNotes = myMoneyNotes;
	}

	public String getMyMoneyBankNotes() {

		return this.myMoneyBankNotes;
	}

	public void setMyMoneyBankNotes(String myMoneyBankNotes) {
		this.myMoneyBankNotes = myMoneyBankNotes;
	}

}
