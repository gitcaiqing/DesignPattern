package �Ž�ģʽ;


/**@Projectname: DesignPattern
 * @Typename: Test 
 * @Description: TODO
 * @CreateDate:  2017-7-12 ����11:08:34
 * @LastModified: 2017-7-12 ����11:08:34
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class Test {

	public static void main(String[] args) {
		
		//2��ά�ȵı仯
		
		//С������ʻ�ڽֵ���
		AbstractRoadBrige roadBrige = new Street(new Car());
		System.out.println(roadBrige.roadrun());
		//С������ʻ�ڸ��ٹ�·��
		AbstractRoadBrige roadBrige2 = new SpeedWay(new Car());
		System.out.println(roadBrige2.roadrun());
		//��������ʻ�ڽֵ���
		AbstractRoadBrige roadBrige3 = new Street(new BusCar());
		System.out.println(roadBrige3.roadrun());
		//��������ʻ�ڸ��ٹ�·��
		AbstractRoadBrige roadBrige4 = new SpeedWay(new BusCar());
		System.out.println(roadBrige4.roadrun());
		
		System.out.println("-------------------------------");
		//3��ά�ȵı仯
		//���˼�ʻС������ʻ�ڽֵ���
		AbstractPeopleBrige peopleBrige = new man(new Street(new Car()));
		System.out.println(peopleBrige.driver());
		
	}
}
