package test;
/**
 * 上下文类，用来保存文法
 * @author Administrator
 *
 */
public class Context {
	private String input;
	private int output;
	
	public Context(String input) {
		super();
		this.input = input;
	}
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public int getOutput() {
		return output;
	}
	public void setOutput(int output) {
		this.output = output;
	}
	
}	
