package 单例模式;

/**
 * @Description 饿汉式：先初始化
 * @author caiqing
 * @Date 2016-5-23 下午5:23:55
 */
public class Huangry {
	
	//1构造私有化函数
	private Huangry(){
		
	}
	
	//2初始化
	private  final static Huangry huangry = new Huangry();
	
	//3创建外部调用的方法 
	public static   Huangry getInstance(){
		return huangry;
	}
	//4定义测试内容
	public void say(){
		System.out.println("I am Huangry Single Pattern");
	}
}
