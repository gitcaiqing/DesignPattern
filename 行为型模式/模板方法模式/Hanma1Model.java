package 模板方法模式;
/**
 * @Description 悍马模型1
 * @author caiqing
 * @Date 2016-6-8 下午2:11:41
 */
public class Hanma1Model extends HanmaModel{

	@Override
	public void start() {
		System.out.println("悍马1启动");
		
	}

	@Override
	public void alarm() {
		System.out.println("悍马1鸣喇叭");
		
	}

	@Override
	public void stop() {
		System.out.println("悍马1停车");
		
	}
	
	@Override
	public boolean isAlarm(){
		return false;
	}
	
	/*public void run(){
		this.start();
		this.alarm();
		this.stop();
	}*/

}
