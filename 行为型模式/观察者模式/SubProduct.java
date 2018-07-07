package 观察者模式;


/**@Projectname: DesignPattern
 * @Typename: Product 
 * @Description: 具体主题：被观察类
 * 具体主题是一个实现主题接口的类，该类包含了会经常发生变化的数据。而且还有一个集合，该集合存放的是观察者的引用。
 * @CreateDate:  2017-7-12 下午2:46:09
 * @LastModified: 2017-7-12 下午2:46:09
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class SubProduct extends Subject{

	private String name;
	private double price;
	
	/**@Description: TODO
	 * @Param:    
	 * @CreateDate:  2017-7-12 下午2:47:13 by CQ
	 * @LastModified: 2017-7-12 下午2:47:13 by CQ
	 * @version: 1.0
	 */
	public SubProduct() {
		// TODO Auto-generated constructor stub
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
		notifyObserver(name);
	}

	
	public double getPrice() {
		return price;
	}

	
	public void setPrice(double price) {
		this.price = price;
		notifyObserver(price);
	}


	/**@Description: TODO
	 * @Param: @param name
	 * @Param: @param price   
	 * @CreateDate:  2017-7-12 下午4:14:04 by CQ
	 * @LastModified: 2017-7-12 下午4:14:04 by CQ
	 * @version: 1.0
	 */
	public SubProduct(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	
	
}
