package ģ�巽��ģʽ;
/**
 * @Description ����ģ��1
 * @author caiqing
 * @Date 2016-6-8 ����2:11:41
 */
public class Hanma1Model extends HanmaModel{

	@Override
	public void start() {
		System.out.println("����1����");
		
	}

	@Override
	public void alarm() {
		System.out.println("����1������");
		
	}

	@Override
	public void stop() {
		System.out.println("����1ͣ��");
		
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
