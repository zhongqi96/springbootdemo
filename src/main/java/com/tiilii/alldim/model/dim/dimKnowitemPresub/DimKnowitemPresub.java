/**
 *	create by tools 2019-1-15 17:16:58
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimKnowitemPresub.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimKnowitemPresub;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_knowitem_presub")
@IDGenerator(generator=GeneratorType.IDENTITY)
public class DimKnowitemPresub implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_KNOWITEMPRESUBUID = "knowitemPresubUid";
	public static final String FIELD_PRESUBKNOWITEMID = "presubKnowitemId";
	public static final String FIELD_KNOWITEMID = "knowitemId";
	public static final String FIELD_KNOWITEMOKVALUE = "knowitemOkValue";

	@Column(name="knowitem_presub_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int knowitemPresubUid;

	@Column(name="presub_knowitem_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String presubKnowitemId;

	@Column(name="knowitem_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String knowitemId;

	@Column(name="knowitem_ok_value", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int knowitemOkValue;

	public int getKnowitemPresubUid(){

			return this.knowitemPresubUid;
	}

	public void setKnowitemPresubUid(int knowitemPresubUid){
		this.knowitemPresubUid=knowitemPresubUid;
	}

	public String getPresubKnowitemId(){

			return this.presubKnowitemId;
	}

	public void setPresubKnowitemId(String presubKnowitemId){
		this.presubKnowitemId=presubKnowitemId;
	}

	public String getKnowitemId(){

			return this.knowitemId;
	}

	public void setKnowitemId(String knowitemId){
		this.knowitemId=knowitemId;
	}

	public int getKnowitemOkValue(){

			return this.knowitemOkValue;
	}

	public void setKnowitemOkValue(int knowitemOkValue){
		this.knowitemOkValue=knowitemOkValue;
	}

}
