package 命令模式;

import java.util.Date;


/**@Projectname: DesignPattern
 * @Typename: TestCommond 
 * @Description: TODO
 * @CreateDate:  2017-7-11 下午5:31:29
 * @LastModified: 2017-7-11 下午5:31:29
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class TestCommond {

	/**@Methodname: main
	 * @Description: TODO
	 * @Param: @param args   
	 * @Return: void
	 * @Throws:
	 * @CreateDate:  2017-7-11 下午5:31:29 by CQ
	 * @LastModified: 2017-7-11 下午5:31:29 by CQ
	 * @version: 1.0
	 */
	public static void main(String[] args) {
		System.out.println(new Date().getTime());
		// TODO Auto-generated method stub
		Process process = new Process();
		int[] target = {1,3,5};
		process.each(target, new Commond() {
			public void process(int[] target) {
				for(int t:target){
					System.out.println("t:"+t);
				}
			}
		});
		process.each(target, new Commond() {
			public void process(int[] target) {
				System.out.println("t.length:"+target.length);
			}
		});
		
		process.each(target, new CommondImpl());
	}

}
