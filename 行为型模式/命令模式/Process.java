package 命令模式;


/**@Projectname: DesignPattern
 * @Typename: Process 
 * @Description: TODO
 * @CreateDate:  2017-7-11 下午5:30:08
 * @LastModified: 2017-7-11 下午5:30:08
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class Process {

	public void each(int[] target, Commond commond){
		commond.process(target);
	}
}
