/**
 *	create by tools 2018-11-22 10:09:19
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：MyCoin.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.myCoin;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "my_coin")
@IDGenerator(generator=GeneratorType.IDENTITY)
public class MyCoin implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_MYCOINUID = "myCoinUid";
	public static final String FIELD_USERUID = "userUid";
	public static final String FIELD_MYCOIN = "myCoin";
	public static final String FIELD_MYCOINDATETIME = "myCoinDatetime";

	@Column(name="my_coin_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int myCoinUid;

	@Column(name="user_uid", isPk=false, isFk=true,isBlob=false,isClob=false)
	private int userUid;

	@Column(name="my_coin", isPk=false, isFk=false,isBlob=false,isClob=false)
	private double myCoin;

	@Column(name="my_coin_datetime", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.util.Date myCoinDatetime;

	public int getMyCoinUid(){

			return this.myCoinUid;
	}

	public void setMyCoinUid(int myCoinUid){
		this.myCoinUid=myCoinUid;
	}

	public int getUserUid(){

			return this.userUid;
	}

	public void setUserUid(int userUid){
		this.userUid=userUid;
	}

	public double getMyCoin(){

			return this.myCoin;
	}

	public void setMyCoin(double myCoin){
		this.myCoin=myCoin;
	}

	public java.util.Date getMyCoinDatetime(){

			return this.myCoinDatetime;
	}

	public void setMyCoinDatetime(java.util.Date myCoinDatetime){
		this.myCoinDatetime=myCoinDatetime;
	}

}
