package �Ž�ģʽ;


/**@Projectname: DesignPattern
 * @Typename: SpeedWay 
 * @Description: TODO
 * @CreateDate:  2017-7-12 ����11:10:15
 * @LastModified: 2017-7-12 ����11:10:15
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class SpeedWay extends AbstractRoadBrige{

	/**@Description: TODO
	 * @Param: @param abstractCar   
	 * @CreateDate:  2017-7-12 ����11:10:38 by CQ
	 * @LastModified: 2017-7-12 ����11:10:38 by CQ
	 * @version: 1.0
	 */
	public SpeedWay(AbstractCar abstractCar) {
		super(abstractCar);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Methodname: roadrun
	 * @Description: TODO
	 * @overridden: @see �Ž�ģʽ.AbstractRoadBrige#roadrun()
	 * @param:    
	 * @throws:
	 * @CreateDate:  2017-7-12 ����11:10:41 by CQ
	 * @LastModified: 2017-7-12 ����11:10:41 by CQ
	 * @version: 1.0
	 */
	@Override
	String roadrun() {
		// TODO Auto-generated method stub
		return super.abstractCar.carrun()+"���ٹ�·��";
	}

	
}
