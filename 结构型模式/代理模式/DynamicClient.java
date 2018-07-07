package 代理模式;

import java.lang.reflect.Proxy;

/**@Projectname: DesignPattern
 * @Typename: DynamicClient 
 * @Description: TODO
 * @CreateDate:  2017-7-10 上午10:36:37
 * @LastModified: 2017-7-10 上午10:36:37
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class DynamicClient {

	public static void main(String[] args) {
		//3个参数 分别表示类加载器， 一个希望该代理类实现的接口列表， 以及实现InvokeHandler接口的实例。 
		DynamicSubject subject = (DynamicSubject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
				DynamicTargetSubject.class.getInterfaces(), new DynamicProxy());
		subject.sayHello();
		subject.sayGoodBye();
	}
}
