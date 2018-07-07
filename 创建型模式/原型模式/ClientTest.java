package 原型模式;

public class ClientTest {
	public static void main(String[] args) {
		Property pro = new ConcreteProperty("property");
		Property pro2 = (Property) pro.clone();
		System.out.println("pro:"+pro.getName());
		System.out.println("pro2:"+pro2.getName());
	}
}
