package 代理模式;


/**@Projectname: DesignPattern
 * @Typename: DynamicTargetSubject 动态代理之目标对象（被代理）
 * @Description: TODO
 * @CreateDate:  2017-7-10 上午10:31:10
 * @LastModified: 2017-7-10 上午10:31:10
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class DynamicTargetSubject implements DynamicSubject{

	/**
	 * @Methodname: sayHello
	 * @Description: TODO
	 * @overridden: @see 代理模式.DynamicSubject#sayHello()
	 * @param:    
	 * @throws:
	 * @CreateDate:  2017-7-10 上午10:31:38 by CQ
	 * @LastModified: 2017-7-10 上午10:31:38 by CQ
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
	 * @overridden: @see 代理模式.DynamicSubject#sayGoodBye()
	 * @param:    
	 * @throws:
	 * @CreateDate:  2017-7-10 上午10:31:38 by CQ
	 * @LastModified: 2017-7-10 上午10:31:38 by CQ
	 * @version: 1.0
	 */
	@Override
	public void sayGoodBye() {
		// TODO Auto-generated method stub
		System.out.println("goodbye............");
	}

}
