package ����ģʽ;

/**
 * @Description ����ʽ���ȳ�ʼ��
 * @author caiqing
 * @Date 2016-5-23 ����5:23:55
 */
public class Huangry {
	
	//1����˽�л�����
	private Huangry(){
		
	}
	
	//2��ʼ��
	private  final static Huangry huangry = new Huangry();
	
	//3�����ⲿ���õķ��� 
	public static   Huangry getInstance(){
		return huangry;
	}
	//4�����������
	public void say(){
		System.out.println("I am Huangry Single Pattern");
	}
}
