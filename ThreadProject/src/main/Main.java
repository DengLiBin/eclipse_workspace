package main;

import threads.MyThread;

public class Main {
	public static void main(String[] args ){
		MyThread thread=new MyThread();
		sout("�½��̣߳�"+thread.getState());
		
		thread.start();
		sout("�����̣߳�"+thread.getState());
				
	}
	
	public static void sout(String infos){
		System.out.println(infos);
	}
}
