package ����ģʽ;
/**
 * @Description һ���е� ������
 * @author caiqing
 * @Date 2016-5-16 ����6:08:41
 */
public class XiMenQing {
	
	public static void main(String[] args) {

		//�������˽���,�˽���������˼��ͨ�����Ŵ���
		Wangpo wangpo = new Wangpo();
		//������ �� �˽���happy ͨ�����Ŵ��� 
		wangpo.makeEyesWithMan();
		wangpo.makeHappyWithMan();
		
		System.out.println("-------------");
		
		//������ �� �˽���2��happy Ҳͨ�����Ŵ���
		wangpo = new Wangpo(new PanJinLian2());
		wangpo.makeEyesWithMan();
		wangpo.makeHappyWithMan();
	}
}
