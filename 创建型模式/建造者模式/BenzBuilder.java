package 建造者模式;

import java.util.ArrayList;


public class BenzBuilder extends CarBuilder{

	BenzModel benz = new BenzModel();
	
	@Override
	protected void setSequence(ArrayList<String> sequence) {
		// TODO Auto-generated method stub
		this.benz.setSequence(sequence);
	}
	@Override
	protected CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.benz;
	}
	

}
