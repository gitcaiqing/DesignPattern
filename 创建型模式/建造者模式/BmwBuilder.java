package 建造者模式;

import java.util.ArrayList;

/**
 * @Description TODO
 * @author caiqing
 * @Date 2016-5-31 上午9:47:19
 */
public class BmwBuilder extends CarBuilder{

	BmwModel bmw = new BmwModel();
	
	@Override
	protected void setSequence(ArrayList<String> sequence) {
		// TODO Auto-generated method stub
		bmw.setSequence(sequence);
	}
	@Override
	protected CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.bmw;
	}

}
