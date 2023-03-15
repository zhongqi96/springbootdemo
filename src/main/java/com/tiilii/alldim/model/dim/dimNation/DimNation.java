/**
 *	create by tools 2019-1-15 17:16:58
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimNation.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimNation;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_nation")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimNation implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_NATIONID = "nationId";
	public static final String FIELD_NATIONNAME = "nationName";
	public static final String FIELD_LL = "ll";
	public static final String FIELD_LLL = "lll";
	public static final String FIELD_DISPINDEX1 = "dispIndex1";

	@Column(name="nation_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String nationId;

	@Column(name="nation_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String nationName;

	@Column(name="ll", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String ll;

	@Column(name="lll", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String lll;

	@Column(name="disp_index_1", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String dispIndex1;

	public String getNationId(){

			return this.nationId;
	}

	public void setNationId(String nationId){
		this.nationId=nationId;
	}

	public String getNationName(){

			return this.nationName;
	}

	public void setNationName(String nationName){
		this.nationName=nationName;
	}

	public String getLl(){

			return this.ll;
	}

	public void setLl(String ll){
		this.ll=ll;
	}

	public String getLll(){

			return this.lll;
	}

	public void setLll(String lll){
		this.lll=lll;
	}

	public String getDispIndex1(){

			return this.dispIndex1;
	}

	public void setDispIndex1(String dispIndex1){
		this.dispIndex1=dispIndex1;
	}

}
