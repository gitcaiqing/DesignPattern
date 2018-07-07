package 建造者模式;

import java.util.ArrayList;

/**
 * @Description 导演类 安排顺序 生产车辆模型
 * @author caiqing
 * @Date 2016-5-31 下午3:39:38
 */
public class Director {

	//定义顺序
	private ArrayList<String> sequence =  new ArrayList<String>();

	//创建 奔驰 宝马 建造者
	private BenzBuilder benzBuilder = new BenzBuilder();
	private BmwBuilder bmwBuilder = new BmwBuilder();
	

	/**
	 * @Description 定义A类奔驰模型
	 * @Date 2016-5-31 下午3:43:16
	 * @author caiqing
	 * @return
	 * @ReturnType BenzModel
	 */
	public BenzModel getABenzModel(){
		//清理场景
		this.sequence.clear();
		//A类奔驰执行顺序
		this.sequence.add("start");
		this.sequence.add("stop");
		//按照顺序返回一辆奔驰
		this.benzBuilder.setSequence(sequence);
		return (BenzModel) this.benzBuilder.getCarModel();
	}
	
	/**
	 * @Description 定义B类奔驰
	 * @Date 2016-5-31 下午3:51:48
	 * @author caiqing
	 * @return
	 * @ReturnType BenzModel
	 */
	public BenzModel getBBenzModel(){
		//清理场景
		this.sequence.clear();
		//A类奔驰执行顺序
		this.sequence.add("start");
		this.sequence.add("alarm");
		this.sequence.add("stop");
		//按照顺序返回一辆奔驰
		this.benzBuilder.setSequence(sequence);
		return (BenzModel) this.benzBuilder.getCarModel();
	}
	
	/**
	 * @Description 定义C类宝马模型
	 * @Date 2016-5-31 下午3:43:16
	 * @author caiqing
	 * @return
	 * @ReturnType BenzModel
	 */
	public BmwModel getCBmwModel(){
		//清理场景
		this.sequence.clear();
		//C类宝马执行顺序
		this.sequence.add("start");
		this.sequence.add("stop");
		//按照顺序返回一辆宝马
		this.bmwBuilder.setSequence(sequence);
		return (BmwModel) this.bmwBuilder.getCarModel();
	}
	
	/**
	 * @Description 定义D类宝马
	 * @Date 2016-5-31 下午3:51:48
	 * @author caiqing
	 * @return
	 * @ReturnType BenzModel
	 */
	public BmwModel getDBmwModel(){
		//清理场景
		this.sequence.clear();
		//D类宝马执行顺序
		this.sequence.add("start");
		this.sequence.add("alarm");
		this.sequence.add("stop");
		//按照顺序返回一辆宝马
		this.bmwBuilder.setSequence(sequence);
		return (BmwModel) this.bmwBuilder.getCarModel();
	}
}
