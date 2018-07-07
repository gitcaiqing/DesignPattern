package 简单工厂;


/**@Projectname: DesignPattern
 * @Typename: Operator 
 * @Description: TODO
 * @CreateDate:  2017-7-13 下午2:41:10
 * @LastModified: 2017-7-13 下午2:41:10
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public abstract class Operator {
	
	protected double NumA = 0d;
	
	protected double NumB = 0d;

	
	public Double getNumA() {
		return NumA;
	}

	
	public void setNumA(Double numA) {
		NumA = numA;
	}

	
	public Double getNumB() {
		return NumB;
	}

	
	public void setNumB(Double numB) {
		NumB = numB;
	}

	public double getResult(){
		return 0d;
	}
}
