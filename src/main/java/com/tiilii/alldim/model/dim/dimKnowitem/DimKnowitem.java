/**
 *	create by tools 2019-1-15 17:16:58
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimKnowitem.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimKnowitem;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_knowitem")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimKnowitem implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_KNOWITEMID = "knowitemId";
	public static final String FIELD_PATHID = "pathId";
	public static final String FIELD_COURSEID = "courseId";
	public static final String FIELD_ENABLEID = "enableId";
	public static final String FIELD_KNOWITEMNAME = "knowitemName";
	public static final String FIELD_KNOWITEMKEYWORD = "knowitemKeyword";
	public static final String FIELD_KNOWITEMDESC = "knowitemDesc";
	public static final String FIELD_KNOWITEMPRESUBLIST = "knowitemPresubList";

	@Column(name="knowitem_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String knowitemId;

	@Column(name="path_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String pathId;

	@Column(name="course_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String courseId;

	@Column(name="enable_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String enableId;

	@Column(name="knowitem_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String knowitemName;

	@Column(name="knowitem_keyword", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String knowitemKeyword;

	@Column(name="knowitem_desc", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String knowitemDesc;

	@Column(name="knowitem_presub_list", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String knowitemPresubList;

	public String getKnowitemId(){

			return this.knowitemId;
	}

	public void setKnowitemId(String knowitemId){
		this.knowitemId=knowitemId;
	}

	public String getPathId(){

			return this.pathId;
	}

	public void setPathId(String pathId){
		this.pathId=pathId;
	}

	public String getCourseId(){

			return this.courseId;
	}

	public void setCourseId(String courseId){
		this.courseId=courseId;
	}

	public String getEnableId(){

			return this.enableId;
	}

	public void setEnableId(String enableId){
		this.enableId=enableId;
	}

	public String getKnowitemName(){

			return this.knowitemName;
	}

	public void setKnowitemName(String knowitemName){
		this.knowitemName=knowitemName;
	}

	public String getKnowitemKeyword(){

			return this.knowitemKeyword;
	}

	public void setKnowitemKeyword(String knowitemKeyword){
		this.knowitemKeyword=knowitemKeyword;
	}

	public String getKnowitemDesc(){

			return this.knowitemDesc;
	}

	public void setKnowitemDesc(String knowitemDesc){
		this.knowitemDesc=knowitemDesc;
	}

	public String getKnowitemPresubList(){

			return this.knowitemPresubList;
	}

	public void setKnowitemPresubList(String knowitemPresubList){
		this.knowitemPresubList=knowitemPresubList;
	}

}
