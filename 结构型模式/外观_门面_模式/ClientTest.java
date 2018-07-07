package 外观_门面_模式;

public class ClientTest {
	public static void main(String[] args) {
		ModenPostOffice modenPostOffice = new ModenPostOffice();
		String context = "I LOVE YOU";
		String address = "CHINA SUZHOU";
		modenPostOffice.sendLetterFace(context, address);
	}
}
