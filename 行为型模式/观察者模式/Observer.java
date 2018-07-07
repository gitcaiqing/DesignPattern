package 观察者模式;


/**@Projectname: DesignPattern
 * @Typename: Observer 
 * @Description: 观察者 ：观察者也是一个接口，该接口规定了具体观察者用来更新数据的方法
 * @CreateDate:  2017-7-12 下午2:37:36
 * @LastModified: 2017-7-12 下午2:37:36
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public interface Observer {
	//定义更新数据的方法
	void update(Subject subject, Object args);
}
