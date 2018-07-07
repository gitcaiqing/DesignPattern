package 简单工厂;


/**@Projectname: DesignPattern
 * @Typename: OpAdd 
 * @Description: TODO
 * @CreateDate:  2017-7-13 下午2:41:42
 * @LastModified: 2017-7-13 下午2:41:42
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class OpAdd extends Operator{
	@Override
	public double getResult() {
		return NumA + NumB;
	}
}
