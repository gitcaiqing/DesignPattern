package �۲���ģʽ;


/**@Projectname: DesignPattern
 * @Typename: Product 
 * @Description: �������⣺���۲���
 * ����������һ��ʵ������ӿڵ��࣬��������˻ᾭ�������仯�����ݡ����һ���һ�����ϣ��ü��ϴ�ŵ��ǹ۲��ߵ����á�
 * @CreateDate:  2017-7-12 ����2:46:09
 * @LastModified: 2017-7-12 ����2:46:09
 * @Author: CQ 
 * @UpdateAuthor: CQ
 * @version: 1.0
 */

public class SubProduct extends Subject{

	private String name;
	private double price;
	
	/**@Description: TODO
	 * @Param:    
	 * @CreateDate:  2017-7-12 ����2:47:13 by CQ
	 * @LastModified: 2017-7-12 ����2:47:13 by CQ
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
	 * @CreateDate:  2017-7-12 ����4:14:04 by CQ
	 * @LastModified: 2017-7-12 ����4:14:04 by CQ
	 * @version: 1.0
	 */
	public SubProduct(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	
	
}
