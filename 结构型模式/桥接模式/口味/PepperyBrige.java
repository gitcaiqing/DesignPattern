package �Ž�ģʽ.��ζ;


/**@Projectname: DesignPattern
 * @Typename: PepperyBrige 
 * @Description: ��ζ����
 * @CreateDate:  2017-7-12 ����9:19:10
 * @LastModified: 2017-7-12 ����9:19:10
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public abstract class PepperyBrige {
	//���һ��Perpery��
    protected Perpery perpery;
    
    public PepperyBrige(Perpery perpery){
    	this.perpery = perpery;
    }
    
    public abstract void eat();
}
