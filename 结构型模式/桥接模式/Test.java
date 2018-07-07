package 桥接模式;


/**@Projectname: DesignPattern
 * @Typename: Test 
 * @Description: TODO
 * @CreateDate:  2017-7-12 上午11:08:34
 * @LastModified: 2017-7-12 上午11:08:34
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class Test {

	public static void main(String[] args) {
		
		//2个维度的变化
		
		//小汽车行驶在街道上
		AbstractRoadBrige roadBrige = new Street(new Car());
		System.out.println(roadBrige.roadrun());
		//小汽车行驶在高速公路上
		AbstractRoadBrige roadBrige2 = new SpeedWay(new Car());
		System.out.println(roadBrige2.roadrun());
		//公交车行驶在街道上
		AbstractRoadBrige roadBrige3 = new Street(new BusCar());
		System.out.println(roadBrige3.roadrun());
		//公交车行驶在高速公路上
		AbstractRoadBrige roadBrige4 = new SpeedWay(new BusCar());
		System.out.println(roadBrige4.roadrun());
		
		System.out.println("-------------------------------");
		//3个维度的变化
		//男人驾驶小汽车行驶在街道上
		AbstractPeopleBrige peopleBrige = new man(new Street(new Car()));
		System.out.println(peopleBrige.driver());
		
	}
}
