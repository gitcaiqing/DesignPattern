package 桥接模式;


/**@Projectname: DesignPattern
 * @Typename: men 
 * @Description: TODO
 * @CreateDate:  2017-7-12 上午11:22:17
 * @LastModified: 2017-7-12 上午11:22:17
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class man extends AbstractPeopleBrige{

	/**@Description: TODO
	 * @Param: @param abstractRoad   
	 * @CreateDate:  2017-7-12 上午11:23:50 by CQ
	 * @LastModified: 2017-7-12 上午11:23:50 by CQ
	 * @version: 1.0
	 */
	public man(AbstractRoadBrige abstractRoad) {
		super(abstractRoad);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Methodname: driver
	 * @Description: TODO
	 * @overridden: @see 桥接模式.AbstractPeople#driver()
	 * @param: @return   
	 * @throws:
	 * @CreateDate:  2017-7-12 上午11:24:08 by CQ
	 * @LastModified: 2017-7-12 上午11:24:08 by CQ
	 * @version: 1.0
	 */
	@Override
	String driver() {
		return "男人驾驶汽车"+super.abstractRoad.roadrun();
	}

}
