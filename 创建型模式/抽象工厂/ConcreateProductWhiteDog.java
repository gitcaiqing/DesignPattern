package 抽象工厂;
/**
 * @Description 具体产品
 * @author caiqing
 * @Date 2016-5-30 下午1:45:20
 */
public class ConcreateProductWhiteDog implements AbstractProductIDog{

	@Override
	public void eat() {
		System.out.println("white dog eating");
		
	}

}
