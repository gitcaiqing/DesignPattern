package ������ģʽ.learn20180419;

public class Diretor {

	public ProductComputer Construct(Builder builder) {
		builder.BuildCPU();
		builder.BuildMainboard();
		builder.BuildHD();
		return builder.generatorProduct();
	}
}
