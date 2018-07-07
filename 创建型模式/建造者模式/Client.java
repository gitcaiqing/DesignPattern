package ������ģʽ;

import java.util.ArrayList;

/**
 * @Description �ͻ������Զ����������� ͣ�� ������ ���������� ��ִ��˳��
 * @author caiqing
 * @Date 2016-5-31 ����9:17:00
 */
public class Client {
	public static void main(String[] args) {
		
		System.out.println("---------ֱ�ӷ����� ��---------");
		//��������ģ�Ͷ���
		BenzModel benz = new BenzModel();
		//����ִ��˳��
		ArrayList<String> sequenceBenz = new ArrayList<String>();
		sequenceBenz.add("start");
		sequenceBenz.add("engineBoom");
		sequenceBenz.add("alarm");
		sequenceBenz.add("stop");
		benz.setSequence(sequenceBenz);
		benz.run();
		
		//��������ģ�Ͷ���
		BmwModel bmw = new BmwModel();
		//����ִ��˳��
		ArrayList<String> sequenceBmw = new ArrayList<String>();
		sequenceBmw.add("start");
		sequenceBmw.add("engineBoom");
		sequenceBmw.add("alarm");
		sequenceBmw.add("stop");
		bmw.setSequence(sequenceBmw);
		bmw.run();
		//���Ϸ�ʽ����������ģ�ͷ���ִ��˳��ʱ��Ϊ�鷳
		System.out.println("---------builder method ��---------");
		
		ArrayList<String> sequenceBuilder = new ArrayList<String>();
		sequenceBuilder.add("start");
		sequenceBuilder.add("alarm");
		sequenceBuilder.add("engineBoom");
		sequenceBuilder.add("stop");
		
		BenzBuilder benzBuilder = new BenzBuilder();
		benzBuilder.setSequence(sequenceBuilder);
		BenzModel benzB =  (BenzModel) benzBuilder.getCarModel();
		benzB.run();
		
		//����һ����ͬ�ı���
		BmwBuilder bmwBuilder = new BmwBuilder();
		bmwBuilder.setSequence(sequenceBuilder);
		BmwModel bmwB = (BmwModel) bmwBuilder.getCarModel();
		bmwB.run();
		
		System.out.println("---------������ ���� ����ģ�� ˳�� ��---------");
		//�ͻ��뵼���෢����ϵ ����
		Director director = new Director();
		for(int i=1; i<6; i++){
			System.out.println("-A����-"+i+"��");
			director.getABenzModel().run();
		}
		
		for(int i=1; i<11; i++){
			System.out.println("-B����-"+i+"��");
			director.getBBenzModel().run();
		}
		
		for(int i=1; i<6; i++){
			System.out.println("-C����-"+i+"��");
			director.getCBmwModel().run();
		}
	}
}	
