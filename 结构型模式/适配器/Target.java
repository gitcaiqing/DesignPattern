package 适配器;


/**@Projectname: DesignPattern
 * @Typename: Target 
 * @Description: TODO
 * @CreateDate:  2017-7-6 上午10:28:32
 * @LastModified: 2017-7-6 上午10:28:32
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public interface Target {

	//源角色有的方法
	public void sampleOperation1();
	
	//源角色没有的方法
	public void sampleOperation2();
}
