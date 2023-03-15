/**
 *	create by tools 2019-1-15 17:16:58
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimSchoolCatalog.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimSchoolCatalog;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_school_catalog")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimSchoolCatalog implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_SCHOOLCATALOGID = "schoolCatalogId";
	public static final String FIELD_SCHOOLCATALOGNAME = "schoolCatalogName";
	public static final String FIELD_PROVINCE = "province";

	@Column(name="school_catalog_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String schoolCatalogId;

	@Column(name="school_catalog_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String schoolCatalogName;

	@Column(name="province", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String province;

	public String getSchoolCatalogId(){

			return this.schoolCatalogId;
	}

	public void setSchoolCatalogId(String schoolCatalogId){
		this.schoolCatalogId=schoolCatalogId;
	}

	public String getSchoolCatalogName(){

			return this.schoolCatalogName;
	}

	public void setSchoolCatalogName(String schoolCatalogName){
		this.schoolCatalogName=schoolCatalogName;
	}

	public String getProvince(){

			return this.province;
	}

	public void setProvince(String province){
		this.province=province;
	}

}
