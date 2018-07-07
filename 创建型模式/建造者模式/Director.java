package ������ģʽ;

import java.util.ArrayList;

/**
 * @Description ������ ����˳�� ��������ģ��
 * @author caiqing
 * @Date 2016-5-31 ����3:39:38
 */
public class Director {

	//����˳��
	private ArrayList<String> sequence =  new ArrayList<String>();

	//���� ���� ���� ������
	private BenzBuilder benzBuilder = new BenzBuilder();
	private BmwBuilder bmwBuilder = new BmwBuilder();
	

	/**
	 * @Description ����A�౼��ģ��
	 * @Date 2016-5-31 ����3:43:16
	 * @author caiqing
	 * @return
	 * @ReturnType BenzModel
	 */
	public BenzModel getABenzModel(){
		//������
		this.sequence.clear();
		//A�౼��ִ��˳��
		this.sequence.add("start");
		this.sequence.add("stop");
		//����˳�򷵻�һ������
		this.benzBuilder.setSequence(sequence);
		return (BenzModel) this.benzBuilder.getCarModel();
	}
	
	/**
	 * @Description ����B�౼��
	 * @Date 2016-5-31 ����3:51:48
	 * @author caiqing
	 * @return
	 * @ReturnType BenzModel
	 */
	public BenzModel getBBenzModel(){
		//������
		this.sequence.clear();
		//A�౼��ִ��˳��
		this.sequence.add("start");
		this.sequence.add("alarm");
		this.sequence.add("stop");
		//����˳�򷵻�һ������
		this.benzBuilder.setSequence(sequence);
		return (BenzModel) this.benzBuilder.getCarModel();
	}
	
	/**
	 * @Description ����C�౦��ģ��
	 * @Date 2016-5-31 ����3:43:16
	 * @author caiqing
	 * @return
	 * @ReturnType BenzModel
	 */
	public BmwModel getCBmwModel(){
		//������
		this.sequence.clear();
		//C�౦��ִ��˳��
		this.sequence.add("start");
		this.sequence.add("stop");
		//����˳�򷵻�һ������
		this.bmwBuilder.setSequence(sequence);
		return (BmwModel) this.bmwBuilder.getCarModel();
	}
	
	/**
	 * @Description ����D�౦��
	 * @Date 2016-5-31 ����3:51:48
	 * @author caiqing
	 * @return
	 * @ReturnType BenzModel
	 */
	public BmwModel getDBmwModel(){
		//������
		this.sequence.clear();
		//D�౦��ִ��˳��
		this.sequence.add("start");
		this.sequence.add("alarm");
		this.sequence.add("stop");
		//����˳�򷵻�һ������
		this.bmwBuilder.setSequence(sequence);
		return (BmwModel) this.bmwBuilder.getCarModel();
	}
}
