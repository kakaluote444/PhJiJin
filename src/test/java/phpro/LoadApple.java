/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：phproLoadApple.java
 * 作  者：刘卜铷
 * 日  期：2016年11月30日 下午3:27:45
 * 描  述：
 * 版  本：1.0
 */
package phpro;

import cn.sunline.entity.Apple;

public class LoadApple {
	public static  Apple staticApple;
	static{
		staticApple= new Apple();
		staticApple.setName("静态Apple");
		System.out.println(staticApple.hashCode());
	}
}
