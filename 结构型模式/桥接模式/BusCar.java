package 桥接模式;


/**@Projectname: DesignPattern
 * @Typename: BusCar 
 * @Description: TODO
 * @CreateDate:  2017-7-12 上午10:58:17
 * @LastModified: 2017-7-12 上午10:58:17
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class BusCar extends AbstractCar{

	/**
	 * @Methodname: run
	 * @Description: TODO
	 * @overridden: @see 桥接模式.AbstractCar#run()
	 * @param:    
	 * @throws:
	 * @CreateDate:  2017-7-12 上午10:59:04 by CQ
	 * @LastModified: 2017-7-12 上午10:59:04 by CQ
	 * @version: 1.0
	 */
	@Override
	String carrun() {
		// TODO Auto-generated method stub
		return "公交车行驶";
	}

}
