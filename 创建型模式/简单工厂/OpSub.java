package 简单工厂;


/**@Projectname: DesignPattern
 * @Typename: OpSub 
 * @Description: TODO
 * @CreateDate:  2017-7-13 下午2:41:54
 * @LastModified: 2017-7-13 下午2:41:54
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class OpSub extends Operator{
	@Override
	public double getResult() {
		return NumA - NumB;
	}
}
