/**
 *	create by tools 2018-8-16 14:32:19
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：ITestTemplateStructure.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.iTestTemplateStructure;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "i_test_template_structure")
@IDGenerator(generator=GeneratorType.IDENTITY)
public class ITestTemplateStructure implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_TEMPLATESTRUCTUREUID = "templateStructureUid";
	public static final String FIELD_ENABLEID = "enableId";
	public static final String FIELD_ISPUBLIC = "isPublic";
	public static final String FIELD_CREATORUID = "creatorUid";
	public static final String FIELD_COURSEUID = "courseUid";
	public static final String FIELD_TEMPLATESTRUCTURE = "templateStructure";
	public static final String FIELD_TEMPLATESTRUCTUREUSEDCOUNT = "templateStructureUsedCount";
	public static final String FIELD_TEMPLATESTRUCTURECREATEDATETIME = "templateStructureCreateDatetime";

	@Column(name="template_structure_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int templateStructureUid;

	@Column(name="enable_id", isPk=false, isFk=true,isBlob=false,isClob=false)
	private String enableId;

	@Column(name="is_public", isPk=false, isFk=true,isBlob=false,isClob=false)
	private String isPublic;

	@Column(name="creator_uid", isPk=false, isFk=true,isBlob=false,isClob=false)
	private int creatorUid;

	@Column(name="course_uid", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int courseUid;

	@Column(name="template_structure", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String templateStructure;

	@Column(name="template_structure_used_count", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int templateStructureUsedCount;

	@Column(name="template_structure_create_datetime", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.sql.Timestamp templateStructureCreateDatetime;

	public int getTemplateStructureUid(){

			return this.templateStructureUid;
	}

	public void setTemplateStructureUid(int templateStructureUid){
		this.templateStructureUid=templateStructureUid;
	}

	public String getEnableId(){

			return this.enableId;
	}

	public void setEnableId(String enableId){
		this.enableId=enableId;
	}

	public String getIsPublic(){

			return this.isPublic;
	}

	public void setIsPublic(String isPublic){
		this.isPublic=isPublic;
	}

	public int getCreatorUid(){

			return this.creatorUid;
	}

	public void setCreatorUid(int creatorUid){
		this.creatorUid=creatorUid;
	}

	public int getCourseUid(){

			return this.courseUid;
	}

	public void setCourseUid(int courseUid){
		this.courseUid=courseUid;
	}

	public String getTemplateStructure(){

			return this.templateStructure;
	}

	public void setTemplateStructure(String templateStructure){
		this.templateStructure=templateStructure;
	}

	public int getTemplateStructureUsedCount(){

			return this.templateStructureUsedCount;
	}

	public void setTemplateStructureUsedCount(int templateStructureUsedCount){
		this.templateStructureUsedCount=templateStructureUsedCount;
	}

	public java.sql.Timestamp getTemplateStructureCreateDatetime(){

			return this.templateStructureCreateDatetime;
	}

	public void setTemplateStructureCreateDatetime(java.sql.Timestamp templateStructureCreateDatetime){
		this.templateStructureCreateDatetime=templateStructureCreateDatetime;
	}

}
