package test;

import java.util.Observable;
import java.util.Observer;

public class MyObServer implements Observer {

	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("对象发生变化");
	}

}
