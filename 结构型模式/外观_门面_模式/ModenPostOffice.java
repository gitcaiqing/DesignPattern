package ���_����_ģʽ;

/**
 * @Description ��д�ŵ�5���������з�װ
 * @author caiqing
 * @Date 2016-6-7 ����2:45:34
 */
public class ModenPostOffice {
	
	LetterProcess letterProcess = new LetterProcessImpl();
	
	Police police = new Police();
	
	/**
	 * @Description ��װ�����淽��
	 * @Date 2016-6-7 ����2:48:02
	 * @author caiqing
	 * @param context
	 * @param address
	 * @ReturnType void
	 */
	public void sendLetterFace(String context,String address){
		//д��
		letterProcess.writeContext(context);
		//��д�ŷ�
		letterProcess.fillEnvelope(address);
		//����ż�
		police.checkLetter(letterProcess);
		//�ż������ŷ�
		letterProcess.letterInotoEnvelope();
		//�ʵ��ż�
		letterProcess.setdLetter();
	}
}
