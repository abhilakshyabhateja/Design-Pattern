package creation.factory.domains;

enum InsuranceType{FAMILYFLOATER, CRITICALILLNESS}

public class HealthInsurance extends Insurance {

	private InsuranceType type;
	
	
	
	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HealthInsurance(String policyHolderName, double policyAmount, InsuranceType type) {
		super(policyHolderName, policyAmount);
		// TODO Auto-generated constructor stub
		this.type = type;
	}


	@Override
	public double calculatePremium(){
		double premium = 0.0;
		
		switch(type){
		
		case FAMILYFLOATER:
			premium = 1500.00;
			break;
			
			
		case CRITICALILLNESS:
			premium = 2000.00;
			break;
		}
		return premium;
	}
}
