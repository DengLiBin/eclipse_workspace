package myuse.demo;

public class Demo {
	//�ɱ��������������
	public void getSum(int ...nums){
		int sum = 0;
		for(int i : nums){
			sum += i;
		}
		System.out.println("sum="+sum);
	}
	//�ɱ������Ҫע�������(int ...nums,int x),����д������
	public void add(int x,int ...nums){
		
	}
}
