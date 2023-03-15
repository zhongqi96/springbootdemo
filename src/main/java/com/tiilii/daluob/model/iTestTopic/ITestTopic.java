/**
 *	create by tools 2018-8-16 14:32:19
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：ITestTopic.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.iTestTopic;

import java.io.Serializable;
import java.util.List;

import com.tiilii.framework.core.annotation.Column;
import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import com.tiilii.model.resource.iTopic.ITopic;

@Entity(table = "i_test_topic")
@IDGenerator(generator = GeneratorType.IDENTITY)
public class ITestTopic implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_TESTTOPICUID = "testTopicUid";
	public static final String FIELD_ENABLEID = "enableId";
	public static final String FIELD_TOPICUID = "topicUid";
	public static final String FIELD_TESTUID = "testUid";
	public static final String FIELD_TEMPLATESTRUCTUREDETAILUID = "templateStructureDetailUid";
	public static final String FIELD_TOPICTYPEID = "topicTypeId";
	public static final String FIELD_TESTTOPICNAME = "testTopicName";
	public static final String FIELD_TESTTOPICNO = "testTopicNo";
	public static final String FIELD_TESTTOPICTOTAL = "testTopicTotal";
	public static final String FIELD_PARENTUID = "parentUid";
	public static final String FIELD_DEGREE = "degree";
	public static final String FIELD_TESTTOPICOPTIONCOUNT = "testTopicOptionCount";
	public static final String FIELD_TESTTOPICANSWERSUMBIN = "testTopicAnswerSumBin";
	public static final String FIELD_TESTTOPICPAPERDESC = "testTopicPaperDesc";
	public static final String FIELD_TESTTOPICPTOTALINRESOURCE = "testTopicTotalInResource";
	@Column(name = "test_topic_uid", isPk = true, isFk = false, isBlob = false, isClob = false)
	private int testTopicUid;

	@Column(name = "enable_id", isPk = false, isFk = false, isBlob = false, isClob = false)
	private String enableId;

	@Column(name = "topic_uid", isPk = false, isFk = false, isBlob = false, isClob = false)
	private int topicUid;

	@Column(name = "test_uid", isPk = false, isFk = true, isBlob = false, isClob = false)
	private int testUid;

	@Column(name = "template_structure_detail_uid", isPk = false, isFk = true, isBlob = false, isClob = false)
	private int templateStructureDetailUid;

	@Column(name = "topic_type_id", isPk = false, isFk = false, isBlob = false, isClob = false)
	private String topicTypeId;

	@Column(name = "test_topic_name", isPk = false, isFk = false, isBlob = false, isClob = false)
	private String testTopicName;

	@Column(name = "test_topic_no", isPk = false, isFk = false, isBlob = false, isClob = false)
	private int testTopicNo;

	@Column(name = "test_topic_total", isPk = false, isFk = false, isBlob = false, isClob = false)
	private double testTopicTotal;

	@Column(name = "test_topic_total_in_resource", isPk = false, isFk = false, isBlob = false, isClob = false)
	private double testTopicTotalInResource;

	@Column(name = "parent_uid", isPk = false, isFk = false, isBlob = false, isClob = false)
	private int parentUid;

	@Column(name = "degree", isPk = false, isFk = false, isBlob = false, isClob = false)
	private int degree;

	@Column(name = "test_topic_option_count", isPk = false, isFk = false, isBlob = false, isClob = false)
	private int testTopicOptionCount;

	@Column(name = "test_topic_answer_sum_bin", isPk = false, isFk = false, isBlob = false, isClob = false)
	private int testTopicAnswerSumBin;

	@Column(name = "test_topic_paper_desc", isPk = false, isFk = false, isBlob = false, isClob = false)
	private String testTopicPaperDesc;

	public int getTestTopicUid() {

		return this.testTopicUid;
	}

	public void setTestTopicUid(int testTopicUid) {
		this.testTopicUid = testTopicUid;
	}

	public String getEnableId() {
		return enableId;
	}

	public void setEnableId(String enableId) {
		this.enableId = enableId;
	}

	public int getTopicUid() {

		return this.topicUid;
	}

	public void setTopicUid(int topicUid) {
		this.topicUid = topicUid;
	}

	public int getTestUid() {

		return this.testUid;
	}

	public void setTestUid(int testUid) {
		this.testUid = testUid;
	}

	public int getTemplateStructureDetailUid() {

		return this.templateStructureDetailUid;
	}

	public void setTemplateStructureDetailUid(int templateStructureDetailUid) {
		this.templateStructureDetailUid = templateStructureDetailUid;
	}

	public String getTopicTypeId() {

		return this.topicTypeId;
	}

	public void setTopicTypeId(String topicTypeId) {
		this.topicTypeId = topicTypeId;
	}

	public String getTestTopicName() {

		return this.testTopicName;
	}

	public void setTestTopicName(String testTopicName) {
		this.testTopicName = testTopicName;
	}

	public int getTestTopicNo() {

		return this.testTopicNo;
	}

	public void setTestTopicNo(int testTopicNo) {
		this.testTopicNo = testTopicNo;
	}

	public double getTestTopicTotal() {

		return this.testTopicTotal;
	}

	public void setTestTopicTotal(double testTopicTotal) {
		this.testTopicTotal = testTopicTotal;
	}

	public double getTestTopicTotalInResource() {
		return testTopicTotalInResource;
	}

	public void setTestTopicTotalInResource(double testTopicTotalInResource) {
		this.testTopicTotalInResource = testTopicTotalInResource;
	}

	public int getParentUid() {

		return this.parentUid;
	}

	public void setParentUid(int parentUid) {
		this.parentUid = parentUid;
	}

	public int getDegree() {

		return this.degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

	public int getTestTopicOptionCount() {

		return this.testTopicOptionCount;
	}

	public void setTestTopicOptionCount(int testTopicOptionCount) {
		this.testTopicOptionCount = testTopicOptionCount;
	}

	public int getTestTopicAnswerSumBin() {

		return this.testTopicAnswerSumBin;
	}

	public void setTestTopicAnswerSumBin(int testTopicAnswerSumBin) {
		this.testTopicAnswerSumBin = testTopicAnswerSumBin;
	}

	public String getTestTopicPaperDesc() {

		return this.testTopicPaperDesc;
	}

	public void setTestTopicPaperDesc(String testTopicPaperDesc) {
		this.testTopicPaperDesc = testTopicPaperDesc;
	}

	// 题目
	private ITopic topic;

	public ITopic getTopic() {
		return topic;
	}

	public void setTopic(ITopic topic) {
		this.topic = topic;
	}

	private int typeTopicCount; // 题型题目数量
	private List<ITestTopic> testTopicList; // 题型的题目列表
	private int typeTotalScore; // 题型的分数

	public int getTypeTopicCount() {
		return typeTopicCount;
	}

	public void setTypeTopicCount(int typeTopicCount) {
		this.typeTopicCount = typeTopicCount;
	}

	public int getTypeTotalScore() {
		return typeTotalScore;
	}

	public void setTypeTotalScore(int typeTotalScore) {
		this.typeTotalScore = typeTotalScore;
	}

	public List<ITestTopic> getTestTopicList() {
		return testTopicList;
	}

	public void setTestTopicList(List<ITestTopic> testTopicList) {
		this.testTopicList = testTopicList;
	}
}
