/**
 *	create by tools 2019-3-20 11:17:41
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：StatExampaper.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.statExampaper;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "stat_exampaper")
@IDGenerator(generator = GeneratorType.NATIVE)
public class StatExampaper implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_COURSEUID = "courseUid";
	public static final String FIELD_DATADATE = "dataDate";
	public static final String FIELD_COUNTCREATEEXAMPAPER = "countCreateExampaper";
	public static final String FIELD_COUNTDOWNLOADEXAMPAPER = "countDownloadExampaper";
	public static final String FIELD_COUNTCOMMENT = "countComment";

	@Column(name = "course_uid", isPk = true, isFk = false, isBlob = false, isClob = false)
	private int courseUid;

	@Column(name = "data_date", isPk = true, isFk = false, isBlob = false, isClob = false)
	private String dataDate;

	@Column(name = "count_create_exampaper", isPk = false, isFk = false, isBlob = false, isClob = false)
	private int countCreateExampaper;

	@Column(name = "count_download_exampaper", isPk = false, isFk = false, isBlob = false, isClob = false)
	private int countDownloadExampaper;

	@Column(name = "count_comment", isPk = false, isFk = false, isBlob = false, isClob = false)
	private int countComment;

	public int getCourseUid() {

		return this.courseUid;
	}

	public void setCourseUid(int courseUid) {
		this.courseUid = courseUid;
	}

	public String getDataDate() {
		return dataDate;
	}

	public void setDataDate(String dataDate) {
		this.dataDate = dataDate;
	}

	public int getCountCreateExampaper() {

		return this.countCreateExampaper;
	}

	public void setCountCreateExampaper(int countCreateExampaper) {
		this.countCreateExampaper = countCreateExampaper;
	}

	public int getCountDownloadExampaper() {

		return this.countDownloadExampaper;
	}

	public void setCountDownloadExampaper(int countDownloadExampaper) {
		this.countDownloadExampaper = countDownloadExampaper;
	}

	public int getCountComment() {

		return this.countComment;
	}

	public void setCountComment(int countComment) {
		this.countComment = countComment;
	}

}
