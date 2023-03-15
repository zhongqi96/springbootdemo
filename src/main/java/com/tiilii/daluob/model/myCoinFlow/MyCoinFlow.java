/**
 *	create by tools 2018-11-22 10:09:19
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：MyCoinFlow.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.myCoinFlow;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "my_coin_flow")
@IDGenerator(generator=GeneratorType.IDENTITY)
public class MyCoinFlow implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_MYCOINFLOWUID = "myCoinFlowUid";
	public static final String FIELD_MYCOINUID = "myCoinUid";
	public static final String FIELD_FLOWTYPEID = "flowTypeId";
	public static final String FIELD_MYCOINFLOWJOINUID = "myCoinFlowJoinUid";
	public static final String FIELD_MYCOINFLOW = "myCoinFlow";
	public static final String FIELD_MYCOIN = "myCoin";
	public static final String FIELD_MYCOINDATETIME = "myCoinDatetime";

	@Column(name="my_coin_flow_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int myCoinFlowUid;

	@Column(name="my_coin_uid", isPk=false, isFk=true,isBlob=false,isClob=false)
	private int myCoinUid;

	@Column(name="flow_type_id", isPk=false, isFk=true,isBlob=false,isClob=false)
	private String flowTypeId;

	@Column(name="my_coin_flow_join_uid", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int myCoinFlowJoinUid;

	@Column(name="my_coin_flow", isPk=false, isFk=false,isBlob=false,isClob=false)
	private double myCoinFlow;

	@Column(name="my_coin", isPk=false, isFk=false,isBlob=false,isClob=false)
	private double myCoin;

	@Column(name="my_coin_datetime", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.util.Date myCoinDatetime;

	public int getMyCoinFlowUid(){

			return this.myCoinFlowUid;
	}

	public void setMyCoinFlowUid(int myCoinFlowUid){
		this.myCoinFlowUid=myCoinFlowUid;
	}

	public int getMyCoinUid(){

			return this.myCoinUid;
	}

	public void setMyCoinUid(int myCoinUid){
		this.myCoinUid=myCoinUid;
	}

	public String getFlowTypeId(){

			return this.flowTypeId;
	}

	public void setFlowTypeId(String flowTypeId){
		this.flowTypeId=flowTypeId;
	}

	public int getMyCoinFlowJoinUid(){

			return this.myCoinFlowJoinUid;
	}

	public void setMyCoinFlowJoinUid(int myCoinFlowJoinUid){
		this.myCoinFlowJoinUid=myCoinFlowJoinUid;
	}

	public double getMyCoinFlow(){

			return this.myCoinFlow;
	}

	public void setMyCoinFlow(double myCoinFlow){
		this.myCoinFlow=myCoinFlow;
	}

	public double getMyCoin(){

			return this.myCoin;
	}

	public void setMyCoin(double myCoin){
		this.myCoin=myCoin;
	}

	public java.util.Date getMyCoinDatetime(){

			return this.myCoinDatetime;
	}

	public void setMyCoinDatetime(java.util.Date myCoinDatetime){
		this.myCoinDatetime=myCoinDatetime;
	}

}
