/**
 *	create by tools 2018-8-16 14:32:18
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：IBank.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.iBank;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "i_bank")
@IDGenerator(generator=GeneratorType.IDENTITY)
public class IBank implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_BANKUID = "bankUid";
	public static final String FIELD_BANKTYPEID = "bankTypeId";
	public static final String FIELD_BANKNAME = "bankName";
	public static final String FIELD_BANKICONURL32X32 = "bankIconUrl32x32";
	public static final String FIELD_BANKICONURL120X40 = "bankIconUrl120x40";
	public static final String FIELD_BANKID = "bankId";
	public static final String FIELD_BANKPAYNAME = "bankPayName";
	public static final String FIELD_BANKCUSTOMERORDER = "bankCustomerOrder";
	public static final String FIELD_BANKCUSTOMERKEY = "bankCustomerKey";
	public static final String FIELD_BANKINTERFACE = "bankInterface";
	public static final String FIELD_DISPINDEX1 = "dispIndex1";

	@Column(name="bank_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int bankUid;

	@Column(name="bank_type_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String bankTypeId;

	@Column(name="bank_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String bankName;

	@Column(name="bank_icon_url_32x32", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String bankIconUrl32x32;

	@Column(name="bank_icon_url_120x40", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String bankIconUrl120x40;

	@Column(name="bank_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String bankId;

	@Column(name="bank_pay_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String bankPayName;

	@Column(name="bank_customer_order", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String bankCustomerOrder;

	@Column(name="bank_customer_key", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String bankCustomerKey;

	@Column(name="bank_interface", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String bankInterface;

	@Column(name="disp_index_1", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int dispIndex1;

	public int getBankUid(){

			return this.bankUid;
	}

	public void setBankUid(int bankUid){
		this.bankUid=bankUid;
	}

	public String getBankTypeId(){

			return this.bankTypeId;
	}

	public void setBankTypeId(String bankTypeId){
		this.bankTypeId=bankTypeId;
	}

	public String getBankName(){

			return this.bankName;
	}

	public void setBankName(String bankName){
		this.bankName=bankName;
	}

	public String getBankIconUrl32x32(){

			return this.bankIconUrl32x32;
	}

	public void setBankIconUrl32x32(String bankIconUrl32x32){
		this.bankIconUrl32x32=bankIconUrl32x32;
	}

	public String getBankIconUrl120x40(){

			return this.bankIconUrl120x40;
	}

	public void setBankIconUrl120x40(String bankIconUrl120x40){
		this.bankIconUrl120x40=bankIconUrl120x40;
	}

	public String getBankId(){

			return this.bankId;
	}

	public void setBankId(String bankId){
		this.bankId=bankId;
	}

	public String getBankPayName(){

			return this.bankPayName;
	}

	public void setBankPayName(String bankPayName){
		this.bankPayName=bankPayName;
	}

	public String getBankCustomerOrder(){

			return this.bankCustomerOrder;
	}

	public void setBankCustomerOrder(String bankCustomerOrder){
		this.bankCustomerOrder=bankCustomerOrder;
	}

	public String getBankCustomerKey(){

			return this.bankCustomerKey;
	}

	public void setBankCustomerKey(String bankCustomerKey){
		this.bankCustomerKey=bankCustomerKey;
	}

	public String getBankInterface(){

			return this.bankInterface;
	}

	public void setBankInterface(String bankInterface){
		this.bankInterface=bankInterface;
	}

	public int getDispIndex1(){

			return this.dispIndex1;
	}

	public void setDispIndex1(int dispIndex1){
		this.dispIndex1=dispIndex1;
	}

}
