package 简单工厂;

import java.io.Console;
import java.io.IOException;


/**@Projectname: DesignPattern
 * @Typename: Console 
 * @Description: TODO
 * @CreateDate:  2017-7-13 下午2:53:11
 * @LastModified: 2017-7-13 下午2:53:11
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class ConsoleOp {
	
	public double getConsoleOp(){
		String optype = "/";
		Operator operator = OpFactory.getOp(optype);
		operator.NumA = 1;
		operator.NumB = 7;
		return operator.getResult();
	}
	
	public static void main(String[] args) {
		ConsoleOp consoleOp = new ConsoleOp();
		System.out.println(consoleOp.getConsoleOp());
	}
}
