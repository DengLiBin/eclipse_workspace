package factory;

import test.Banana;
import test.Fruit;
import test.FruitFactory;

public class BananaFactory implements FruitFactory {

	@Override
	public Fruit getFruit() {
		return new Banana();
	}

}
