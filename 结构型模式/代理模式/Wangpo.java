package 代理模式;

/**
 * @Description 王婆太老是男人都看不上，脸皮厚，有经验，她作为一类女人的代理
 * @author caiqing
 * @Date 2016-5-16 下午6:02:48
 */
public class Wangpo implements KindWomen{

	public KindWomen kindWomen;
	
	//默认其实潘金莲Panjinlian的代理
	public Wangpo(){
		this.kindWomen = new PanJinLian();
	}
	
	//可以是这一类女人的代理
	public Wangpo(KindWomen kindWomen){
		this.kindWomen = kindWomen;
	}
	
	@Override
	public void makeEyesWithMan() {
		// 自己老了干不了 接活 让 年轻的来
		this.kindWomen.makeEyesWithMan();
	}

	@Override
	public void makeHappyWithMan() {
		// 自己老了干不了 接活 让 年轻的来
		this.kindWomen.makeHappyWithMan();
	}

	
}
