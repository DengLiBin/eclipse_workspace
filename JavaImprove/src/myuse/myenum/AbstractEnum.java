package myuse.myenum;
/*
 * �����󷽷���ö��
 */
public enum AbstractEnum {
	//����ö�ٶ����ʱ��Ҳ��д���󷽷�
	A("aaaa") {
		@Override
		public String localValue() {
			return this.string;
		}
	},
	B("bbbb") {
		@Override
		public String localValue() {
			return this.string;
		}
	};
	protected String string;
	private AbstractEnum(String string){
		this.string = string;
	}
	public abstract String localValue();
}