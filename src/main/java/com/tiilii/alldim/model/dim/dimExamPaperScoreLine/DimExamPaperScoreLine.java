/**
 *	create by tools 2019-1-15 17:16:57
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimExamPaperScoreLine.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimExamPaperScoreLine;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_exam_paper_score_line")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimExamPaperScoreLine implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_EXAMPAPERSCORELINEID = "examPaperScoreLineId";
	public static final String FIELD_EXAMPAPERSCORELINENAME = "examPaperScoreLineName";

	@Column(name="exam_paper_score_line_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String examPaperScoreLineId;

	@Column(name="exam_paper_score_line_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String examPaperScoreLineName;

	public String getExamPaperScoreLineId(){

			return this.examPaperScoreLineId;
	}

	public void setExamPaperScoreLineId(String examPaperScoreLineId){
		this.examPaperScoreLineId=examPaperScoreLineId;
	}

	public String getExamPaperScoreLineName(){

			return this.examPaperScoreLineName;
	}

	public void setExamPaperScoreLineName(String examPaperScoreLineName){
		this.examPaperScoreLineName=examPaperScoreLineName;
	}

}
