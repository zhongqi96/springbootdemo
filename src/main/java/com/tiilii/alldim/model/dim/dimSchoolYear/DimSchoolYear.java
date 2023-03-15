/**
 *	create by tools 2019-1-15 17:16:58
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimSchoolYear.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimSchoolYear;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_school_year")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimSchoolYear implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_SCHOOLYEARID = "schoolYearId";
	public static final String FIELD_SCHOOLYEARNAME = "schoolYearName";
	public static final String FIELD_CHINESENEWYEARDAY = "chineseNewYearDay";

	@Column(name="school_year_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String schoolYearId;

	@Column(name="school_year_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String schoolYearName;

	@Column(name="chinese_new_year_day", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.util.Date chineseNewYearDay;

	public String getSchoolYearId(){

			return this.schoolYearId;
	}

	public void setSchoolYearId(String schoolYearId){
		this.schoolYearId=schoolYearId;
	}

	public String getSchoolYearName(){

			return this.schoolYearName;
	}

	public void setSchoolYearName(String schoolYearName){
		this.schoolYearName=schoolYearName;
	}

	public java.util.Date getChineseNewYearDay(){

			return this.chineseNewYearDay;
	}

	public void setChineseNewYearDay(java.util.Date chineseNewYearDay){
		this.chineseNewYearDay=chineseNewYearDay;
	}

}
