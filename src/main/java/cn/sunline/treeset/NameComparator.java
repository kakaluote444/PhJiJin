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
public class NameComparator implements Comparator<Book> {

	public int compare(Book o1, Book o2) {
		int len1 = o1.getBookName().length();
		int len2 = o2.getBookName().length();
		int minLen = len1-len2>0?len2:len1;
		int result;
		for(int i=0;i<minLen;i++){
			result = o1.getBookName().charAt(i)-o2.getBookName().charAt(i);
			if(result!=0){
				return result;
			}
		}
		return 1;
	}

}
