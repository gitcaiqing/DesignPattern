package ²ßÂÔÄ£Ê½;

public class Context {
	Strategy strategy;
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void doMethod(){
		strategy.method();
	}
	
	//²âÊÔ
	public static void main(String[] args) {

		Context context = new Context(new StrategyImpl1());
		context.doMethod();
		
		context = new Context(new StrategyImpl2());
		context.doMethod();
	}
}
