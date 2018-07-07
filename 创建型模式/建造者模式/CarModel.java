package ������ģʽ;

import java.util.ArrayList;

/**
 * @Description ����ģ�ͳ����࣬���г���ģ�Ͷ��̳������
 * @author caiqing
 * @Date 2016-5-31 ����8:56:53
 */
public abstract  class CarModel {
	
	//��������Ǹ�����������ִ�е�˳��
	private ArrayList<String> sequence = new ArrayList<String>();
	
	final public ArrayList<String> getSequence() {
		return sequence;
	}

	final public void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}
	
	/**
	 * @Description ��������
	 * @Date 2016-5-31 ����8:58:43
	 * @author caiqing
	 * @ReturnType void
	 */
	protected abstract void start();
	
	/**
	 * @Description ����ֹͣ
	 * @Date 2016-5-31 ����8:58:43
	 * @author caiqing
	 * @ReturnType void
	 */
	protected abstract void stop();
	
	/**
	 * @Description ������������
	 * @Date 2016-5-31 ����8:58:43
	 * @author caiqing
	 * @ReturnType void
	 */
	protected abstract void alarm();
	
	/**
	 * @Description ��������
	 * @Date 2016-5-31 ����8:58:43
	 * @author caiqing
	 * @ReturnType void
	 */
	protected abstract void engineBoom();
	
	/**
	 * @Description ����ģ��������
	 * @Date 2016-5-31 ����9:05:48
	 * @author caiqing
	 * @ReturnType void
	 */
	final public void run(){
		for(int i=0; i<this.sequence.size(); i++){
			String actionName = this.sequence.get(i);
			if(actionName.equalsIgnoreCase("start")){
				this.start();
			}else if(actionName.equalsIgnoreCase("stop")){
				this.stop();
			}else if(actionName.equalsIgnoreCase("alarm")){
				this.alarm();
			}else if(actionName.equalsIgnoreCase("engineBoom")){
				this.engineBoom();
			}
		}
	}

}
