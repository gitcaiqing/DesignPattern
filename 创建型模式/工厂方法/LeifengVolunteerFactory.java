package 工厂方法;


/**@Projectname: DesignPattern
 * @Typename: LeifengVolunteerFactory 
 * @Description: TODO
 * @CreateDate:  2017-7-13 下午4:56:01
 * @LastModified: 2017-7-13 下午4:56:01
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class LeifengVolunteerFactory implements LeifengFactory{

	/**
	 * @Methodname: createLeifeng
	 * @Description: TODO
	 * @overridden: @see 工厂方法.LeifengFactory#createLeifeng()
	 * @param: @return   
	 * @throws:
	 * @CreateDate:  2017-7-13 下午4:56:16 by CQ
	 * @LastModified: 2017-7-13 下午4:56:16 by CQ
	 * @version: 1.0
	 */
	@Override
	public Leifeng createLeifeng() {
		
		return new Volunteer();
	}

	
}
