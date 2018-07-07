package 建造者模式;
/**
 * @Description 奔驰汽车模型
 * @author caiqing
 * @Date 2016-5-31 上午9:11:23
 */
public class BenzModel extends CarModel{

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("奔驰启动");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("奔驰停车");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("奔驰鸣喇叭");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("奔驰引擎轰隆隆");
	}

}
