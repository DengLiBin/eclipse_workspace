package test;

import org.junit.Test;

public class Person {
	public static void main(String [] args){
		System.out.println("hello world!");
		int x=Person.getInstance().add(5);
		System.out.println(x);
		
		int z = 2;
		int y = 3;
		swap(z,y);
		System.out.println(z+"--"+y);
		
		
	
	}
	
	private void get(){
		System.out.println("have called the method get()");
	}
	@Test
	public static Person getInstance(){
		return new Person();
	}
	
	private int add(int n){
		if(n==1){
			return n;
		}else{
			return add(n-1)+add(n-1);
		}
	}
	private static void swap(int x,int y){
		int temp = x;
		x = y;
		y = temp;
		System.out.println(x+"--"+y);
	}
}
