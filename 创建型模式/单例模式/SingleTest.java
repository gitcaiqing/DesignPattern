package 单例模式;


public class SingleTest{

	
	public static void main(String[] args) {
		
		//饿汉式测试
		Huangry huangry = Huangry.getInstance();
		System.out.println(huangry);
		huangry.say();
		
		Huangry huangry2 = Huangry.getInstance();
		System.out.println(huangry2 == huangry);
		huangry2.say();
		
		Huangry huangry3 = Huangry.getInstance();
		System.out.println(huangry3);
		huangry3.say();
		
		//懒汉式测试
		Lazy lazy = Lazy.getInstance();
		lazy.say();
		
		Lazy lazy2 = Lazy.getInstance();
		lazy2.say();
		
		Lazy lazy3 = Lazy.getInstance();
		lazy3.say();
		
	}
	
	
	
}
