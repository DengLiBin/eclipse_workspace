package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookList {
	private List<Book> bookList;
	public  int index = 0;//索引
	public BookList(){
		bookList = new ArrayList<Book>();
	}
	
	//添加书籍
	public void addBook(Book book){
		bookList.add(book);
	}
	//删除书籍
	public void deleteBook(Book book){
		int bookIndex = bookList.indexOf(book);
		bookList.remove(bookIndex);
	}
	//判断是否有下一本书
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
			return BookList.this.hasNext();//内部类方位外部类的方法
		}

		@Override
		public Object next() {
			return getNext();
		}
		
	}
}
