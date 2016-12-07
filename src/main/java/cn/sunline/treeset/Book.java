/**
 * Copyright (C) 2002-2016 江西财经大学软通学院
 * 文件名：cn.sunline.treesetBook.java
 * 作  者：刘卜铷
 * 日  期：2016年12月7日 上午9:06:31
 * 描  述：
 * 版  本：1.0
 */
package cn.sunline.treeset;
/**
 * 书本对象
 * @author 刘卜铷
 * @date 2016年12月7日 上午9:11:43
 */
public class Book {
		private int id;
		private String bookName;
		private float price;
		public Book() {
		}
		
		public Book(int id, String bookName, float price) {
			super();
			this.id = id;
			this.bookName = bookName;
			this.price = price;
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Book [id=" + id + ", bookName=" + bookName + ", price="
					+ price + "]";
		}
		
}
