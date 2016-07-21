package factory;

import test.Fruit;
import test.FruitFactory;
import test.Pear;

public class PearFactory implements FruitFactory {

	@Override
	public Fruit getFruit() {
		return new Pear();
	}

}
