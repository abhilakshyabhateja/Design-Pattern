package creation.factory.domains;

public abstract class Insurance {

	private String policyHolderName;
	private double policyAmount;
	
	public abstract double calculatePremium();
	/**
	 * @param policyHolderName
	 * @param policyAmount
	 */
	
	public Insurance(String policyHolderName, double policyAmount) {
		super();
		this.policyHolderName = policyHolderName;
		this.policyAmount = policyAmount;
	}

	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the policyHolderName
	 */
	public String getPolicyHolderName() {
		return policyHolderName;
	}

	/**
	 * @return the policyAmount
	 */
	public double getPolicyAmount() {
		return policyAmount;
	}
}

