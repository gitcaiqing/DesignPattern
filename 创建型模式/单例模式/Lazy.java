package 单例模式;
/**
 * @Description 懒汉式：加载时初始化
 * @author caiqing
 * @Date 2016-5-23 下午5:24:21
 */
public class Lazy {
	//1.定义私有化构造函数
	private Lazy(){
		
	}
	
	private static Lazy lazy = null;
	
	//2.加载
	public static synchronized Lazy getInstance(){
		if(lazy == null){
			synchronized (Lazy.class) {
				//3.加载时初始化
				lazy = new Lazy();
			}
		}
		return lazy;
	}
	
	//4.定义测试内容
	public void say(){
		System.out.println("I am Lazy Single Pattern");
	}
}
