package myuse.myenum;

public enum Direction {
	E("东方"),W("西方"),N("北方"),S("南方");//Object,该枚举的对象
	private String value;//封装每个对象对应的分数
	
	//定义枚举的构造方法，必须为私有，不能在外部新建对象，不然就不叫枚举了
	private Direction(String value){
		this.value = value;
	}
	
	public void print(){
		System.out.println(this.value);
	}
}
