package ������ģʽ;
/**
 * @Description ��������ģ��
 * @author caiqing
 * @Date 2016-5-31 ����9:11:23
 */
public class BenzModel extends CarModel{

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("����ͣ��");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("����������");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("���������¡¡");
	}

}
