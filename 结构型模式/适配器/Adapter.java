package ÊÊÅäÆ÷;



/**@Projectname: DesignPattern
 * @Typename: Adapter 
 * @Description: TODO
 * @CreateDate:  2017-7-6 ÉÏÎç10:29:05
 * @LastModified: 2017-7-6 ÉÏÎç10:29:05
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class Adapter extends Adaptee implements Target{

	/**
	 * @Methodname: sampleOperation2
	 * @Description: TODO
	 * @overridden: @see ÊÊÅäÆ÷.Target#sampleOperation2()
	 * @param:    
	 * @throws:
	 * @CreateDate:  2017-7-6 ÉÏÎç10:32:07 by CQ
	 * @LastModified: 2017-7-6 ÉÏÎç10:32:07 by CQ
	 * @version: 1.0
	 */
	@Override
	public void sampleOperation2() {
		// TODO Auto-generated method stub
		System.out.println("Target sampleOperation2");
	}

}
