/**
 *	create by tools 2019-1-15 17:16:57
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimIdmErrorDetail.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimIdmErrorDetail;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_idm_error_detail")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimIdmErrorDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_ERRORDETAILID = "errorDetailId";
	public static final String FIELD_ERRORTYPEID = "errorTypeId";
	public static final String FIELD_ERRORDETAILNAME = "errorDetailName";

	@Column(name="error_detail_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String errorDetailId;

	@Column(name="error_type_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String errorTypeId;

	@Column(name="error_detail_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String errorDetailName;

	public String getErrorDetailId(){

			return this.errorDetailId;
	}

	public void setErrorDetailId(String errorDetailId){
		this.errorDetailId=errorDetailId;
	}

	public String getErrorTypeId(){

			return this.errorTypeId;
	}

	public void setErrorTypeId(String errorTypeId){
		this.errorTypeId=errorTypeId;
	}

	public String getErrorDetailName(){

			return this.errorDetailName;
	}

	public void setErrorDetailName(String errorDetailName){
		this.errorDetailName=errorDetailName;
	}

}
