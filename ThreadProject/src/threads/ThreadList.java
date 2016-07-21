package threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadList {
	/**
	 * ��ø��߳���
	 * @return
	 */
	public static ThreadGroup getRootThreadGroup(){
		ThreadGroup rootGroup=Thread.currentThread().getThreadGroup();
		while(true){
			if(rootGroup.getParent()!=null){
				rootGroup=rootGroup.getParent();
			}else{
				break;
			}
		}
		return rootGroup;
	}
	/**
	 * ��ø����߳����е������߳���
	 */
	public static List<String>getThreads(ThreadGroup group){
		List<String> threadList=new ArrayList();
		Thread[] threads = new Thread[group.activeCount()];
		int count=group.enumerate(threads, false);
		for(int i=0;i<count;i++){
			threadList.add(group.getName()+"�߳��飺"+threads[i].getName());
		}
		return threadList;
	}
	/**
	 * ����߳��������߳���
	 */
	
}
