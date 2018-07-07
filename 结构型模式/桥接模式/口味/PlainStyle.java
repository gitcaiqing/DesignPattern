package 桥接模式.口味;


/**@Projectname: DesignPattern
 * @Typename: PlainStyle 
 * @Description: 重口味
 * @CreateDate:  2017-7-12 上午9:02:29
 * @LastModified: 2017-7-12 上午9:02:29
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class PlainStyle implements Perpery{

	/**
	 * @Methodname: style
	 * @Description: TODO
	 * @overridden: @see 桥接模式.Perpery#style()
	 * @param: @return   
	 * @throws:
	 * @CreateDate:  2017-7-12 上午9:03:02 by CQ
	 * @LastModified: 2017-7-12 上午9:03:02 by CQ
	 * @version: 1.0
	 */
	@Override
	public String style() {
		// TODO Auto-generated method stub
		return "辣味重";
	}

}
