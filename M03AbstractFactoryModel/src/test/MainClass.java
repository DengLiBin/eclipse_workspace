package test;
/**
 * 抽象工厂模式
 * @author Administrator
 *
 */
public class MainClass {
	public static void main(String[] args){
		FruitFactory ff=new NorthFruitFactory();
		Fruit northApple=ff.getApple();
		Fruit northBanana=ff.getBanana();
		northApple.get();
		northBanana.get();
		
		FruitFactory ff2=new SouthFactory();
		Fruit southApple=ff2.getApple();
		Fruit southBanana=ff2.getBanana();
		southApple.get();
		southBanana.get();
		
		FruitFactory ff3=new WenShiFactory();
		Fruit wenshiApple=ff3.getApple();
		Fruit wenshiBanana=ff3.getBanana();
		wenshiApple.get();
		wenshiBanana.get();
		
	}
}
