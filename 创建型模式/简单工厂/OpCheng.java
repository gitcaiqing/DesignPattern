package �򵥹���;


/**@Projectname: DesignPattern
 * @Typename: OpCheng 
 * @Description: TODO
 * @CreateDate:  2017-7-13 ����2:42:04
 * @LastModified: 2017-7-13 ����2:42:04
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class OpCheng extends Operator{

	/**
	 * @Methodname: getResult
	 * @Description: TODO
	 * @overridden: @see �򵥹���.Operator#getResult()
	 * @param:    
	 * @throws:
	 * @CreateDate:  2017-7-13 ����2:42:18 by CQ
	 * @LastModified: 2017-7-13 ����2:42:18 by CQ
	 * @version: 1.0
	 */
	@Override
	public double getResult() {
		return NumA * NumB;
	}

}
