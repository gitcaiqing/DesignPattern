package 工厂方法;


/**@Projectname: DesignPattern
 * @Typename: Test 
 * @Description: TODO
 * @CreateDate:  2017-7-13 下午4:49:20
 * @LastModified: 2017-7-13 下午4:49:20
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class Test {
	
	public static void main(String[] args) {
		//简单工厂方式
		Leifeng studentLeifengA = SimpleFactory.createLeifeng("大学生");
		studentLeifengA.Sweep();
		Leifeng studentLeifengB = SimpleFactory.createLeifeng("大学生");
		studentLeifengB.BuyRice();
		
		System.out.println("-------------------------------------");
		
		//工厂方法模式
		LeifengFactory leifengFactory = new LeifengStudentFactory();
		Leifeng leifengA = leifengFactory.createLeifeng();
		Leifeng leifengB= leifengFactory.createLeifeng();
		leifengA.Sweep();
		leifengB.BuyRice();
	}

}
