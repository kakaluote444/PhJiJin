/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：phproTestEnum.java
 * 作  者：刘卜铷
 * 日  期：2016年11月29日 下午2:41:00
 * 描  述：
 * 版  本：1.0
 */
package phpro;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import org.junit.Test;
import cn.sunline.entity.Apple;
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
		String str1 = "hello"+"Jack";
		String str2 = "helloJack";
		String str3 = "hello";
		str3=str3+"Jack";
		
		String str4 = str3;
		System.out.println(str4==str1);
		
//		System.out.println(str1==str2);
//		System.out.println(str2==str3);
//		System.out.println(str1==str3);
//		System.out.println(str1.hashCode());
//		System.out.println(str3.hashCode());
	}
	
	@Test
	public void testApple()
	{
		Apple apple1 = new Apple();
		apple1.setId(101);
		apple1.setName("apple");
		Apple apple2 = new Apple();
		apple2.setId(101);
		apple2.setName("apple");
		System.out.println(apple1.hashCode());
		System.out.println(apple2.hashCode());
	}
	
	 @Test
	    public void testTheSameReference1(){
	        String str1="abc";
	        String str2="abc";
	        String str3="ab"+"c";
	        String str4=new String(str2);
	        
	        //str1和str2引用自常量池里的同一个string对象
			assertSame(str1,str2);
	        //str3通过编译优化，与str1引用自同一个对象
	        assertSame(str1,str3);
	        assertSame(str2,str3);
	        //str4因为是在堆中重新分配的另一个对象，所以它的引用与str1不同
	        assertNotSame(str1,str4);
	    }
}
