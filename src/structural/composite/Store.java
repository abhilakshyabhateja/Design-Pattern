package structural.composite;

public class Store implements Profitable {

	
	private double profit;
	private String storeName;
	
	/**
	 * @return the storeName
	 */
	public String getStoreName() {
		return storeName;
	}

	/**
	 * @param storeName the storeName to set
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public Store(double profit, String storeName) {
		super();
		this.profit = profit;
		this.storeName = storeName;
	}

	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param profit the profit to set
	 */
	public void setProfit(double profit) {
		this.profit = profit;
	}

	@Override
	public double getProfit() {
		// TODO Auto-generated method stub
		return this.profit;
	}

	@Override
	public void addLeaf(Profitable child) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeLeaf(Profitable child) {
		// TODO Auto-generated method stub

	}

}
