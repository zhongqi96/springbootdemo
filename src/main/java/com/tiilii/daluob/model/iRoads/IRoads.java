/**
 *	create by tools 2018-8-16 14:32:18
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：IRoads.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.iRoads;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "i_roads")
@IDGenerator(generator=GeneratorType.IDENTITY)
public class IRoads implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_ROADSUID = "roadsUid";
	public static final String FIELD_APPID = "appId";
	public static final String FIELD_ROADFROMID = "roadFromId";
	public static final String FIELD_SUBJECTUID = "subjectUid";
	public static final String FIELD_OBJECTUID = "objectUid";
	public static final String FIELD_ROADSEDITTIME = "roadsEditTime";
	public static final String FIELD_ROADSNOTE = "roadsNote";

	@Column(name="roads_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int roadsUid;

	@Column(name="app_id", isPk=false, isFk=true,isBlob=false,isClob=false)
	private String appId;

	@Column(name="road_from_id", isPk=false, isFk=true,isBlob=false,isClob=false)
	private String roadFromId;

	@Column(name="subject_uid", isPk=false, isFk=true,isBlob=false,isClob=false)
	private int subjectUid;

	@Column(name="object_uid", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int objectUid;

	@Column(name="roads_edit_time", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.sql.Timestamp roadsEditTime;

	@Column(name="roads_note", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String roadsNote;

	public int getRoadsUid(){

			return this.roadsUid;
	}

	public void setRoadsUid(int roadsUid){
		this.roadsUid=roadsUid;
	}

	public String getAppId(){

			return this.appId;
	}

	public void setAppId(String appId){
		this.appId=appId;
	}

	public String getRoadFromId(){

			return this.roadFromId;
	}

	public void setRoadFromId(String roadFromId){
		this.roadFromId=roadFromId;
	}

	public int getSubjectUid(){

			return this.subjectUid;
	}

	public void setSubjectUid(int subjectUid){
		this.subjectUid=subjectUid;
	}

	public int getObjectUid(){

			return this.objectUid;
	}

	public void setObjectUid(int objectUid){
		this.objectUid=objectUid;
	}

	public java.sql.Timestamp getRoadsEditTime(){

			return this.roadsEditTime;
	}

	public void setRoadsEditTime(java.sql.Timestamp roadsEditTime){
		this.roadsEditTime=roadsEditTime;
	}

	public String getRoadsNote(){

			return this.roadsNote;
	}

	public void setRoadsNote(String roadsNote){
		this.roadsNote=roadsNote;
	}

}
