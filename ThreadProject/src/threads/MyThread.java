package threads;

import main.Main;

public class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=0;i<100;i++){
			Main.sout("ִ��run����"+i);
			if(i%10==0){
				try {
					Thread.sleep(1000);
					Main.sout("�߳���ͣ1s");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	@Override
	public State getState() {
		
		return super.getState();
	}
}
