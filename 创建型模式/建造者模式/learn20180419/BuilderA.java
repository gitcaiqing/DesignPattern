package 建造者模式.learn20180419;

public class BuilderA extends Builder{
	
	ProductComputer productComputer = new ProductComputer();

	@Override
	public void BuildCPU() {
		productComputer.setCpu("A-CPU");
	}

	@Override
	public void BuildMainboard() {
		productComputer.setMainboard("A-mainboard");
	}

	@Override
	public void BuildHD() {
		productComputer.setHd("A-hd");
	}

	@Override
	public ProductComputer generatorProduct() {
		return productComputer;
	}

}
