package �Ž�ģʽ;


/**@Projectname: DesignPattern
 * @Typename: AbstractRoadBirge 
 * @Description: ����·�� ��Ϊ�Ž��� �����������
 * @CreateDate:  2017-7-12 ����11:02:14
 * @LastModified: 2017-7-12 ����11:02:14
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
