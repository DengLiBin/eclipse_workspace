package main;

import threads.MyThread;

public class Main {
	public static void main(String[] args ){
		MyThread thread=new MyThread();
		sout("新建线程："+thread.getState());
		
		thread.start();
		sout("启动线程："+thread.getState());
				
	}
	
	public static void sout(String infos){
		System.out.println(infos);
	}
}
