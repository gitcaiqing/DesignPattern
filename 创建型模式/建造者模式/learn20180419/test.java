package 建造者模式.learn20180419;

public class test {

	
	public static void main(String[] args) {
		Diretor diretor = new Diretor();
		ProductComputer productComputer = diretor.Construct(new BuilderA());
		System.out.println(productComputer);
		
		productComputer = diretor.Construct(new BuilderB());
		System.out.println(productComputer);
	}
}
