package 代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


/**@Projectname: DesignPattern
 * @Typename: DynamicProxy 动态代理之 代理类
 * @Description: TODO
 * @CreateDate:  2017-7-10 上午10:32:41
 * @LastModified: 2017-7-10 上午10:32:41
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class DynamicProxy implements InvocationHandler{

	private DynamicTargetSubject dynamicTargetSubject = null;
	
	/**
	 * @Methodname: invoke
	 * @Description: TODO
	 * @overridden: @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 * @param: @param proxy
	 * @param: @param method
	 * @param: @param args
	 * @param: @return
	 * @param: @throws Throwable   
	 * @throws:
	 * @CreateDate:  2017-7-10 上午10:33:24 by CQ
	 * @LastModified: 2017-7-10 上午10:33:24 by CQ
	 * @version: 1.0
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(dynamicTargetSubject == null){
			dynamicTargetSubject  = new DynamicTargetSubject();
		}
		method.invoke(dynamicTargetSubject, args);
		return dynamicTargetSubject;
	}

}
