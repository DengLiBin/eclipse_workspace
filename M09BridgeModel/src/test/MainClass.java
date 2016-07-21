package test;
/**
 * 桥接模式：基于类的最小设计原则，通过封装，聚合以及继承等行为来让不同的类承担不同的责任，他的主要特点就是把抽象与行为实现分离开，从而
 * 可以保持各部分的独立性以及应对它们的功能拓展
 * @author Administrator
 *
 */
public class MainClass {
	public static void main(String[] args){
		
		//Car持有Engine的引用，相当于用一个桥把Car和Engine联系起来
		Car bus=new Bus(new Engine2000());
		bus.insallEngine();
		
		Car jeep=new Jeep(new Engine2200());
		jeep.insallEngine();
	}
}
