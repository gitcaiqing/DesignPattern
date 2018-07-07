package 外观_门面_模式;

public class LetterProcessImpl implements LetterProcess{

	@Override
	public void writeContext(String context) {
		System.out.println("写信");
		
	}

	@Override
	public void fillEnvelope(String address) {
		System.out.println("填写信封");
		
	}

//	public void checkLetter() {
//		System.out.println("检查信件");
//		
//	}

	@Override
	public void letterInotoEnvelope() {
		System.out.println("信件放入信封");
		
	}

	@Override
	public void setdLetter() {
		System.out.println("邮递信件");
		
	}

}
