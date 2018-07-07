package 桥接模式.口味;



/**@Projectname: DesignPattern
 * @Typename: TestBrige 
 * @Description: TODO
 * @CreateDate:  2017-7-12 上午9:29:45
 * @LastModified: 2017-7-12 上午9:29:45
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class TestBrige {

	public static void main(String[] args) {
		PepperyBrige pepperyBrige = new Beef(new PepperyStyle());
		pepperyBrige.eat();
	}
}
