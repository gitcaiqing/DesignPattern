package 桥接模式;


/**@Projectname: DesignPattern
 * @Typename: AbstractRoadBirge 
 * @Description: 抽象公路类 作为桥接类 组合汽车对象
 * @CreateDate:  2017-7-12 上午11:02:14
 * @LastModified: 2017-7-12 上午11:02:14
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public abstract class AbstractRoadBrige {

	AbstractCar abstractCar;
	
	public AbstractRoadBrige(AbstractCar abstractCar){
		this.abstractCar = abstractCar;
	}
	
	abstract String roadrun();
}
