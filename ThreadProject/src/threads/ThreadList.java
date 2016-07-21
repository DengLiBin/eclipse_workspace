package threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadList {
	/**
	 * 获得根线程组
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
	 * 获得给定线程组中的所有线程名
	 */
	public static List<String>getThreads(ThreadGroup group){
		List<String> threadList=new ArrayList();
		Thread[] threads = new Thread[group.activeCount()];
		int count=group.enumerate(threads, false);
		for(int i=0;i<count;i++){
			threadList.add(group.getName()+"线程组："+threads[i].getName());
		}
		return threadList;
	}
	/**
	 * 获得线程组中子线程组
	 */
	
}
