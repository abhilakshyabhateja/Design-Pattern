package creation.prototype.apps;

import creation.prototype.domains.CreditCard;
import creation.prototype.domains.CardCache;

public class ProtoTypeClient {

	public static void main(String args[]){
		
		CreditCard card=new CreditCard();
		
		CardCache cache=new CardCache();
		
		System.out.println("original card hash code="+card.hashCode());
		System.out.println("initial credit limit="+card.getCreditLimit());
		cache.loadProduct(card);
		
		try{
		CreditCard cachedCard = cache.getCachedCard();
		
		System.out.println("Cached card hash code="+cachedCard.hashCode());
		System.out.println("credit limit"+cachedCard.getCreditLimit());
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		
	}
}


