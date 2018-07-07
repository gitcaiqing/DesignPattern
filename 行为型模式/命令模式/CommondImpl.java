package 命令模式;


/**@Projectname: DesignPattern
 * @Typename: CommondImpl 
 * @Description: TODO
 * @CreateDate:  2017-7-19 下午2:58:51
 * @LastModified: 2017-7-19 下午2:58:51
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class CommondImpl implements Commond{

	/**
	 * @Methodname: process
	 * @Description: TODO
	 * @overridden: @see 命令模式.Commond#process(int[])
	 * @param: @param target   
	 * @throws:
	 * @CreateDate:  2017-7-19 下午2:58:59 by CQ
	 * @LastModified: 2017-7-19 下午2:58:59 by CQ
	 * @version: 1.0
	 */
	@Override
	public void process(int[] target) {
		// TODO Auto-generated method stub
		System.out.println("target impl:"+target);
	}

}
