/**
 *	create by tools 2019-1-15 17:16:59
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimVideoResolution.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimVideoResolution;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_video_resolution")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimVideoResolution implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_VIDEORESOLUTIONID = "videoResolutionId";
	public static final String FIELD_VIDEOWIDTH = "videoWidth";
	public static final String FIELD_VIDEOHEIGHT = "videoHeight";

	@Column(name="video_resolution_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String videoResolutionId;

	@Column(name="video_width", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int videoWidth;

	@Column(name="video_height", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int videoHeight;

	public String getVideoResolutionId(){

			return this.videoResolutionId;
	}

	public void setVideoResolutionId(String videoResolutionId){
		this.videoResolutionId=videoResolutionId;
	}

	public int getVideoWidth(){

			return this.videoWidth;
	}

	public void setVideoWidth(int videoWidth){
		this.videoWidth=videoWidth;
	}

	public int getVideoHeight(){

			return this.videoHeight;
	}

	public void setVideoHeight(int videoHeight){
		this.videoHeight=videoHeight;
	}

}
