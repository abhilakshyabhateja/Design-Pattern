/**
 * 
 */
package structural.adapter;

/**
 * @author pshu11
 *
 */
public class AdapterClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CreditCard card=new CreditCard(45000);
     
     AccountAdapter adapter=new AccountAdapter(card);
     
     System.out.println("Total Amount Due  ="+adapter.calculate());
     
		
		
	}

}
