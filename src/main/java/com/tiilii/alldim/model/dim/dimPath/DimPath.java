/**
 *	create by tools 2019-1-15 17:16:58
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimPath.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimPath;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_path")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimPath implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_PATHID = "pathId";
	public static final String FIELD_ENABLEID = "enableId";
	public static final String FIELD_ISSINGLEGRADE = "isSingleGrade";
	public static final String FIELD_ISFULLGRADE = "isFullGrade";
	public static final String FIELD_PATHNAME = "pathName";
	public static final String FIELD_PATHALIAS = "pathAlias";
	public static final String FIELD_DEGREE = "degree";
	public static final String FIELD_PARENTID = "parentId";
	public static final String FIELD_PPID = "ppId";
	public static final String FIELD_PPPID = "pppId";

	@Column(name="path_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String pathId;

	@Column(name="enable_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String enableId;

	@Column(name="is_single_grade", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String isSingleGrade;

	@Column(name="is_full_grade", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String isFullGrade;

	@Column(name="path_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String pathName;

	@Column(name="path_alias", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String pathAlias;

	@Column(name="degree", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int degree;

	@Column(name="parent_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String parentId;

	@Column(name="pp_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String ppId;

	@Column(name="ppp_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String pppId;

	public String getPathId(){

			return this.pathId;
	}

	public void setPathId(String pathId){
		this.pathId=pathId;
	}

	public String getEnableId(){

			return this.enableId;
	}

	public void setEnableId(String enableId){
		this.enableId=enableId;
	}

	public String getIsSingleGrade(){

			return this.isSingleGrade;
	}

	public void setIsSingleGrade(String isSingleGrade){
		this.isSingleGrade=isSingleGrade;
	}

	public String getIsFullGrade(){

			return this.isFullGrade;
	}

	public void setIsFullGrade(String isFullGrade){
		this.isFullGrade=isFullGrade;
	}

	public String getPathName(){

			return this.pathName;
	}

	public void setPathName(String pathName){
		this.pathName=pathName;
	}

	public String getPathAlias(){

			return this.pathAlias;
	}

	public void setPathAlias(String pathAlias){
		this.pathAlias=pathAlias;
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

	public String getPpId(){

			return this.ppId;
	}

	public void setPpId(String ppId){
		this.ppId=ppId;
	}

	public String getPppId(){

			return this.pppId;
	}

	public void setPppId(String pppId){
		this.pppId=pppId;
	}

}
