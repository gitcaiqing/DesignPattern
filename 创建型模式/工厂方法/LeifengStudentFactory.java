package ��������;


/**@Projectname: DesignPattern
 * @Typename: LeifengStudentFactory 
 * @Description: TODO
 * @CreateDate:  2017-7-13 ����4:55:45
 * @LastModified: 2017-7-13 ����4:55:45
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class LeifengStudentFactory implements LeifengFactory{

	/**
	 * @Methodname: createLeifeng
	 * @Description: TODO
	 * @overridden: @see ��������.LeifengFactory#createLeifeng()
	 * @param: @return   
	 * @throws:
	 * @CreateDate:  2017-7-13 ����4:56:50 by CQ
	 * @LastModified: 2017-7-13 ����4:56:50 by CQ
	 * @version: 1.0
	 */
	@Override
	public Leifeng createLeifeng() {
		return new Student();
	}

	
}
