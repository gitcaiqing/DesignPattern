package 桥接模式;


/**@Projectname: DesignPattern
 * @Typename: Street 
 * @Description: TODO
 * @CreateDate:  2017-7-12 上午11:05:10
 * @LastModified: 2017-7-12 上午11:05:10
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class Street extends AbstractRoadBrige{

	/**@Description: TODO
	 * @Param: @param abstractCar   
	 * @CreateDate:  2017-7-12 上午11:05:28 by CQ
	 * @LastModified: 2017-7-12 上午11:05:28 by CQ
	 * @version: 1.0
	 */
	public Street(AbstractCar abstractCar) {
		super(abstractCar);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Methodname: roadrun
	 * @Description: TODO
	 * @overridden: @see 桥接模式.AbstractRoadBrige#roadrun()
	 * @param:    
	 * @throws:
	 * @CreateDate:  2017-7-12 上午11:05:34 by CQ
	 * @LastModified: 2017-7-12 上午11:05:34 by CQ
	 * @version: 1.0
	 */
	@Override
	String roadrun() {
		// TODO Auto-generated method stub
		return super.abstractCar.carrun() + "街道上";
	}
	
	

}
