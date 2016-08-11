package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class City implements Profitable {

	private String cityName;
	private List<Profitable> stores;
	
	
	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the stores
	 */
	public List<Profitable> getStores() {
		return stores;
	}

	/**
	 * @param stores the stores to set
	 */
	public void setStores(List<Profitable> stores) {
		this.stores = stores;
	}

	/**
	 * @param cityName
	 */
	public City(String cityName) {
		super();
		this.cityName = cityName;
		stores=new ArrayList<Profitable>();
	}

	
	@Override
	public double getProfit() {
		// TODO Auto-generated method stub
		double profit1=0;
		for(Profitable obj:stores)
		{
			profit1=profit1+obj.getProfit();
		}
		return profit1;
	}

	@Override
	public void addLeaf(Profitable child) {
		// TODO Auto-generated method stub
		if(child instanceof Store)
		{
			stores.add(child);
		}

	}

	@Override
	public void removeLeaf(Profitable child) {
		// TODO Auto-generated method stub

	}

}
