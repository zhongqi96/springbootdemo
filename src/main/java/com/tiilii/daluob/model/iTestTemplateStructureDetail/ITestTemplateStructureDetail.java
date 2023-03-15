/**
 *	create by tools 2018-8-16 14:32:19
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：ITestTemplateStructureDetail.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.iTestTemplateStructureDetail;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "i_test_template_structure_detail")
@IDGenerator(generator=GeneratorType.IDENTITY)
public class ITestTemplateStructureDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_TEMPLATESTRUCTUREDETAILUID = "templateStructureDetailUid";
	public static final String FIELD_TEMPLATESTRUCTUREUID = "templateStructureUid";
	public static final String FIELD_TOPICTYPEID = "topicTypeId";
	public static final String FIELD_TEMPLATETOPICNAME = "templateTopicName";
	public static final String FIELD_TEMPLATETOPICSCORE = "templateTopicScore";
	public static final String FIELD_TEMPLATETOPICNUM = "templateTopicNum";
	public static final String FIELD_TEMPLATETOPICDIFFICULTY = "templateTopicDifficulty";
	public static final String FIELD_ISSINGLEDIFFICULTY = "isSingleDifficulty";
	public static final String FIELD_DEGREE = "degree";
	public static final String FIELD_PARENTUID = "parentUid";

	@Column(name="template_structure_detail_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int templateStructureDetailUid;

	@Column(name="template_structure_uid", isPk=false, isFk=true,isBlob=false,isClob=false)
	private int templateStructureUid;

	@Column(name="topic_type_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String topicTypeId;

	@Column(name="template_topic_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String templateTopicName;

	@Column(name="template_topic_score", isPk=false, isFk=false,isBlob=false,isClob=false)
	private double templateTopicScore;

	@Column(name="template_topic_num", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int templateTopicNum;

	@Column(name="template_topic_difficulty", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int templateTopicDifficulty;
	
	@Column(name="is_single_difficulty", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String isSingleDifficulty; 

	@Column(name="degree", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int degree;

	@Column(name="parent_uid", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int parentUid;

	public int getTemplateStructureDetailUid(){

			return this.templateStructureDetailUid;
	}

	public void setTemplateStructureDetailUid(int templateStructureDetailUid){
		this.templateStructureDetailUid=templateStructureDetailUid;
	}

	public int getTemplateStructureUid(){

			return this.templateStructureUid;
	}

	public void setTemplateStructureUid(int templateStructureUid){
		this.templateStructureUid=templateStructureUid;
	}

	public String getTopicTypeId(){

			return this.topicTypeId;
	}

	public void setTopicTypeId(String topicTypeId){
		this.topicTypeId=topicTypeId;
	}

	public String getTemplateTopicName(){

			return this.templateTopicName;
	}

	public void setTemplateTopicName(String templateTopicName){
		this.templateTopicName=templateTopicName;
	}

	public double getTemplateTopicScore(){

			return this.templateTopicScore;
	}

	public void setTemplateTopicScore(double templateTopicScore){
		this.templateTopicScore=templateTopicScore;
	}

	public int getTemplateTopicNum(){

			return this.templateTopicNum;
	}

	public void setTemplateTopicNum(int templateTopicNum){
		this.templateTopicNum=templateTopicNum;
	}

	public int getTemplateTopicDifficulty(){

			return this.templateTopicDifficulty;
	}

	public void setTemplateTopicDifficulty(int templateTopicDifficulty){
		this.templateTopicDifficulty=templateTopicDifficulty;
	}

	public String getIsSingleDifficulty() {
		return isSingleDifficulty;
	}

	public void setIsSingleDifficulty(String isSingleDifficulty) {
		this.isSingleDifficulty = isSingleDifficulty;
	}

	public int getDegree(){

			return this.degree;
	}

	public void setDegree(int degree){
		this.degree=degree;
	}

	public int getParentUid(){

			return this.parentUid;
	}

	public void setParentUid(int parentUid){
		this.parentUid=parentUid;
	}

}
