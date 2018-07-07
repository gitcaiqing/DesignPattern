package ���󹤳�;

public class TestFactory {
	public static void main(String[] args) {
		
		//new һ�����幤������
		AbstractFactory blackAnimal  = new ConcreateFactoryBlackAnimal();
		AbstractProductICat blackCat = blackAnimal.createCat();
		blackCat.eat();
		System.out.println("--------------------------------");
		AbstractProductIDog blackDog = blackAnimal.createDog();
		blackDog.eat();
		
		System.out.println("--------------------------------");
		
		AbstractFactory whiteAnimal = new ConcreateFactoryWhiteAnimal();
		AbstractProductICat whiteCat = whiteAnimal.createCat();
		whiteCat.eat();
		System.out.println("--------------------------------");
		AbstractProductIDog whiteDog = whiteAnimal.createDog();
		whiteDog.eat();
	}
}
