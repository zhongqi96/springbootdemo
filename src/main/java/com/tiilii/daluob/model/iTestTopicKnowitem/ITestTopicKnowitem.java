/**
 *	create by tools 2018-7-6 12:05:56
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：ITestTopicKnowitem.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.iTestTopicKnowitem;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "i_test_topic_knowitem")
@IDGenerator(generator=GeneratorType.NATIVE)
public class ITestTopicKnowitem implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_KNOWITEMID = "knowitemId";
	public static final String FIELD_TESTTOPICUID = "testTopicUid";
	public static final String FIELD_WEIGHT = "weight";

	@Column(name="knowitem_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String knowitemId;

	@Column(name="test_topic_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int testTopicUid;

	@Column(name="weight", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int weight;

	public String getKnowitemId(){

			return this.knowitemId;
	}

	public void setKnowitemId(String knowitemId){
		this.knowitemId=knowitemId;
	}

	public int getTestTopicUid(){

			return this.testTopicUid;
	}

	public void setTestTopicUid(int testTopicUid){
		this.testTopicUid=testTopicUid;
	}

	public int getWeight(){

			return this.weight;
	}

	public void setWeight(int weight){
		this.weight=weight;
	}

}
