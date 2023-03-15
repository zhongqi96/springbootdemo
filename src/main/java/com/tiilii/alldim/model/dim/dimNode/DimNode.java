/**
 *	create by tools 2019-1-15 17:16:58
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimNode.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimNode;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_node")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimNode implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_NODEID = "nodeId";
	public static final String FIELD_PATHID = "pathId";
	public static final String FIELD_COURSEID = "courseId";
	public static final String FIELD_NODENAME = "nodeName";
	public static final String FIELD_DEGREE = "degree";
	public static final String FIELD_PARENTID = "parentId";
	public static final String FIELD_PPID = "ppId";
	public static final String FIELD_PPPID = "pppId";
	public static final String FIELD_NODEKEYWORD = "nodeKeyword";
	public static final String FIELD_NODEDESC = "nodeDesc";

	@Column(name="node_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String nodeId;

	@Column(name="path_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String pathId;

	@Column(name="course_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String courseId;

	@Column(name="node_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String nodeName;

	@Column(name="degree", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int degree;

	@Column(name="parent_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String parentId;

	@Column(name="pp_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String ppId;

	@Column(name="ppp_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String pppId;

	@Column(name="node_keyword", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String nodeKeyword;

	@Column(name="node_desc", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String nodeDesc;

	public String getNodeId(){

			return this.nodeId;
	}

	public void setNodeId(String nodeId){
		this.nodeId=nodeId;
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

	public String getNodeName(){

			return this.nodeName;
	}

	public void setNodeName(String nodeName){
		this.nodeName=nodeName;
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

	public String getNodeKeyword(){

			return this.nodeKeyword;
	}

	public void setNodeKeyword(String nodeKeyword){
		this.nodeKeyword=nodeKeyword;
	}

	public String getNodeDesc(){

			return this.nodeDesc;
	}

	public void setNodeDesc(String nodeDesc){
		this.nodeDesc=nodeDesc;
	}

}
