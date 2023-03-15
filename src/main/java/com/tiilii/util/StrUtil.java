package com.tiilii.util;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrUtil {

	/**
	 * 判断字符串是否为空 为null或者为"" 返回true
	 * @param arg
	 * @return
	 */
	public static boolean isEmpty(String arg) {
		if (null == arg || "".equals(arg)) {
			return true;
		}
		return false;
	}

	/**
	 * 将Object转为String类型
	 * @param obj
	 * @return
	 */
	public static String getStringValue(Object obj) {
		return (obj == null || obj.toString().trim().equals("")) ? null : (String) obj;
	}
	
	/**
	 * 获取Object的int值
	 * @param obj
	 * @return
	 */
	public static int getIntValue(Object obj) {// new
		// Double(obj.toString()).intValue()
		return (obj == null || obj.toString().trim().equals("")) ? 0 : new Double(obj.toString()).intValue();
	}

	/**
	 * 保留2位小数, 先将都变了转为String，再转为double，格式化为保留两位小数
	 * @param a
	 * @return
	 */
	public static double get2Double(double a) {
		DecimalFormat df = new DecimalFormat("0.00");
		return new Double(df.format(a).toString());
	}

	
	private static final String CODE = "0123456789";

	/**
	 * 生成随机字符，不含0和O，字符全为大写
	 * 
	 * @param length
	 * @return
	 */
	public static String getCaptachCode(int length) {
		String str = "";
		for (int i = 0; i < length; i++) {
			str = str + CODE.charAt((int) (CODE.length() * java.lang.Math.random()));
		}
		return str;
	}
	
	/**
	 * 检查手机号是否符合规范
	 * 
	 * @author hunter
	 * @date 2018-4-23
	 * @param phoneId 手机号
	 * @return boolean
	 */
	public static boolean checkPhoneId(String phoneId){
		//String phone = "13123456789";
        String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
        if(phoneId.length() != 11){
            return false;
        }else{
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phoneId);
            boolean isMatch = m.matches();
            if(isMatch){
                return true;
            } else {
                return false;
            }
        }
	}
	
	/**
	 * 校验密码 长度大于等于6， 小于16， 只能是字母和数字
	 * 
	 * @author hunter
	 * @date 2018-4-24
	 * @param psd
	 * @return
	 */
	public static boolean checkPwd(String pwd){
		String regex = "[\\w]+";
		if(pwd.length() < 6 || pwd.length() >= 16){
            return false;
        }else{
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(pwd);
            boolean isMatch = m.matches();
            if(isMatch){
                return true;
            } else {
                return false;
            }
        }
	}
	
	
	 /** 
     * 时间戳转换成日期格式字符串 
     * @param seconds 精确到秒的字符串 
     * @param formatStr 
     * @return 
     */  
    public static String timeStamp2Date(String seconds,String format) {  
        if(seconds == null || seconds.isEmpty() || seconds.equals("null")){  
            return "";  
        }  
        if(format == null || format.isEmpty()){
            format = "yyyy-MM-dd HH:mm:ss";
        }   
        SimpleDateFormat sdf = new SimpleDateFormat(format);  
        return sdf.format(new Date(Long.valueOf(seconds+"000")));  
    }  
    /** 
     * 日期格式字符串转换成时间戳 
     * @param date 字符串日期 
     * @param format 如：yyyy-MM-dd HH:mm:ss 
     * @return 
     */  
    public static String date2TimeStamp(String date_str,String format){  
        try {  
            SimpleDateFormat sdf = new SimpleDateFormat(format);  
            return String.valueOf(sdf.parse(date_str).getTime()/1000);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return "";  
    }  
      
    /** 
     * 取得当前时间戳（精确到秒） 
     * @return 
     */  
    public static String timeStamp(){  
        long time = System.currentTimeMillis();
        String t = String.valueOf(time/1000);  
        return t;  
    }  

    public static void main(String[] args) {  
        String timeStamp = timeStamp();  
        System.out.println("timeStamp="+timeStamp); //运行输出:timeStamp=1470278082
        System.out.println(System.currentTimeMillis());//运行输出:1470278082980
        //该方法的作用是返回当前的计算机时间，时间的表达格式为当前计算机时间和GMT时间(格林威治时间)1970年1月1号0时0分0秒所差的毫秒数
        
        String date = timeStamp2Date(timeStamp, "yyyy-MM-dd HH:mm:ss");  
        System.out.println("date="+date);//运行输出:date=2016-08-04 10:34:42
        
        String timeStamp2 = date2TimeStamp(date, "yyyy-MM-dd HH:mm:ss");  
        System.out.println(timeStamp2);  //运行输出:1470278082
    }  
	
    
}
