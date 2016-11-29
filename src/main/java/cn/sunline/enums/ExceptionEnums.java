/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：cn.sunline.enumsExceptionEnums.java
 * 作  者：刘卜铷
 * 日  期：2016年11月29日 下午2:23:51
 * 描  述：
 * 版  本：1.0
 */
package cn.sunline.enums;
/**
 * 异常枚举类型
 * @author 刘卜铷
 * @date 2016年11月29日 下午2:24:16
 */
public interface ExceptionEnums {
		//1.数学异常类型  加减乘除  2.传值异常 字符串数字类型传了非法东西
	
	/**
	 * 数学异常类型
	 * @author 刘卜铷
	 * @date 2016年11月29日 下午2:40:22
	 */
	public static enum E_MATH_TYPE	{
		ADD("101","加法异常"),
		SUBTRACTION("102","减法异常"),
		MULTIPLICATION("103","乘法异常"),
		DIVISION("104","除法异常");
		private String stateNum;
		private String stateInfo;
		
		private E_MATH_TYPE(String stateNum, String stateInfo) {
			this.stateNum = stateNum;
			this.stateInfo = stateInfo;
		}

		public String getStateNum() {
			return stateNum;
		}

		public void setStateNum(String stateNum) {
			this.stateNum = stateNum;
		}

		public String getStateInfo() {
			return stateInfo;
		}

		public void setStateInfo(String stateInfo) {
			this.stateInfo = stateInfo;
		}
		
		public static E_MATH_TYPE stateOf(String state){
			for(E_MATH_TYPE mathType :values()){
				if(mathType.getStateNum().equals(state)){
					return mathType;
				}
			}
			return null;
		}
		
		
	}
	
	
	/**
	 * 传值异常类型
	 * @author 刘卜铷
	 * @date 2016年11月29日 下午2:40:34
	 */
	public static enum E_VALUE_TYPE{
		RIGHT("1001","正确"),
		WRONG("1002","错误");
		private String stateNum;
		private String stateInfo;
		private E_VALUE_TYPE(String stateNum, String stateInfo) {
			this.stateNum = stateNum;
			this.stateInfo = stateInfo;
		}
		public String getStateNum() {
			return stateNum;
		}
		public void setStateNum(String stateNum) {
			this.stateNum = stateNum;
		}
		public String getStateInfo() {
			return stateInfo;
		}
		public void setStateInfo(String stateInfo) {
			this.stateInfo = stateInfo;
		}
		
		public static E_VALUE_TYPE stateOf(String stateNum){
			for(E_VALUE_TYPE valueType:values()){
				if(valueType.getStateNum().equals(stateNum)){
					return valueType;
				}
			}
			return null;
		}
	}
}
