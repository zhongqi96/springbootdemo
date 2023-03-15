/**
 *	create by tools 2018-8-16 14:32:17
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimRoadFrom.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.dim.dimRoadFrom;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_road_from")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimRoadFrom implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_ROADFROMID = "roadFromId";
	public static final String FIELD_ROADFROMNAME = "roadFromName";
	public static final String FIELD_DEGREE = "degree";
	public static final String FIELD_PARENTID = "parentId";
	public static final String FIELD_ROADFROMURL = "roadFromUrl";
	public static final String FIELD_ROADFROMTEMPLATE = "roadFromTemplate";
	public static final String FIELD_ROADFROMPIC = "roadFromPic";

	@Column(name="road_from_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String roadFromId;

	@Column(name="road_from_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String roadFromName;

	@Column(name="degree", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int degree;

	@Column(name="parent_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String parentId;

	@Column(name="road_from_url", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String roadFromUrl;

	@Column(name="road_from_template", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String roadFromTemplate;

	@Column(name="road_from_pic", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String roadFromPic;

	public String getRoadFromId(){

			return this.roadFromId;
	}

	public void setRoadFromId(String roadFromId){
		this.roadFromId=roadFromId;
	}

	public String getRoadFromName(){

			return this.roadFromName;
	}

	public void setRoadFromName(String roadFromName){
		this.roadFromName=roadFromName;
	}

	public int getDegree(){

			return this.degree;
	}

	public void setDegree(int degree){
		this.degree=degree;
	}

	public String getParentId(){

			return this.parentId;
	}

	public void setParentId(String parentId){
		this.parentId=parentId;
	}

	public String getRoadFromUrl(){

			return this.roadFromUrl;
	}

	public void setRoadFromUrl(String roadFromUrl){
		this.roadFromUrl=roadFromUrl;
	}

	public String getRoadFromTemplate(){

			return this.roadFromTemplate;
	}

	public void setRoadFromTemplate(String roadFromTemplate){
		this.roadFromTemplate=roadFromTemplate;
	}

	public String getRoadFromPic(){

			return this.roadFromPic;
	}

	public void setRoadFromPic(String roadFromPic){
		this.roadFromPic=roadFromPic;
	}

}
