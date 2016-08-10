/**
 * 
 */
package structural.adapter;

/**
 * @author pshu11
 *
 */
public class CreditCard {
	private double amountDue;
	
/**
	 * 
	 */
	public CreditCard() {
		super();
		this.amountDue=amountDue;
		// TODO Auto-generated constructor stub
	}


	
	/**
 * @param amountDue
 */
public CreditCard(double amountDue) {
	super();
	this.amountDue = amountDue;
}



	public double calculateMinimumAmount(){
		return amountDue*.05;
		
	}
	
}
