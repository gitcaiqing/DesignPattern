package 外观_门面_模式;

/**
 * @Description 定义一个写信的过程
 * @author caiqing
 * @Date 2016-6-7 下午2:33:09
 */
public interface LetterProcess {
	/**
	 * @Description 写信
	 * @Date 2016-6-7 下午2:33:31
	 * @author caiqing
	 * @ReturnType void
	 */
	public void writeContext(String context);
	/**
	 * @Description 填写信封
	 * @Date 2016-6-7 下午2:36:04
	 * @author caiqing
	 * @param address
	 * @ReturnType void
	 */
	public void fillEnvelope(String address);
	/**
	 * @Description 信件检查
	 * @Date 2016-6-7 下午2:36:07
	 * @author caiqing
	 * @ReturnType void
	 */
	//public void checkLetter();
	/**
	 * @Description 信件入信封
	 * @Date 2016-6-7 下午2:36:10
	 * @author caiqing
	 * @ReturnType void
	 */
	public void letterInotoEnvelope();
	/**
	 * @Description 信件邮递
	 * @Date 2016-6-7 下午2:36:13
	 * @author caiqing
	 * @ReturnType void
	 */
	public void setdLetter();
}
