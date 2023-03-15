/**
 *	create by tools 2018-8-16 14:32:18
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：ITestInfo.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.iTestInfo;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "i_test_info")
@IDGenerator(generator=GeneratorType.NATIVE)
public class ITestInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_TESTUID = "testUid";
	public static final String FIELD_TESTINFOTYPEID = "testInfoTypeId";
	public static final String FIELD_INFOVALUE = "infoValue";

	@Column(name="test_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int testUid;

	@Column(name="test_info_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String testInfoTypeId;

	@Column(name="info_value", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String infoValue;

	public int getTestUid(){

			return this.testUid;
	}

	public void setTestUid(int testUid){
		this.testUid=testUid;
	}

	public String getTestInfoTypeId(){

			return this.testInfoTypeId;
	}

	public void setTestInfoTypeId(String testInfoTypeId){
		this.testInfoTypeId=testInfoTypeId;
	}

	public String getInfoValue(){

			return this.infoValue;
	}

	public void setInfoValue(String infoValue){
		this.infoValue=infoValue;
	}

}
