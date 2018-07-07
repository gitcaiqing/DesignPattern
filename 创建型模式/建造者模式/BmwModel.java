package 建造者模式;
/**
 * @Description 宝马汽车模型
 * @author caiqing
 * @Date 2016-5-31 上午9:10:39
 */
public class BmwModel extends CarModel{

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("宝马启动");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("宝马停车");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("宝马鸣喇叭");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("宝马引擎轰隆隆");
	}

}
