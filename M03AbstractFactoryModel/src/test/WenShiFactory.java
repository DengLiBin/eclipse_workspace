package test;

public class WenShiFactory implements FruitFactory {

	@Override
	public Fruit getApple() {
		
		return new WenShiApple();
	}

	@Override
	public Fruit getBanana() {
		
		return new WenShiBanana();
	}

}
