package 抽象工厂;

/**
 * @Description 抽象工厂
 * @author caiqing
 * @Date 2016-5-30 下午1:42:31
 */
public interface AbstractFactory {
	
	AbstractProductICat createCat();
	
	AbstractProductIDog createDog();
}
