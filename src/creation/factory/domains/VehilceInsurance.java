package creation.factory.domains;

enum Vehicles{CAR, BIKE, BUS}
public class VehilceInsurance extends Insurance {
	
	private Vehicles type;

	public VehilceInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehilceInsurance(String policyHolderName, double policyAmount, Vehicles type) {
		super(policyHolderName, policyAmount);
		// TODO Auto-generated constructor stub
		this.type = type;
	}

	public Vehicles getType() {
		return type;
	}

	public void setType(Vehicles type) {
		this.type = type;
	}
	
	@Override
	public double calculatePremium(){
		double premium = 0.0;
		
		switch(type){
		
		case CAR:
			premium = 1500.00;
			break;
			
			
		case BIKE:
			premium = 2000.00;
			break;
			
		case BUS:
			premium = 2500.00;
			break;
		}
		return premium;
	}
	
}
