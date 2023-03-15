/**
 *	create by tools 2018-11-22 10:09:20
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：MyScore.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.myScore;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "my_score")
@IDGenerator(generator=GeneratorType.IDENTITY)
public class MyScore implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_MYSCOREUID = "myScoreUid";
	public static final String FIELD_USERUID = "userUid";
	public static final String FIELD_MYSCORE = "myScore";
	public static final String FIELD_MYSCOREDATETIME = "myScoreDatetime";

	@Column(name="my_score_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int myScoreUid;

	@Column(name="user_uid", isPk=false, isFk=true,isBlob=false,isClob=false)
	private int userUid;

	@Column(name="my_score", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int myScore;

	@Column(name="my_score_datetime", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.util.Date myScoreDatetime;

	public int getMyScoreUid(){

			return this.myScoreUid;
	}

	public void setMyScoreUid(int myScoreUid){
		this.myScoreUid=myScoreUid;
	}

	public int getUserUid(){

			return this.userUid;
	}

	public void setUserUid(int userUid){
		this.userUid=userUid;
	}

	public int getMyScore(){

			return this.myScore;
	}

	public void setMyScore(int myScore){
		this.myScore=myScore;
	}

	public java.util.Date getMyScoreDatetime(){

			return this.myScoreDatetime;
	}

	public void setMyScoreDatetime(java.util.Date myScoreDatetime){
		this.myScoreDatetime=myScoreDatetime;
	}

}
