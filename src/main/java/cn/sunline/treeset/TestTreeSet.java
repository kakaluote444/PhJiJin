/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：cn.sunline.treesetTestTreeSet.java
 * 作  者：刘卜铷
 * 日  期：2016年12月7日 上午9:01:30
 * 描  述：
 * 版  本：1.0
 */
package cn.sunline.treeset;

import java.util.Comparator;
import java.util.TreeSet;

import org.junit.Test;

public class TestTreeSet {
	private TreeSet<Book> treeSet;

	/**
	 * 排序测试
	 * @author 刘卜铷
	 * @date 2016年12月7日 上午9:11:54
	 */
	@Test
	public void testTreeSet() {
		//1.按照ID排序
		treeSet = new TreeSet<Book>(new IDComparator());
		Book b1 = new Book(101, "西游记(xi)", 12.65f);
		Book b2 = new Book(102, "水浒传(sabui)", 12.67f);
		Book b3 = new Book(103, "三国演义(saan)", 12.65f);
		Book b4 = new Book(104, "红楼梦(hong)", 11.65f);
		treeSet.add(b2);
		treeSet.add(b1);
		treeSet.add(b4);
		treeSet.add(b3);
		printTreeSet(treeSet);
		
		//2.按照Name排序
		treeSet = new TreeSet<Book>(new NameComparator());
		treeSet.add(b2);
		treeSet.add(b1);
		treeSet.add(b4);
		treeSet.add(b3);
		printTreeSet(treeSet);
		
		//3.按照Price排序
		treeSet = new TreeSet<Book>(new PriceComparator());
		treeSet.add(b2);
		treeSet.add(b1);
		treeSet.add(b4);
		treeSet.add(b3);
		printTreeSet(treeSet);
	}
	
	public void printTreeSet(TreeSet<Book> ts){
		System.out.println("**************************************************");
		for (Book book : ts) {
			System.out.println(book);
		}
		System.out.println("**************************************************");
	}

}
