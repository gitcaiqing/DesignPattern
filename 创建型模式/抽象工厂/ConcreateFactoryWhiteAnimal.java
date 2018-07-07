package 抽象工厂;
/**
 * @Description 具体工厂
 * @author caiqing
 * @Date 2016-5-30 下午1:43:26
 */
public class ConcreateFactoryWhiteAnimal implements AbstractFactory{

	@Override
	public AbstractProductICat createCat() {
		return new ConcreateProductWhiteCat();
	}

	@Override
	public AbstractProductIDog createDog() {
		return new ConcreateProductWhiteDog();
	}

}
