/**
 *	create by tools 2019-1-15 17:16:59
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimTestType.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimTestType;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_test_type")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimTestType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_TESTTYPEID = "testTypeId";
	public static final String FIELD_TESTTYPENAME = "testTypeName";
	public static final String FIELD_DEGREE = "degree";
	public static final String FIELD_PARENTID = "parentId";
	public static final String FIELD_WEIGHT = "weight";

	@Column(name="test_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String testTypeId;

	@Column(name="test_type_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String testTypeName;

	@Column(name="degree", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int degree;

	@Column(name="parent_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String parentId;

	@Column(name="weight", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int weight;

	public String getTestTypeId(){

			return this.testTypeId;
	}

	public void setTestTypeId(String testTypeId){
		this.testTypeId=testTypeId;
	}

	public String getTestTypeName(){

			return this.testTypeName;
	}

	public void setTestTypeName(String testTypeName){
		this.testTypeName=testTypeName;
	}

	public int getDegree(){

			return this.degree;
	}

	public void setDegree(int degree){
		this.degree=degree;
	}

	public String getParentId(){

			return this.parentId;
	}

	public void setParentId(String parentId){
		this.parentId=parentId;
	}

	public int getWeight(){

			return this.weight;
	}

	public void setWeight(int weight){
		this.weight=weight;
	}

}
