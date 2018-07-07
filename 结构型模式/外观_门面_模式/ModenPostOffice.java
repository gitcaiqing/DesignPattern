package 外观_门面_模式;

/**
 * @Description 对写信的5个方法进行封装
 * @author caiqing
 * @Date 2016-6-7 下午2:45:34
 */
public class ModenPostOffice {
	
	LetterProcess letterProcess = new LetterProcessImpl();
	
	Police police = new Police();
	
	/**
	 * @Description 封装的门面方法
	 * @Date 2016-6-7 下午2:48:02
	 * @author caiqing
	 * @param context
	 * @param address
	 * @ReturnType void
	 */
	public void sendLetterFace(String context,String address){
		//写信
		letterProcess.writeContext(context);
		//填写信封
		letterProcess.fillEnvelope(address);
		//检查信件
		police.checkLetter(letterProcess);
		//信件放入信封
		letterProcess.letterInotoEnvelope();
		//邮递信件
		letterProcess.setdLetter();
	}
}
