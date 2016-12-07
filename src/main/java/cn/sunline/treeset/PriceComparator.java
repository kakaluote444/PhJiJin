/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：cn.sunline.treesetIDComparator.java
 * 作  者：刘卜铷
 * 日  期：2016年12月7日 上午9:09:53
 * 描  述：
 * 版  本：1.0
 */
package cn.sunline.treeset;

import java.util.Comparator;
/**
 * 按照拼音排序
 * @author 刘卜铷
 * @date 2016年12月7日 上午9:11:26
 */
public class PriceComparator implements Comparator<Book> {

	public int compare(Book o1, Book o2) {
		int result = (int) ((o1.getPrice()-o2.getPrice())*10000);
		if(result==0){
			return 1;
		}else{
			return result;
		}
	}

}
