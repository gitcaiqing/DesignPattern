package 建造者模式;

import java.util.ArrayList;

/**
 * @Description 客户需求：自定义汽车启动 停车 鸣喇叭 发动机声音 的执行顺序
 * @author caiqing
 * @Date 2016-5-31 上午9:17:00
 */
public class Client {
	public static void main(String[] args) {
		
		System.out.println("---------直接访问类 ↓---------");
		//创建奔驰模型对象
		BenzModel benz = new BenzModel();
		//建立执行顺序
		ArrayList<String> sequenceBenz = new ArrayList<String>();
		sequenceBenz.add("start");
		sequenceBenz.add("engineBoom");
		sequenceBenz.add("alarm");
		sequenceBenz.add("stop");
		benz.setSequence(sequenceBenz);
		benz.run();
		
		//创建奔驰模型对象
		BmwModel bmw = new BmwModel();
		//建立执行顺序
		ArrayList<String> sequenceBmw = new ArrayList<String>();
		sequenceBmw.add("start");
		sequenceBmw.add("engineBoom");
		sequenceBmw.add("alarm");
		sequenceBmw.add("stop");
		bmw.setSequence(sequenceBmw);
		bmw.run();
		//以上方式在设置汽车模型方法执行顺序时较为麻烦
		System.out.println("---------builder method ↓---------");
		
		ArrayList<String> sequenceBuilder = new ArrayList<String>();
		sequenceBuilder.add("start");
		sequenceBuilder.add("alarm");
		sequenceBuilder.add("engineBoom");
		sequenceBuilder.add("stop");
		
		BenzBuilder benzBuilder = new BenzBuilder();
		benzBuilder.setSequence(sequenceBuilder);
		BenzModel benzB =  (BenzModel) benzBuilder.getCarModel();
		benzB.run();
		
		//建造一个相同的宝马
		BmwBuilder bmwBuilder = new BmwBuilder();
		bmwBuilder.setSequence(sequenceBuilder);
		BmwModel bmwB = (BmwModel) bmwBuilder.getCarModel();
		bmwB.run();
		
		System.out.println("---------导演类 安排 汽车模型 顺序 ↓---------");
		//客户与导演类发生关系 即可
		Director director = new Director();
		for(int i=1; i<6; i++){
			System.out.println("-A奔驰-"+i+"↓");
			director.getABenzModel().run();
		}
		
		for(int i=1; i<11; i++){
			System.out.println("-B奔驰-"+i+"↓");
			director.getBBenzModel().run();
		}
		
		for(int i=1; i<6; i++){
			System.out.println("-C宝马-"+i+"↓");
			director.getCBmwModel().run();
		}
	}
}	
