package ����ģʽ;

/**
 * @Description ����̫�������˶������ϣ���Ƥ���о��飬����Ϊһ��Ů�˵Ĵ���
 * @author caiqing
 * @Date 2016-5-16 ����6:02:48
 */
public class Wangpo implements KindWomen{

	public KindWomen kindWomen;
	
	//Ĭ����ʵ�˽���Panjinlian�Ĵ���
	public Wangpo(){
		this.kindWomen = new PanJinLian();
	}
	
	//��������һ��Ů�˵Ĵ���
	public Wangpo(KindWomen kindWomen){
		this.kindWomen = kindWomen;
	}
	
	@Override
	public void makeEyesWithMan() {
		// �Լ����˸ɲ��� �ӻ� �� �������
		this.kindWomen.makeEyesWithMan();
	}

	@Override
	public void makeHappyWithMan() {
		// �Լ����˸ɲ��� �ӻ� �� �������
		this.kindWomen.makeHappyWithMan();
	}

	
}
