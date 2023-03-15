/**
 *	create by tools 2019-1-15 17:16:58
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimLanguage.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimLanguage;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_language")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimLanguage implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_LANGUAGEID = "languageId";
	public static final String FIELD_NAMECHINESE = "nameChinese";
	public static final String FIELD_NAMEENGLISH = "nameEnglish";

	@Column(name="language_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String languageId;

	@Column(name="name_chinese", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String nameChinese;

	@Column(name="name_english", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String nameEnglish;

	public String getLanguageId(){

			return this.languageId;
	}

	public void setLanguageId(String languageId){
		this.languageId=languageId;
	}

	public String getNameChinese(){

			return this.nameChinese;
	}

	public void setNameChinese(String nameChinese){
		this.nameChinese=nameChinese;
	}

	public String getNameEnglish(){

			return this.nameEnglish;
	}

	public void setNameEnglish(String nameEnglish){
		this.nameEnglish=nameEnglish;
	}

}
