package ���_����_ģʽ;

public class LetterProcessImpl implements LetterProcess{

	@Override
	public void writeContext(String context) {
		System.out.println("д��");
		
	}

	@Override
	public void fillEnvelope(String address) {
		System.out.println("��д�ŷ�");
		
	}

//	public void checkLetter() {
//		System.out.println("����ż�");
//		
//	}

	@Override
	public void letterInotoEnvelope() {
		System.out.println("�ż������ŷ�");
		
	}

	@Override
	public void setdLetter() {
		System.out.println("�ʵ��ż�");
		
	}

}
