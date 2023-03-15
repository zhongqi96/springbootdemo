/**
 *	create by tools 2019-1-15 17:16:57
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimExamRoomArrangeType.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimExamRoomArrangeType;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_exam_room_arrange_type")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimExamRoomArrangeType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_EXAMROOMARRANGETYPEID = "examRoomArrangeTypeId";
	public static final String FIELD_EXAMROOMARRANGETYPENAME = "examRoomArrangeTypeName";

	@Column(name="exam_room_arrange_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String examRoomArrangeTypeId;

	@Column(name="exam_room_arrange_type_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String examRoomArrangeTypeName;

	public String getExamRoomArrangeTypeId(){

			return this.examRoomArrangeTypeId;
	}

	public void setExamRoomArrangeTypeId(String examRoomArrangeTypeId){
		this.examRoomArrangeTypeId=examRoomArrangeTypeId;
	}

	public String getExamRoomArrangeTypeName(){

			return this.examRoomArrangeTypeName;
	}

	public void setExamRoomArrangeTypeName(String examRoomArrangeTypeName){
		this.examRoomArrangeTypeName=examRoomArrangeTypeName;
	}

}
