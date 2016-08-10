package structural.adapter;

public class AccountAdapter extends SavingAccount {

	private CreditCard card;
	
	
	/**
	 * @param card
	 */
	public AccountAdapter(CreditCard card) {
		super();
		this.card = card;
	}


	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		
		double totalDue=card.calculateMinimumAmount()+super.calculate();
		
		return totalDue;
	}

}
