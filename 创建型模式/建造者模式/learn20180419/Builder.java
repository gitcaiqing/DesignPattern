package ������ģʽ.learn20180419;

public abstract class Builder {
	
	//��һ����װCPU
	//����Ϊ���󷽷�������������ʵ�� 
	public abstract void  BuildCPU();

	//�ڶ�����װ����
	//����Ϊ���󷽷�������������ʵ�� 
	 public abstract void BuildMainboard();

	//��������װӲ��
	//����Ϊ���󷽷�������������ʵ�� 
	public abstract void BuildHD();
	
	//���Ĳ�...������������

	//���ز�Ʒ�ķ����������װ�õĵ���
	public abstract ProductComputer generatorProduct();

}
