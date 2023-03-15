/**
 *	create by tools 2018-11-22 10:09:20
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：MyScoreFlow.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.myScoreFlow;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "my_score_flow")
@IDGenerator(generator=GeneratorType.IDENTITY)
public class MyScoreFlow implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_MYSCOREFLOWUID = "myScoreFlowUid";
	public static final String FIELD_MYSCOREUID = "myScoreUid";
	public static final String FIELD_FLOWTYPEID = "flowTypeId";
	public static final String FIELD_MYSCOREFLOWJOINUID = "myScoreFlowJoinUid";
	public static final String FIELD_MYSCOREFLOW = "myScoreFlow";
	public static final String FIELD_MYSCORE = "myScore";
	public static final String FIELD_MYSCOREDATETIME = "myScoreDatetime";

	@Column(name="my_score_flow_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int myScoreFlowUid;

	@Column(name="my_score_uid", isPk=false, isFk=true,isBlob=false,isClob=false)
	private int myScoreUid;

	@Column(name="flow_type_id", isPk=false, isFk=true,isBlob=false,isClob=false)
	private String flowTypeId;

	@Column(name="my_score_flow_join_uid", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int myScoreFlowJoinUid;

	@Column(name="my_score_flow", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int myScoreFlow;

	@Column(name="my_score", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int myScore;

	@Column(name="my_score_datetime", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.util.Date myScoreDatetime;

	public int getMyScoreFlowUid(){

			return this.myScoreFlowUid;
	}

	public void setMyScoreFlowUid(int myScoreFlowUid){
		this.myScoreFlowUid=myScoreFlowUid;
	}

	public int getMyScoreUid(){

			return this.myScoreUid;
	}

	public void setMyScoreUid(int myScoreUid){
		this.myScoreUid=myScoreUid;
	}

	public String getFlowTypeId(){

			return this.flowTypeId;
	}

	public void setFlowTypeId(String flowTypeId){
		this.flowTypeId=flowTypeId;
	}

	public int getMyScoreFlowJoinUid(){

			return this.myScoreFlowJoinUid;
	}

	public void setMyScoreFlowJoinUid(int myScoreFlowJoinUid){
		this.myScoreFlowJoinUid=myScoreFlowJoinUid;
	}

	public int getMyScoreFlow(){

			return this.myScoreFlow;
	}

	public void setMyScoreFlow(int myScoreFlow){
		this.myScoreFlow=myScoreFlow;
	}

	public int getMyScore(){

			return this.myScore;
	}

	public void setMyScore(int myScore){
		this.myScore=myScore;
	}

	public java.util.Date getMyScoreDatetime(){

			return this.myScoreDatetime;
	}

	public void setMyScoreDatetime(java.util.Date myScoreDatetime){
		this.myScoreDatetime=myScoreDatetime;
	}

}
