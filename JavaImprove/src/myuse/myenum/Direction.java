package myuse.myenum;

public enum Direction {
	E("����"),W("����"),N("����"),S("�Ϸ�");//Object,��ö�ٵĶ���
	private String value;//��װÿ�������Ӧ�ķ���
	
	//����ö�ٵĹ��췽��������Ϊ˽�У��������ⲿ�½����󣬲�Ȼ�Ͳ���ö����
	private Direction(String value){
		this.value = value;
	}
	
	public void print(){
		System.out.println(this.value);
	}
}
