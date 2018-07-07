package �۲���ģʽ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**@Projectname: DesignPattern
 * @Typename: Subject 
 * @Description: ����ӿڣ�������һ���ӿڣ��ýӿڹ涨�˾���������Ҫʵ�ֵķ�����
 * ������ӡ�ɾ���۲����Լ�֪ͨ�۲��߸������ݵķ�����
 * @CreateDate:  2017-7-12 ����2:38:04
 * @LastModified: 2017-7-12 ����2:38:04
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public abstract class Subject {

	List<Observer> observers = new ArrayList<>();
	
	
	//ע��
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	//�Ƴ�
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	//֪ͨ����ע���˹۲���
	public void notifyObserver(Object value){
		for(Iterator<Observer> it = observers.iterator(); it.hasNext();){
			Observer observer = it.next();
			observer.update(this, value);
		}
	}
}
