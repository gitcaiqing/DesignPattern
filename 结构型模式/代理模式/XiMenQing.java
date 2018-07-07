package 代理模式;
/**
 * @Description 一个男的 西门庆
 * @author caiqing
 * @Date 2016-5-16 下午6:08:41
 */
public class XiMenQing {
	
	public static void main(String[] args) {

		//看上了潘金莲,潘金莲不好意思，通过王婆代理
		Wangpo wangpo = new Wangpo();
		//西门庆 和 潘金莲happy 通过王婆代理 
		wangpo.makeEyesWithMan();
		wangpo.makeHappyWithMan();
		
		System.out.println("-------------");
		
		//西门庆 和 潘金莲2号happy 也通过王婆代理
		wangpo = new Wangpo(new PanJinLian2());
		wangpo.makeEyesWithMan();
		wangpo.makeHappyWithMan();
	}
}
