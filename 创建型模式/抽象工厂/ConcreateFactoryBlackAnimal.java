package ���󹤳�;
/**
 * @Description ���幤��
 * @author caiqing
 * @Date 2016-5-30 ����1:43:26
 */
public class ConcreateFactoryBlackAnimal implements AbstractFactory{

	@Override
	public AbstractProductICat createCat() {
		return new ConcreateProductBlackCat();
	}

	@Override
	public AbstractProductIDog createDog() {
		return new ConcreateProductBlackDog();
	}

}
