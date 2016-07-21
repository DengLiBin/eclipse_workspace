package myuse.demo;

public class Demo {
	//可变参数，看成数组
	public void getSum(int ...nums){
		int sum = 0;
		for(int i : nums){
			sum += i;
		}
		System.out.println("sum="+sum);
	}
	//可变参数需要注意的问题(int ...nums,int x),这种写法错误
	public void add(int x,int ...nums){
		
	}
}
