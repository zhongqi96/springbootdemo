/**
 *	create by tools 2019-1-15 17:16:57
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimHealthScale.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimHealthScale;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_health_scale")
@IDGenerator(generator=GeneratorType.IDENTITY)
public class DimHealthScale implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_HEALTHSCALEUID = "healthScaleUid";
	public static final String FIELD_SEXID = "sexId";
	public static final String FIELD_ENABLEID = "enableId";
	public static final String FIELD_GRADEID = "gradeId";
	public static final String FIELD_HEALTHITEMID = "healthItemId";
	public static final String FIELD_HEALTHSCALECOL = "healthScaleCol";
	public static final String FIELD_HEALTHSCALEMIN = "healthScaleMin";
	public static final String FIELD_HEALTHSCALEMAX = "healthScaleMax";
	public static final String FIELD_HEALTHSCALESCORE = "healthScaleScore";
	public static final String FIELD_HEALTHSCALEPUBLISHYEAR = "healthScalePublishYear";

	@Column(name="health_scale_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int healthScaleUid;

	@Column(name="sex_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String sexId;

	@Column(name="enable_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String enableId;

	@Column(name="grade_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String gradeId;

	@Column(name="health_item_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String healthItemId;

	@Column(name="health_scale_col", isPk=false, isFk=false,isBlob=false,isClob=false)
	private double healthScaleCol;

	@Column(name="health_scale_min", isPk=false, isFk=false,isBlob=false,isClob=false)
	private double healthScaleMin;

	@Column(name="health_scale_max", isPk=false, isFk=false,isBlob=false,isClob=false)
	private double healthScaleMax;

	@Column(name="health_scale_score", isPk=false, isFk=false,isBlob=false,isClob=false)
	private double healthScaleScore;

	@Column(name="health_scale_publish_year", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int healthScalePublishYear;

	public int getHealthScaleUid(){

			return this.healthScaleUid;
	}

	public void setHealthScaleUid(int healthScaleUid){
		this.healthScaleUid=healthScaleUid;
	}

	public String getSexId(){

			return this.sexId;
	}

	public void setSexId(String sexId){
		this.sexId=sexId;
	}

	public String getEnableId(){

			return this.enableId;
	}

	public void setEnableId(String enableId){
		this.enableId=enableId;
	}

	public String getGradeId(){

			return this.gradeId;
	}

	public void setGradeId(String gradeId){
		this.gradeId=gradeId;
	}

	public String getHealthItemId(){

			return this.healthItemId;
	}

	public void setHealthItemId(String healthItemId){
		this.healthItemId=healthItemId;
	}

	public double getHealthScaleCol(){

			return this.healthScaleCol;
	}

	public void setHealthScaleCol(double healthScaleCol){
		this.healthScaleCol=healthScaleCol;
	}

	public double getHealthScaleMin(){

			return this.healthScaleMin;
	}

	public void setHealthScaleMin(double healthScaleMin){
		this.healthScaleMin=healthScaleMin;
	}

	public double getHealthScaleMax(){

			return this.healthScaleMax;
	}

	public void setHealthScaleMax(double healthScaleMax){
		this.healthScaleMax=healthScaleMax;
	}

	public double getHealthScaleScore(){

			return this.healthScaleScore;
	}

	public void setHealthScaleScore(double healthScaleScore){
		this.healthScaleScore=healthScaleScore;
	}

	public int getHealthScalePublishYear(){

			return this.healthScalePublishYear;
	}

	public void setHealthScalePublishYear(int healthScalePublishYear){
		this.healthScalePublishYear=healthScalePublishYear;
	}

}
