/**
 *	create by tools 2016-12-20 15:24:04
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：IVideo.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.model.resource.iVideo;

import java.util.List;

import com.tiilii.alldim.model.dim.dimKnowitem.DimKnowitem;
import com.tiilii.model.resource.iVideoDetail.IVideoDetail;

public class IVideo{

	private Integer videoUid;

	private String hasCheck;

	private Integer parentUid;

	private String videoName;

	private Integer degree;

	private String videoImgUrl;

	private Integer videoLengthSecond;

	private String videoCodec;

	private Integer videoScore;

	private String videoNotes;

	private String videoCheckDatetime;

	private Integer videoViewCount;

	private Integer videoSkipCount;

	private List<DimKnowitem> knowitems;
	
	private List<IVideoDetail> videoDetails;

	private int courseUid;

	public int getCourseUid() {
		return courseUid;
	}

	public void setCourseUid(int courseUid) {
		this.courseUid = courseUid;
	}

	public List<DimKnowitem> getKnowitems() {
		return knowitems;
	}

	public void setKnowitems(List<DimKnowitem> knowitems) {
		this.knowitems = knowitems;
	}

	public List<IVideoDetail> getVideoDetails() {
		return videoDetails;
	}

	public void setVideoDetails(List<IVideoDetail> videoDetails) {
		this.videoDetails = videoDetails;
	}

	public Integer getVideoUid() {

		return this.videoUid;
	}

	public void setVideoUid(Integer videoUid) {
		this.videoUid = videoUid;
	}

	public String getHasCheck() {

		return this.hasCheck;
	}

	public void setHasCheck(String hasCheck) {
		this.hasCheck = hasCheck;
	}

	public Integer getParentUid() {

		return this.parentUid;
	}

	public void setParentUid(Integer parentUid) {
		this.parentUid = parentUid;
	}

	public String getVideoName() {

		return this.videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public Integer getDegree() {

		return this.degree;
	}

	public void setDegree(Integer degree) {
		this.degree = degree;
	}

	public String getVideoImgUrl() {

		return this.videoImgUrl;
	}

	public void setVideoImgUrl(String videoImgUrl) {
		this.videoImgUrl = videoImgUrl;
	}

	public Integer getVideoLengthSecond() {

		return this.videoLengthSecond;
	}

	public void setVideoLengthSecond(Integer videoLengthSecond) {
		this.videoLengthSecond = videoLengthSecond;
	}

	public String getVideoCodec() {

		return this.videoCodec;
	}

	public void setVideoCodec(String videoCodec) {
		this.videoCodec = videoCodec;
	}

	public Integer getVideoScore() {

		return this.videoScore;
	}

	public void setVideoScore(Integer videoScore) {
		this.videoScore = videoScore;
	}

	public String getVideoNotes() {

		return this.videoNotes;
	}

	public void setVideoNotes(String videoNotes) {
		this.videoNotes = videoNotes;
	}

	public String getVideoCheckDatetime() {

		return this.videoCheckDatetime;
	}

	public void setVideoCheckDatetime(String videoCheckDatetime) {
		this.videoCheckDatetime = videoCheckDatetime;
	}

	public Integer getVideoViewCount() {

		return this.videoViewCount;
	}

	public void setVideoViewCount(Integer videoViewCount) {
		this.videoViewCount = videoViewCount;
	}

	public Integer getVideoSkipCount() {

		return this.videoSkipCount;
	}

	public void setVideoSkipCount(Integer videoSkipCount) {
		this.videoSkipCount = videoSkipCount;
	}

	private String videoUploadDatetime;

	public String getVideoUploadDatetime() {
		return videoUploadDatetime;
	}

	public void setVideoUploadDatetime(String videoUploadDatetime) {
		this.videoUploadDatetime = videoUploadDatetime;
	}
}
