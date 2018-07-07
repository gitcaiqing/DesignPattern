package 建造者模式.learn20180419;

public class ProductComputer {
	
	private String cpu;
	private String mainboard;
	private String hd;
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getMainboard() {
		return mainboard;
	}
	public void setMainboard(String mainboard) {
		this.mainboard = mainboard;
	}
	public String getHd() {
		return hd;
	}
	public void setHd(String hd) {
		this.hd = hd;
	}
	@Override
	public String toString() {
		return "ProductComputer [cpu=" + cpu + ", mainboard=" + mainboard + ", hd=" + hd + "]";
	}
}
