package 建造者模式;

import java.util.ArrayList;

/**
 * @Description 汽车模型抽象类，所有车辆模型都继承这个类
 * @author caiqing
 * @Date 2016-5-31 上午8:56:53
 */
public abstract  class CarModel {
	
	//这个参数是各个基本方法执行的顺序
	private ArrayList<String> sequence = new ArrayList<String>();
	
	final public ArrayList<String> getSequence() {
		return sequence;
	}

	final public void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}
	
	/**
	 * @Description 汽车启动
	 * @Date 2016-5-31 上午8:58:43
	 * @author caiqing
	 * @ReturnType void
	 */
	protected abstract void start();
	
	/**
	 * @Description 汽车停止
	 * @Date 2016-5-31 上午8:58:43
	 * @author caiqing
	 * @ReturnType void
	 */
	protected abstract void stop();
	
	/**
	 * @Description 汽车喇叭声音
	 * @Date 2016-5-31 上午8:58:43
	 * @author caiqing
	 * @ReturnType void
	 */
	protected abstract void alarm();
	
	/**
	 * @Description 汽车引擎
	 * @Date 2016-5-31 上午8:58:43
	 * @author caiqing
	 * @ReturnType void
	 */
	protected abstract void engineBoom();
	
	/**
	 * @Description 汽车模型跑起来
	 * @Date 2016-5-31 上午9:05:48
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
