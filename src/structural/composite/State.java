package structural.composite;


import java.util.ArrayList;
import java.util.List;

public class State implements Profitable {

	private String stateName;
	private List<Profitable> cities;
	
	
	/**
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * @param stateName the stateName to set
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	/**
	 * @return the cities
	 */
	public List<Profitable> getCities() {
		return cities;
	}

	/**
	 * @param cities the cities to set
	 */
	public void setCities(List<Profitable> cities) {
		this.cities = cities;
	}

	
	/**
	 * @param stateName
	 */
	public State(String stateName) {
		super();
		this.stateName = stateName;
		cities=new ArrayList<Profitable>();
	}

	@Override
	public double getProfit() {
		// TODO Auto-generated method stub
		double profit1=0;
		for(Profitable obj:cities)
		{
			profit1=profit1+obj.getProfit();
		}
		return profit1;
	}

	@Override
	public void addLeaf(Profitable child) {
		// TODO Auto-generated method stub
		if(child instanceof City)
		{
			cities.add(child);
		}

	}

	@Override
	public void removeLeaf(Profitable child) {
		// TODO Auto-generated method stub

	}

}

