/**
 * 
 */
package structural.adapter;

/**
 * @author pshu11
 *
 */
public class SavingAccount extends BankAccount {

	/* (non-Javadoc)
	 * @see structural.adapter.BankAccount#calculate()
	 */
	@Override
	public double calculate() {
		
		return getServiceCharge();
	}

	public double getServiceCharge(){
		
		return 1000.00;
	}
	
}
