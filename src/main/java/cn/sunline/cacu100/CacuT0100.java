/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：cn.sunline.cacu100CacuT0100.java
 * 作  者：刘卜铷
 * 日  期：2016年12月6日 上午9:53:59
 * 描  述：
 * 版  本：1.0
 */
package cn.sunline.cacu100;

import org.junit.Test;

public class CacuT0100 {
	
		@Test
		public void method1(){
		/**
		 * 第一种方法测试
		 */
		int result21 = getResult1(1042700000);
		
		System.out.println(result21);
		System.out.println(getResult1(Integer.MAX_VALUE));
			
		}
		@Test
		public void method2(){
			/**
			 * 第二种方法测试
			 */
			int result21 = getResult2(104270);
			System.out.println(result21);
			//当房发展>10427左右时，会抛出java.lang.StackOverflowError
//			int result22 = getResult2(10429);
//			System.out.println(result22);
			
		}
		
		/**
		 * 思路：先转2进制，在位移预算
		 * @author 刘卜铷
		 * @date 2016年12月6日 上午10:18:04
		 * @param n
		 * @return
		 */
		public int getResult1(int n){
			int result = 0;
			String bnyStr =Integer.toBinaryString(n); 
			int len = bnyStr.length();
			for(int i=0;i<len;i++){
				if(bnyStr.charAt(i)=='1'){
					result+=(1<<(len-i-1));
				}
			}
			return result;
		}
		
		
		/**
		 * 思路：使用递归
		 * @author 刘卜铷
		 * @date 2016年12月6日 上午10:18:15
		 * @param n
		 * @return
		 */
		public int getResult2(int n){
			if(n==1){
				return 1;
			}else{
				return getResult2(n-1)+1;
			}
		}
		
		@Test
		public void testOther(){
			System.out.println((1<<1)+1);
		}
}
