package 模板方法模式;

public class Hanma2Model extends HanmaModel{

	@Override
	public void start() {
		System.out.println("悍马2启动");
		
	}

	@Override
	public void alarm() {
		System.out.println("悍马2鸣喇叭");
		
	}

	@Override
	public void stop() {
		System.out.println("悍马2停车");
		
	}
	
	/*public void run(){
		this.start();
		this.alarm();
		this.stop();
	}*/
	
	public boolean isAlarm(){
		return true;
	}
	
}
