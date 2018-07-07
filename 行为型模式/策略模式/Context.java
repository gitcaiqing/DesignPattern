package ����ģʽ;

public class Context {
	Strategy strategy;
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void doMethod(){
		strategy.method();
	}
	
	//����
	public static void main(String[] args) {

		Context context = new Context(new StrategyImpl1());
		context.doMethod();
		
		context = new Context(new StrategyImpl2());
		context.doMethod();
	}
}
