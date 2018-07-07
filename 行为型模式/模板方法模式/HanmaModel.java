package ģ�巽��ģʽ;
/**
 * @Description ���������
 * @author caiqing
 * @Date 2016-6-8 ����2:08:53
 */
public abstract class HanmaModel {
	/**
	 * @Description ����
	 * @Date 2016-6-8 ����2:09:42
	 * @author caiqing
	 * @ReturnType void
	 */
	protected abstract void start();
	/**
	 * @Description ���Ƚ�
	 * @Date 2016-6-8 ����2:09:42
	 * @author caiqing
	 * @ReturnType void
	 */
	protected abstract void alarm();
	/**
	 * @Description ͣ��
	 * @Date 2016-6-8 ����2:09:42
	 * @author caiqing
	 * @ReturnType void
	 */
	protected abstract void stop();
	/**
	 * @Description ģ�巽��  �� ����һ���Ĺ��� �� ˳����û�������
	 * ��������ͨ�÷�����  ������������ 
	 * @Date 2016-6-8 ����2:09:42
	 * @author caiqing
	 * @ReturnType void
	 */
	final void run(){
		this.start();
		if(this.isAlarm()){
			this.alarm();
		}
		this.stop();
	}
	
	/**
	 * @Description ���ӷ��� Ĭ�����Ȼ���
	 * @Date 2016-6-8 ����3:02:48
	 * @author caiqing
	 * @return
	 * @ReturnType boolean
	 */
	protected boolean isAlarm() {
		return true;
	}
	
}
