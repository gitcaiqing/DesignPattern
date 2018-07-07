package ����ģʽ;
/**
 * @Description ����ʽ������ʱ��ʼ��
 * @author caiqing
 * @Date 2016-5-23 ����5:24:21
 */
public class Lazy {
	//1.����˽�л����캯��
	private Lazy(){
		
	}
	
	private static Lazy lazy = null;
	
	//2.����
	public static synchronized Lazy getInstance(){
		if(lazy == null){
			synchronized (Lazy.class) {
				//3.����ʱ��ʼ��
				lazy = new Lazy();
			}
		}
		return lazy;
	}
	
	//4.�����������
	public void say(){
		System.out.println("I am Lazy Single Pattern");
	}
}
