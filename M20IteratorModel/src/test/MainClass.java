package test;

import java.util.Iterator;
import java.util.List;

import test.BookList.MyIterator;

/**
 * ����ģʽ:����Ϊ����Ч�Ĵ���˳����б������ʵ�һ��ģʽ
 * @author DengLibin
 *
 */
public class MainClass {

	public static void main(String[] args) {
		BookList bookList = new BookList();
		
		Book book1 = new Book("010214","java���",45);
		Book book2 = new Book("010215","java����",50);
		Book book3 = new Book("010216","java�߼�",47);
		Book book4 = new Book("010217","javaWeb",25);
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
		bookList.addBook(book4);
	/*	1��
		while(bookList.hasNext()){
			Book book = bookList.getNext();
			book.DisplayString();
		}
		*/
		
		//2��
		/*
		List<Book> bookDataList = bookList.getBookList();
		for(int i=0;i<bookDataList.size();i++){
			Book book = bookDataList.get(i);
			book.DisplayString();
		}
		*/
		//3��������ģʽ
		Iterator it = bookList.getIterator();
		while(it.hasNext()){
			Book book = (Book) it.next();
			book.DisplayString();
		}
	}

}
