package ��������;


/**@Projectname: DesignPattern
 * @Typename: Test 
 * @Description: TODO
 * @CreateDate:  2017-7-13 ����4:49:20
 * @LastModified: 2017-7-13 ����4:49:20
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class Test {
	
	public static void main(String[] args) {
		//�򵥹�����ʽ
		Leifeng studentLeifengA = SimpleFactory.createLeifeng("��ѧ��");
		studentLeifengA.Sweep();
		Leifeng studentLeifengB = SimpleFactory.createLeifeng("��ѧ��");
		studentLeifengB.BuyRice();
		
		System.out.println("-------------------------------------");
		
		//��������ģʽ
		LeifengFactory leifengFactory = new LeifengStudentFactory();
		Leifeng leifengA = leifengFactory.createLeifeng();
		Leifeng leifengB= leifengFactory.createLeifeng();
		leifengA.Sweep();
		leifengB.BuyRice();
	}

}
