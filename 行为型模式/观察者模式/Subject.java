package 观察者模式;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**@Projectname: DesignPattern
 * @Typename: Subject 
 * @Description: 主题接口：主题是一个接口，该接口规定了具体主题需要实现的方法，
 * 比如添加、删除观察者以及通知观察者更新数据的方法。
 * @CreateDate:  2017-7-12 下午2:38:04
 * @LastModified: 2017-7-12 下午2:38:04
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public abstract class Subject {

	List<Observer> observers = new ArrayList<>();
	
	
	//注册
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	//移除
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	//通知所有注册了观察者
	public void notifyObserver(Object value){
		for(Iterator<Observer> it = observers.iterator(); it.hasNext();){
			Observer observer = it.next();
			observer.update(this, value);
		}
	}
}
