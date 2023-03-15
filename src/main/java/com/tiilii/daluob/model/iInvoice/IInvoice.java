/**
 *	create by tools 2018-8-16 14:32:18
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：IInvoice.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.daluob.model.iInvoice;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "i_invoice")
@IDGenerator(generator=GeneratorType.IDENTITY)
public class IInvoice implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_INVOICEUID = "invoiceUid";
	public static final String FIELD_EXPRESSID = "expressId";
	public static final String FIELD_INVOICESTATUSID = "invoiceStatusId";
	public static final String FIELD_REQUESTUID = "requestUid";
	public static final String FIELD_PRINTERUID = "printerUid";
	public static final String FIELD_APPID = "appId";
	public static final String FIELD_ORDERNO = "orderNo";
	public static final String FIELD_INVOICEREQUESTDATETIME = "invoiceRequestDatetime";
	public static final String FIELD_INVOICEPRINTDATETIME = "invoicePrintDatetime";
	public static final String FIELD_INVOICENO = "invoiceNo";
	public static final String FIELD_INVOICEITEM = "invoiceItem";
	public static final String FIELD_INVOICEAMOUNT = "invoiceAmount";
	public static final String FIELD_INVOICEPRICE = "invoicePrice";
	public static final String FIELD_INVOICETAXRATIO = "invoiceTaxRatio";
	public static final String FIELD_INVOICEMONEY = "invoiceMoney";
	public static final String FIELD_UNITNAME = "unitName";
	public static final String FIELD_UNITTAXNO = "unitTaxNo";
	public static final String FIELD_UNITADDRESS = "unitAddress";
	public static final String FIELD_UNITPHONE = "unitPhone";
	public static final String FIELD_UNITBANK = "unitBank";
	public static final String FIELD_UNITACCOUNT = "unitAccount";
	public static final String FIELD_RECEIVERNAME = "receiverName";
	public static final String FIELD_RECEIVERADDRESS = "receiverAddress";
	public static final String FIELD_RECEIVERPHONE = "receiverPhone";
	public static final String FIELD_LOGISTICSNO = "logisticsNo";

	@Column(name="invoice_uid", isPk=true, isFk=false,isBlob=false,isClob=false)
	private int invoiceUid;

	@Column(name="express_id", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String expressId;

	@Column(name="invoice_status_id", isPk=false, isFk=true,isBlob=false,isClob=false)
	private String invoiceStatusId;

	@Column(name="request_uid", isPk=false, isFk=true,isBlob=false,isClob=false)
	private int requestUid;

	@Column(name="printer_uid", isPk=false, isFk=true,isBlob=false,isClob=false)
	private int printerUid;

	@Column(name="app_id", isPk=false, isFk=true,isBlob=false,isClob=false)
	private String appId;

	@Column(name="order_no", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int orderNo;

	@Column(name="invoice_request_datetime", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.sql.Timestamp invoiceRequestDatetime;

	@Column(name="invoice_print_datetime", isPk=false, isFk=false,isBlob=false,isClob=false)
	private java.sql.Timestamp invoicePrintDatetime;

	@Column(name="invoice_no", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String invoiceNo;

	@Column(name="invoice_item", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String invoiceItem;

	@Column(name="invoice_amount", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int invoiceAmount;

	@Column(name="invoice_price", isPk=false, isFk=false,isBlob=false,isClob=false)
	private double invoicePrice;

	@Column(name="invoice_tax_ratio", isPk=false, isFk=false,isBlob=false,isClob=false)
	private int invoiceTaxRatio;

	@Column(name="invoice_money", isPk=false, isFk=false,isBlob=false,isClob=false)
	private double invoiceMoney;

	@Column(name="unit_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String unitName;

	@Column(name="unit_tax_no", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String unitTaxNo;

	@Column(name="unit_address", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String unitAddress;

	@Column(name="unit_phone", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String unitPhone;

	@Column(name="unit_bank", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String unitBank;

	@Column(name="unit_account", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String unitAccount;

	@Column(name="receiver_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String receiverName;

	@Column(name="receiver_address", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String receiverAddress;

	@Column(name="receiver_phone", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String receiverPhone;

	@Column(name="logistics_no", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String logisticsNo;

	public int getInvoiceUid(){

			return this.invoiceUid;
	}

	public void setInvoiceUid(int invoiceUid){
		this.invoiceUid=invoiceUid;
	}

	public String getExpressId(){

			return this.expressId;
	}

	public void setExpressId(String expressId){
		this.expressId=expressId;
	}

	public String getInvoiceStatusId(){

			return this.invoiceStatusId;
	}

	public void setInvoiceStatusId(String invoiceStatusId){
		this.invoiceStatusId=invoiceStatusId;
	}

	public int getRequestUid(){

			return this.requestUid;
	}

	public void setRequestUid(int requestUid){
		this.requestUid=requestUid;
	}

	public int getPrinterUid(){

			return this.printerUid;
	}

	public void setPrinterUid(int printerUid){
		this.printerUid=printerUid;
	}

	public String getAppId(){

			return this.appId;
	}

	public void setAppId(String appId){
		this.appId=appId;
	}

	public int getOrderNo(){

			return this.orderNo;
	}

	public void setOrderNo(int orderNo){
		this.orderNo=orderNo;
	}

	public java.sql.Timestamp getInvoiceRequestDatetime(){

			return this.invoiceRequestDatetime;
	}

	public void setInvoiceRequestDatetime(java.sql.Timestamp invoiceRequestDatetime){
		this.invoiceRequestDatetime=invoiceRequestDatetime;
	}

	public java.sql.Timestamp getInvoicePrintDatetime(){

			return this.invoicePrintDatetime;
	}

	public void setInvoicePrintDatetime(java.sql.Timestamp invoicePrintDatetime){
		this.invoicePrintDatetime=invoicePrintDatetime;
	}

	public String getInvoiceNo(){

			return this.invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo){
		this.invoiceNo=invoiceNo;
	}

	public String getInvoiceItem(){

			return this.invoiceItem;
	}

	public void setInvoiceItem(String invoiceItem){
		this.invoiceItem=invoiceItem;
	}

	public int getInvoiceAmount(){

			return this.invoiceAmount;
	}

	public void setInvoiceAmount(int invoiceAmount){
		this.invoiceAmount=invoiceAmount;
	}

	public double getInvoicePrice(){

			return this.invoicePrice;
	}

	public void setInvoicePrice(double invoicePrice){
		this.invoicePrice=invoicePrice;
	}

	public int getInvoiceTaxRatio(){

			return this.invoiceTaxRatio;
	}

	public void setInvoiceTaxRatio(int invoiceTaxRatio){
		this.invoiceTaxRatio=invoiceTaxRatio;
	}

	public double getInvoiceMoney(){

			return this.invoiceMoney;
	}

	public void setInvoiceMoney(double invoiceMoney){
		this.invoiceMoney=invoiceMoney;
	}

	public String getUnitName(){

			return this.unitName;
	}

	public void setUnitName(String unitName){
		this.unitName=unitName;
	}

	public String getUnitTaxNo(){

			return this.unitTaxNo;
	}

	public void setUnitTaxNo(String unitTaxNo){
		this.unitTaxNo=unitTaxNo;
	}

	public String getUnitAddress(){

			return this.unitAddress;
	}

	public void setUnitAddress(String unitAddress){
		this.unitAddress=unitAddress;
	}

	public String getUnitPhone(){

			return this.unitPhone;
	}

	public void setUnitPhone(String unitPhone){
		this.unitPhone=unitPhone;
	}

	public String getUnitBank(){

			return this.unitBank;
	}

	public void setUnitBank(String unitBank){
		this.unitBank=unitBank;
	}

	public String getUnitAccount(){

			return this.unitAccount;
	}

	public void setUnitAccount(String unitAccount){
		this.unitAccount=unitAccount;
	}

	public String getReceiverName(){

			return this.receiverName;
	}

	public void setReceiverName(String receiverName){
		this.receiverName=receiverName;
	}

	public String getReceiverAddress(){

			return this.receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress){
		this.receiverAddress=receiverAddress;
	}

	public String getReceiverPhone(){

			return this.receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone){
		this.receiverPhone=receiverPhone;
	}

	public String getLogisticsNo(){

			return this.logisticsNo;
	}

	public void setLogisticsNo(String logisticsNo){
		this.logisticsNo=logisticsNo;
	}

}
