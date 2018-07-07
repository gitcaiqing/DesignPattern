package 建造者模式.learn20180419;

public class BuilderB extends Builder{
	
	ProductComputer productComputer = new ProductComputer();

	@Override
	public void BuildCPU() {
		productComputer.setCpu("B-CPU");
	}

	@Override
	public void BuildMainboard() {
		productComputer.setMainboard("B-mainboard");
	}

	@Override
	public void BuildHD() {
		productComputer.setHd("B-hd");
	}

	@Override
	public ProductComputer generatorProduct() {
		return productComputer;
	}

}
