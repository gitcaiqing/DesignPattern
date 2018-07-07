package 桥接模式.口味;


/**@Projectname: DesignPattern
 * @Typename: Porky 
 * @Description: TODO
 * @CreateDate:  2017-7-12 上午9:23:53
 * @LastModified: 2017-7-12 上午9:23:53
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class Porky extends PepperyBrige{

	/**@Description: TODO
	 * @Param: @param perpery   
	 * @CreateDate:  2017-7-12 上午9:24:09 by CQ
	 * @LastModified: 2017-7-12 上午9:24:09 by CQ
	 * @version: 1.0
	 */
	public Porky(Perpery perpery) {
		super(perpery);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Methodname: eat
	 * @Description: TODO
	 * @overridden: @see 桥接模式.PepperyBrige#eat()
	 * @param:    
	 * @throws:
	 * @CreateDate:  2017-7-12 上午9:24:33 by CQ
	 * @LastModified: 2017-7-12 上午9:24:33 by CQ
	 * @version: 1.0
	 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		 System.out.println("这是一碗稍嫌油腻的猪肉面条。"+ super.perpery.style() );
	}

}
