package 建造者模式;

import java.util.ArrayList;

public abstract class CarBuilder {
	
	/**
	 * @Description 设置顺序
	 * @Date 2016-5-31 下午3:27:30
	 * @author caiqing
	 * @param sequence
	 * @ReturnType void
	 */
	protected abstract void setSequence(ArrayList<String> sequence);
	
	/**
	 * @Description 获取汽车模型 对象
	 * @Date 2016-5-31 下午3:27:14
	 * @author caiqing
	 * @return
	 * @ReturnType CarModel
	 */
	protected abstract CarModel getCarModel();

	
}
