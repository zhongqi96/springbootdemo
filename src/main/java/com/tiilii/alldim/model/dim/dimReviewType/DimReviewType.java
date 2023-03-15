/**
 *	create by tools 2019-1-15 17:16:58
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimReviewType.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimReviewType;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_review_type")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimReviewType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_REVIEWTYPEID = "reviewTypeId";
	public static final String FIELD_REVIEWNAME = "reviewName";

	@Column(name="review_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String reviewTypeId;

	@Column(name="review_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String reviewName;

	public String getReviewTypeId(){

			return this.reviewTypeId;
	}

	public void setReviewTypeId(String reviewTypeId){
		this.reviewTypeId=reviewTypeId;
	}

	public String getReviewName(){

			return this.reviewName;
	}

	public void setReviewName(String reviewName){
		this.reviewName=reviewName;
	}

}
