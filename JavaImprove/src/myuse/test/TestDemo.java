package myuse.test;

import org.junit.Test;

import myuse.demo.Demo;

public class TestDemo {
	@Test
	public void testGetSum(){
		Demo demo = new Demo();
		int[] arr = new int[]{2,4,6};
		demo.getSum(2,3,5);
		demo.getSum(arr);
	}
}
