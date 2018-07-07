package 工厂方法;


/**@Projectname: DesignPattern
 * @Typename: LeifengFactory 
 * @Description: 抽象类
 * @CreateDate:  2017-7-13 下午4:29:50
 * @LastModified: 2017-7-13 下午4:29:50
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public abstract class Leifeng {

	public void Sweep(){
		System.out.println("扫地");
	}
	
	public void Wash(){
		System.out.println("洗衣");
	}
	
	public void BuyRice(){
		System.out.println("买米");
	}
}
