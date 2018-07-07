package 模板方法模式;
/**
 * @Description 定义抽象类
 * @author caiqing
 * @Date 2016-6-8 下午2:08:53
 */
public abstract class HanmaModel {
	/**
	 * @Description 启动
	 * @Date 2016-6-8 下午2:09:42
	 * @author caiqing
	 * @ReturnType void
	 */
	protected abstract void start();
	/**
	 * @Description 喇叭叫
	 * @Date 2016-6-8 下午2:09:42
	 * @author caiqing
	 * @ReturnType void
	 */
	protected abstract void alarm();
	/**
	 * @Description 停车
	 * @Date 2016-6-8 下午2:09:42
	 * @author caiqing
	 * @ReturnType void
	 */
	protected abstract void stop();
	/**
	 * @Description 模板方法  ： 按照一定的规则 或 顺序调用基本方法
	 * 走起，子类通用方法，  整合其他方法 
	 * @Date 2016-6-8 下午2:09:42
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
	 * @Description 钩子方法 默认喇叭会响
	 * @Date 2016-6-8 下午3:02:48
	 * @author caiqing
	 * @return
	 * @ReturnType boolean
	 */
	protected boolean isAlarm() {
		return true;
	}
	
}
