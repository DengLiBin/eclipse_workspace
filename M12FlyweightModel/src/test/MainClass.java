package test;
/**
 * 享元模式：它通过与其他类似对象共享数据来减小内存占用
 * @author Administrator
 *
 */
public class MainClass {

	public static void main(String[] args) {
		/*
		MyCharacter mychar1 = new MyCharacter('a');
		MyCharacter mychar2 = new MyCharacter('b');
		MyCharacter mychar3 = new MyCharacter('a');
		MyCharacter mychar4 = new MyCharacter('d');
		MyCharacter mychar5 = new MyCharacter('e');
		
		mychar1.display();
		mychar2.display();
		mychar3.display();
		mychar4.display();
		mychar5.display();
		System.out.println(mychar1 == mychar3);//false
		*/
		//虽然mychar1和mychar3是同一个字符，但是却不是同一个对象，比较浪费内存空间
		
		//1、创建MyCharacter工厂
		MyCharacterFactory factory = new MyCharacterFactory();
		
		MyCharacter mychar1 = factory.getMyCharacter('a');
		MyCharacter mychar2 = factory.getMyCharacter('b');
		MyCharacter mychar3 = factory.getMyCharacter('a');
		MyCharacter mychar4 = factory.getMyCharacter('d');
		MyCharacter mychar5 = factory.getMyCharacter('e');
		
		mychar1.display();
		mychar2.display();
		mychar3.display();
		mychar4.display();
		mychar5.display();
		
		System.out.println(mychar1 == mychar3);//true,mychar1和mychar3是同一个对象
	}

}
