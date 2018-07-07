package ������ģʽ;

import java.util.ArrayList;

public abstract class CarBuilder {
	
	/**
	 * @Description ����˳��
	 * @Date 2016-5-31 ����3:27:30
	 * @author caiqing
	 * @param sequence
	 * @ReturnType void
	 */
	protected abstract void setSequence(ArrayList<String> sequence);
	
	/**
	 * @Description ��ȡ����ģ�� ����
	 * @Date 2016-5-31 ����3:27:14
	 * @author caiqing
	 * @return
	 * @ReturnType CarModel
	 */
	protected abstract CarModel getCarModel();

	
}
