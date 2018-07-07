package 桥接模式;


/**@Projectname: DesignPattern
 * @Typename: People 
 * @Description: TODO
 * @CreateDate:  2017-7-12 上午11:16:07
 * @LastModified: 2017-7-12 上午11:16:07
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public abstract class AbstractPeopleBrige {
	
	AbstractRoadBrige abstractRoad;
	
	public AbstractPeopleBrige(AbstractRoadBrige abstractRoad){
		this.abstractRoad = abstractRoad;
	}

	abstract String driver();
}
