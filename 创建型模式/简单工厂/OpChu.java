package �򵥹���;


/**@Projectname: DesignPattern
 * @Typename: OpChu 
 * @Description: TODO
 * @CreateDate:  2017-7-13 ����2:47:56
 * @LastModified: 2017-7-13 ����2:47:56
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class OpChu extends Operator{

	public double getResult(){
		if(NumB == 0){
			throw new RuntimeException("��������Ϊ0");
		}
		return NumA / NumB;
	}
}
