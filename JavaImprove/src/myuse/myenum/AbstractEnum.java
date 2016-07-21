package myuse.myenum;
/*
 * 带抽象方法的枚举
 */
public enum AbstractEnum {
	//创建枚举对象的时候也复写抽象方法
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
