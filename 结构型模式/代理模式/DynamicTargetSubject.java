package ����ģʽ;


/**@Projectname: DesignPattern
 * @Typename: DynamicTargetSubject ��̬����֮Ŀ����󣨱�����
 * @Description: TODO
 * @CreateDate:  2017-7-10 ����10:31:10
 * @LastModified: 2017-7-10 ����10:31:10
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class DynamicTargetSubject implements DynamicSubject{

	/**
	 * @Methodname: sayHello
	 * @Description: TODO
	 * @overridden: @see ����ģʽ.DynamicSubject#sayHello()
	 * @param:    
	 * @throws:
	 * @CreateDate:  2017-7-10 ����10:31:38 by CQ
	 * @LastModified: 2017-7-10 ����10:31:38 by CQ
	 * @version: 1.0
	 */
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("hello............");
	}

	/**
	 * @Methodname: sayGoodBye
	 * @Description: TODO
	 * @overridden: @see ����ģʽ.DynamicSubject#sayGoodBye()
	 * @param:    
	 * @throws:
	 * @CreateDate:  2017-7-10 ����10:31:38 by CQ
	 * @LastModified: 2017-7-10 ����10:31:38 by CQ
	 * @version: 1.0
	 */
	@Override
	public void sayGoodBye() {
		// TODO Auto-generated method stub
		System.out.println("goodbye............");
	}

}
