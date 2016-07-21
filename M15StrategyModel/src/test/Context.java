package test;

public class Context {
	private Strategy strategy;
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void jiami(){
		strategy.jiami();
	}
}
