package �Ž�ģʽ.��ζ;



/**@Projectname: DesignPattern
 * @Typename: Beef 
 * @Description: TODO
 * @CreateDate:  2017-7-12 ����9:29:00
 * @LastModified: 2017-7-12 ����9:29:00
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class Beef extends PepperyBrige{

	/**@Description: TODO
	 * @Param: @param perpery   
	 * @CreateDate:  2017-7-12 ����9:29:13 by CQ
	 * @LastModified: 2017-7-12 ����9:29:13 by CQ
	 * @version: 1.0
	 */
	public Beef(Perpery perpery) {
		super(perpery);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Methodname: eat
	 * @Description: TODO
	 * @overridden: @see �Ž�ģʽ.PepperyBrige#eat()
	 * @param:    
	 * @throws:
	 * @CreateDate:  2017-7-12 ����9:29:19 by CQ
	 * @LastModified: 2017-7-12 ����9:29:19 by CQ
	 * @version: 1.0
	 */
	@Override
	public void eat() {
		System.out.println("����һ����ζ��ţ��������"
		           + super.perpery.style());
		
	}

}
