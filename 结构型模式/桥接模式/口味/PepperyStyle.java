package 桥接模式.口味;


/**@Projectname: DesignPattern
 * @Typename: Peppery 
 * @Description: 淡口味
 * @CreateDate:  2017-7-12 上午9:01:44
 * @LastModified: 2017-7-12 上午9:01:44
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class PepperyStyle implements Perpery{

	/**
	 * @Methodname: style
	 * @Description: TODO
	 * @overridden: @see 桥接模式.Perpery#style()
	 * @param: @return   
	 * @throws:
	 * @CreateDate:  2017-7-12 上午9:02:51 by CQ
	 * @LastModified: 2017-7-12 上午9:02:51 by CQ
	 * @version: 1.0
	 */
	@Override
	public String style() {
		
		return "辣味淡";
	}

}
