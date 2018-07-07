package 观察者模式;


/**@Projectname: DesignPattern
 * @Typename: Test 
 * @Description: TODO
 * @CreateDate:  2017-7-12 下午4:12:50
 * @LastModified: 2017-7-12 下午4:12:50
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class Test {
	public static void main(String[] args) {
		//创建被观察者对象
		SubProduct sp = new SubProduct("电视机", 1);
		//创建名称观察者
		ObName obName = new ObName();
		//注册观察者
		sp.registerObserver(obName);
		//被观察者对象更新名称
		sp.setName("冰箱");
	}
}
