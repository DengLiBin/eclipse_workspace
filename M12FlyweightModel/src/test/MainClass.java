package test;
/**
 * ��Ԫģʽ����ͨ�����������ƶ�������������С�ڴ�ռ��
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
		//��Ȼmychar1��mychar3��ͬһ���ַ�������ȴ����ͬһ�����󣬱Ƚ��˷��ڴ�ռ�
		
		//1������MyCharacter����
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
		
		System.out.println(mychar1 == mychar3);//true,mychar1��mychar3��ͬһ������
	}

}
