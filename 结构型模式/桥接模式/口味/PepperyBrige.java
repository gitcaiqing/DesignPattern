package 桥接模式.口味;


/**@Projectname: DesignPattern
 * @Typename: PepperyBrige 
 * @Description: 口味桥梁
 * @CreateDate:  2017-7-12 上午9:19:10
 * @LastModified: 2017-7-12 上午9:19:10
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public abstract class PepperyBrige {
	//组合一个Perpery，
    protected Perpery perpery;
    
    public PepperyBrige(Perpery perpery){
    	this.perpery = perpery;
    }
    
    public abstract void eat();
}
