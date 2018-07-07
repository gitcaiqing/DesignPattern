package 桥接模式;


/**@Projectname: DesignPattern
 * @Typename: Car 
 * @Description: TODO
 * @CreateDate:  2017-7-12 上午10:58:39
 * @LastModified: 2017-7-12 上午10:58:39
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class Car extends AbstractCar{

	/**
	 * @Methodname: run
	 * @Description: TODO
	 * @overridden: @see 桥接模式.AbstractCar#run()
	 * @param:    
	 * @throws:
	 * @CreateDate:  2017-7-12 上午10:59:13 by CQ
	 * @LastModified: 2017-7-12 上午10:59:13 by CQ
	 * @version: 1.0
	 */
	@Override
	String carrun() {
		// TODO Auto-generated method stub
		return "小汽车行驶";
	}

}
