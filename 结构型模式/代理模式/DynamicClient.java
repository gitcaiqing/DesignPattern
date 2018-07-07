package ����ģʽ;

import java.lang.reflect.Proxy;

/**@Projectname: DesignPattern
 * @Typename: DynamicClient 
 * @Description: TODO
 * @CreateDate:  2017-7-10 ����10:36:37
 * @LastModified: 2017-7-10 ����10:36:37
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class DynamicClient {

	public static void main(String[] args) {
		//3������ �ֱ��ʾ��������� һ��ϣ���ô�����ʵ�ֵĽӿ��б� �Լ�ʵ��InvokeHandler�ӿڵ�ʵ���� 
		DynamicSubject subject = (DynamicSubject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
				DynamicTargetSubject.class.getInterfaces(), new DynamicProxy());
		subject.sayHello();
		subject.sayGoodBye();
	}
}
