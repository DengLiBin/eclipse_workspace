package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookList {
	private List<Book> bookList;
	public  int index = 0;//����
	public BookList(){
		bookList = new ArrayList<Book>();
	}
	
	//����鼮
	public void addBook(Book book){
		bookList.add(book);
	}
	//ɾ���鼮
	public void deleteBook(Book book){
		int bookIndex = bookList.indexOf(book);
		bookList.remove(bookIndex);
	}
	//�ж��Ƿ�����һ����
	public boolean hasNext(){
		return index<bookList.size();
	}
	public Book getNext(){
		return bookList.get(index++);
	}
	
	public List<Book> getBookList(){
		return BookList.this.bookList;
	}
	
	public MyIterator getIterator(){
		return new MyIterator();
	}
	
	public class MyIterator implements Iterator{

		@Override
		public boolean hasNext() {
			return BookList.this.hasNext();//�ڲ��෽λ�ⲿ��ķ���
		}

		@Override
		public Object next() {
			return getNext();
		}
		
	}
}
