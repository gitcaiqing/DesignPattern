package ģ�巽��ģʽ;

public class Hanma2Model extends HanmaModel{

	@Override
	public void start() {
		System.out.println("����2����");
		
	}

	@Override
	public void alarm() {
		System.out.println("����2������");
		
	}

	@Override
	public void stop() {
		System.out.println("����2ͣ��");
		
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
