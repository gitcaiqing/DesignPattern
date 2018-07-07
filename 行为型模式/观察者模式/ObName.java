package 观察者模式;

import javax.swing.JFrame;
import javax.swing.JLabel;


/**@Projectname: DesignPattern
 * @Typename: ObName 
 * @Description: 具体观察者：具体观察者是实现了观察者接口的一个类。具体观察者包含有可以存放具体主题引用的主题接口变量，以便具体观察者让具体主题将自己的引用添加到具体主题的集合中，让自己成为它的观察者，或者让这个具体主题将自己从具体主题的集合中删除，使自己不在时它的观察者。
 * @CreateDate:  2017-7-12 下午4:00:31
 * @LastModified: 2017-7-12 下午4:00:31
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class ObName implements Observer{

	/**
	 * @Methodname: update
	 * @Description: TODO
	 * @overridden: @see 观察者模式.Observer#update(观察者模式.Subject, java.lang.Object)
	 * @param: @param subject
	 * @param: @param args   
	 * @throws:
	 * @CreateDate:  2017-7-12 下午4:09:23 by CQ
	 * @LastModified: 2017-7-12 下午4:09:23 by CQ
	 * @version: 1.0
	 */
	@Override
	public void update(Subject subject, Object args) {
		if(args instanceof String){
			String name = (String) args;
			/*JFrame jf = new JFrame("观察者窗口");
			JLabel jl = new JLabel("名称更改为："+name);
			jf.add(jl);
			jf.pack();
			jf.setVisible(true);*/
			System.out.println("名称观察者："+subject+"名称更改为："+name);
		}
		
	}
	
}
