package 工厂方法;


/**@Projectname: DesignPattern
 * @Typename: SimpleFactory 
 * @Description: TODO
 * @CreateDate:  2017-7-13 下午4:50:01
 * @LastModified: 2017-7-13 下午4:50:01
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class SimpleFactory {

	public static Leifeng createLeifeng(String type){
		Leifeng leifeng = null;
		switch (type) {
		case "大学生":
			leifeng = new Student();
			break;
		case "志愿者":
			leifeng = new Volunteer();
			break;
		default:
			break;
		}
		return leifeng;
	}
}
