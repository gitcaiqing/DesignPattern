package 桥接模式;


/**@Projectname: DesignPattern
 * @Typename: woman 
 * @Description: TODO
 * @CreateDate:  2017-7-12 上午11:24:37
 * @LastModified: 2017-7-12 上午11:24:37
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class woman extends AbstractPeopleBrige{

	/**@Description: TODO
	 * @Param: @param abstractRoad   
	 * @CreateDate:  2017-7-12 上午11:24:50 by CQ
	 * @LastModified: 2017-7-12 上午11:24:50 by CQ
	 * @version: 1.0
	 */
	public woman(AbstractRoadBrige abstractRoad) {
		super(abstractRoad);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Methodname: driver
	 * @Description: TODO
	 * @overridden: @see 桥接模式.AbstractPeople#driver()
	 * @param: @return   
	 * @throws:
	 * @CreateDate:  2017-7-12 上午11:24:53 by CQ
	 * @LastModified: 2017-7-12 上午11:24:53 by CQ
	 * @version: 1.0
	 */
	@Override
	String driver() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
