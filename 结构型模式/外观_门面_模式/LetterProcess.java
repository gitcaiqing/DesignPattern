package ���_����_ģʽ;

/**
 * @Description ����һ��д�ŵĹ���
 * @author caiqing
 * @Date 2016-6-7 ����2:33:09
 */
public interface LetterProcess {
	/**
	 * @Description д��
	 * @Date 2016-6-7 ����2:33:31
	 * @author caiqing
	 * @ReturnType void
	 */
	public void writeContext(String context);
	/**
	 * @Description ��д�ŷ�
	 * @Date 2016-6-7 ����2:36:04
	 * @author caiqing
	 * @param address
	 * @ReturnType void
	 */
	public void fillEnvelope(String address);
	/**
	 * @Description �ż����
	 * @Date 2016-6-7 ����2:36:07
	 * @author caiqing
	 * @ReturnType void
	 */
	//public void checkLetter();
	/**
	 * @Description �ż����ŷ�
	 * @Date 2016-6-7 ����2:36:10
	 * @author caiqing
	 * @ReturnType void
	 */
	public void letterInotoEnvelope();
	/**
	 * @Description �ż��ʵ�
	 * @Date 2016-6-7 ����2:36:13
	 * @author caiqing
	 * @ReturnType void
	 */
	public void setdLetter();
}
