package �۲���ģʽ;


/**@Projectname: DesignPattern
 * @Typename: Test 
 * @Description: TODO
 * @CreateDate:  2017-7-12 ����4:12:50
 * @LastModified: 2017-7-12 ����4:12:50
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class Test {
	public static void main(String[] args) {
		//�������۲��߶���
		SubProduct sp = new SubProduct("���ӻ�", 1);
		//�������ƹ۲���
		ObName obName = new ObName();
		//ע��۲���
		sp.registerObserver(obName);
		//���۲��߶����������
		sp.setName("����");
	}
}
