/**
 *	create by tools 2018-10-16 9:30:07
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：ITest.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.iTest;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "i_test")
@IDGenerator(generator=GeneratorType.IDENTITY)
public class ITest implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_TESTUID = "testUid";
	public static final String FIELD_TESTTYPEID = "testTypeId";
	public static final String FIELD_ISFINISH = "isFinish";
	public static final String FIELD_ENABLEID = "enableId";
	public static final String FIELD_CREATORUID = "creatorUid";
	public static final String FIELD_COURSEUID = "courseUid";
	public static final String FIELD_PAYUID = "payUid";
	public static final String FIELD_TESTNAME = "testName";
	public static final String FIELD_TESTBEGINDATETIME = "testBeginDatetime";
	public static final String FIELD_TESTENDDATETIME = "testEndDatetime";
	public static final String FIELD_TESTDIFFICULTY = "testDifficulty";
	public static final String FIELD_TESTDIFFERENTIATION = "testDifferentiation";
	public static final String FIELD_TESTDURING = "testDuring";
	public static final String FIELD_TESTUSERCOUNT = "testUserCount";
	public static final String FIELD_TESTTOPICCOUNT = "testTopicCount";
	public static final String FIELD_TESTCREATEDATETIME = "testCreateDatetime";

	@Column(name="test_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int testUid;

	@Column(name="test_type_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String testTypeId;

	@Column(name="is_finish", isPk=false, isFk=true,isBlob=false,isClob=false)
	private String isFinish;

	@Column(name="enable_id", isPk=false, isFk=true,isBlob=false,isClob=false)
	private String enableId;

	@Column(name="creator_uid", isPk=false, isFk=true,isBlob=false,isClob=false)
	private int creatorUid;

	@Column(name="course_uid", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int courseUid;

	@Column(name="pay_uid", isPk=false, isFk=true,isBlob=false,isClob=false)
	private int payUid;

	@Column(name="test_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String testName;

	@Column(name="test_begin_datetime", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.sql.Timestamp testBeginDatetime;

	@Column(name="test_end_datetime", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.sql.Timestamp testEndDatetime;

	@Column(name="test_difficulty", isPk=false, isFk=false,isBlob=false,isClob=false)
	private double testDifficulty;

	@Column(name="test_differentiation", isPk=false, isFk=false,isBlob=false,isClob=false)
	private double testDifferentiation;

	@Column(name="test_during", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int testDuring;

	@Column(name="test_user_count", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int testUserCount;

	@Column(name="test_topic_count", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int testTopicCount;

	@Column(name="test_create_datetime", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.sql.Timestamp testCreateDatetime;

	public int getTestUid(){

			return this.testUid;
	}

	public void setTestUid(int testUid){
		this.testUid=testUid;
	}

	public String getTestTypeId(){

			return this.testTypeId;
	}

	public void setTestTypeId(String testTypeId){
		this.testTypeId=testTypeId;
	}

	public String getIsFinish(){

			return this.isFinish;
	}

	public void setIsFinish(String isFinish){
		this.isFinish=isFinish;
	}

	public String getEnableId(){

			return this.enableId;
	}

	public void setEnableId(String enableId){
		this.enableId=enableId;
	}

	public int getCreatorUid(){

			return this.creatorUid;
	}

	public void setCreatorUid(int creatorUid){
		this.creatorUid=creatorUid;
	}

	public int getCourseUid(){

			return this.courseUid;
	}

	public void setCourseUid(int courseUid){
		this.courseUid=courseUid;
	}

	public int getPayUid(){

			return this.payUid;
	}

	public void setPayUid(int payUid){
		this.payUid=payUid;
	}

	public String getTestName(){

			return this.testName;
	}

	public void setTestName(String testName){
		this.testName=testName;
	}

	public java.sql.Timestamp getTestBeginDatetime(){

			return this.testBeginDatetime;
	}

	public void setTestBeginDatetime(java.sql.Timestamp testBeginDatetime){
		this.testBeginDatetime=testBeginDatetime;
	}

	public java.sql.Timestamp getTestEndDatetime(){

			return this.testEndDatetime;
	}

	public void setTestEndDatetime(java.sql.Timestamp testEndDatetime){
		this.testEndDatetime=testEndDatetime;
	}

	public double getTestDifficulty(){

			return this.testDifficulty;
	}

	public void setTestDifficulty(double testDifficulty){
		this.testDifficulty=testDifficulty;
	}

	public double getTestDifferentiation(){

			return this.testDifferentiation;
	}

	public void setTestDifferentiation(double testDifferentiation){
		this.testDifferentiation=testDifferentiation;
	}

	public int getTestDuring(){

			return this.testDuring;
	}

	public void setTestDuring(int testDuring){
		this.testDuring=testDuring;
	}

	public int getTestUserCount(){

			return this.testUserCount;
	}

	public void setTestUserCount(int testUserCount){
		this.testUserCount=testUserCount;
	}

	public int getTestTopicCount(){

			return this.testTopicCount;
	}

	public void setTestTopicCount(int testTopicCount){
		this.testTopicCount=testTopicCount;
	}

	public java.sql.Timestamp getTestCreateDatetime(){

			return this.testCreateDatetime;
	}

	public void setTestCreateDatetime(java.sql.Timestamp testCreateDatetime){
		this.testCreateDatetime=testCreateDatetime;
	}

}
