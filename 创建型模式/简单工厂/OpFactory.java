package 简单工厂;


/**@Projectname: DesignPattern
 * @Typename: OpFactory 
 * @Description: TODO
 * @CreateDate:  2017-7-13 下午2:49:39
 * @LastModified: 2017-7-13 下午2:49:39
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class OpFactory {
	
	//根据运算类型 通过工厂类创建需要的运算对象
	public static Operator getOp(String optype){
		Operator operator = null;
		switch (optype) {
		case "+":
			operator = new OpAdd();
			break;
		case "-":
			operator = new OpSub();		
			break;
		case "*":
			operator = new OpCheng();
			break;
		case "/":
			operator = new OpChu();
			break;
		default:
			break;
		}
		return operator;
	}
}
