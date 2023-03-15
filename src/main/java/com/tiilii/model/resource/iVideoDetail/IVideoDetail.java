/**
 *	create by tools 2016-12-20 15:24:04
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：IVideoDetail.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.model.resource.iVideoDetail;

public class IVideoDetail{

	private Integer videoDetailUid;

	private String enableId;

	private String videoResolutionId;

	private Integer videoUid;

	private Integer videoFps;

	private Integer videoFileSize;

	private String videoUrl;

	private Integer videoWidth;

	private Integer videoHeight;

	private String videoPara;

	public Integer getVideoDetailUid(){

			return this.videoDetailUid;
	}

	public void setVideoDetailUid(Integer videoDetailUid){
		this.videoDetailUid=videoDetailUid;
	}

	public String getEnableId(){

			return this.enableId;
	}

	public void setEnableId(String enableId){
		this.enableId=enableId;
	}

	public String getVideoResolutionId() {
		return videoResolutionId;
	}

	public void setVideoResolutionId(String videoResolutionId) {
		this.videoResolutionId = videoResolutionId;
	}

	public Integer getVideoUid(){

			return this.videoUid;
	}

	public void setVideoUid(Integer videoUid){
		this.videoUid=videoUid;
	}

	public Integer getVideoFps(){

			return this.videoFps;
	}

	public void setVideoFps(Integer videoFps){
		this.videoFps=videoFps;
	}

	public Integer getVideoFileSize(){

			return this.videoFileSize;
	}

	public void setVideoFileSize(Integer videoFileSize){
		this.videoFileSize=videoFileSize;
	}

	public String getVideoUrl(){

			return this.videoUrl;
	}

	public void setVideoUrl(String videoUrl){
		this.videoUrl=videoUrl;
	}

	public Integer getVideoWidth(){

			return this.videoWidth;
	}

	public void setVideoWidth(Integer videoWidth){
		this.videoWidth=videoWidth;
	}

	public Integer getVideoHeight(){

			return this.videoHeight;
	}

	public void setVideoHeight(Integer videoHeight){
		this.videoHeight=videoHeight;
	}

	public String getVideoPara(){

			return this.videoPara;
	}

	public void setVideoPara(String videoPara){
		this.videoPara=videoPara;
	}

}
