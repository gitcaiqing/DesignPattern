package �۲���ģʽ;

import javax.swing.JFrame;
import javax.swing.JLabel;


/**@Projectname: DesignPattern
 * @Typename: ObName 
 * @Description: ����۲��ߣ�����۲�����ʵ���˹۲��߽ӿڵ�һ���ࡣ����۲��߰����п��Դ�ž����������õ�����ӿڱ������Ա����۲����þ������⽫�Լ���������ӵ���������ļ����У����Լ���Ϊ���Ĺ۲��ߣ�����������������⽫�Լ��Ӿ�������ļ�����ɾ����ʹ�Լ�����ʱ���Ĺ۲��ߡ�
 * @CreateDate:  2017-7-12 ����4:00:31
 * @LastModified: 2017-7-12 ����4:00:31
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class ObName implements Observer{

	/**
	 * @Methodname: update
	 * @Description: TODO
	 * @overridden: @see �۲���ģʽ.Observer#update(�۲���ģʽ.Subject, java.lang.Object)
	 * @param: @param subject
	 * @param: @param args   
	 * @throws:
	 * @CreateDate:  2017-7-12 ����4:09:23 by CQ
	 * @LastModified: 2017-7-12 ����4:09:23 by CQ
	 * @version: 1.0
	 */
	@Override
	public void update(Subject subject, Object args) {
		if(args instanceof String){
			String name = (String) args;
			/*JFrame jf = new JFrame("�۲��ߴ���");
			JLabel jl = new JLabel("���Ƹ���Ϊ��"+name);
			jf.add(jl);
			jf.pack();
			jf.setVisible(true);*/
			System.out.println("���ƹ۲��ߣ�"+subject+"���Ƹ���Ϊ��"+name);
		}
		
	}
	
}
