package 模板方法模式;

public class ClientTest {
	public static void main(String[] args) {
		HanmaModel hanma1Model = new Hanma1Model();
		hanma1Model.run();
		
		HanmaModel hanma2Model = new Hanma2Model();
		hanma2Model.run();
	}
}
