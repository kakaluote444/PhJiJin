/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：phproTestEnum.java
 * 作  者：刘卜铷
 * 日  期：2016年11月29日 下午2:41:00
 * 描  述：
 * 版  本：1.0
 */
package phpro;

import org.junit.Test;

import cn.sunline.enums.ExceptionEnums;
import cn.sunline.enums.ExceptionEnums.E_MATH_TYPE;

public class TestEnum {
		
	@Test
	public void testNum(){
			E_MATH_TYPE stateOf = ExceptionEnums.E_MATH_TYPE.stateOf("102");
			System.out.println("stateNum="+stateOf.getStateNum());
			System.out.println("stateInfo="+stateOf.getStateInfo());
			ExceptionEnums.E_MATH_TYPE e1 = ExceptionEnums.E_MATH_TYPE.ADD;
			ExceptionEnums.E_MATH_TYPE e2 = ExceptionEnums.E_MATH_TYPE.ADD;
			System.out.println(e1.equals(e2));
			System.out.println(e1==e2);
			
	}
	
	@Test
	public void testString(){
		String str1 = "hello";
		String str2 = "hello";
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println(str3.equals(str4));
		System.out.println(str3==str4);
		
		
	}
}
