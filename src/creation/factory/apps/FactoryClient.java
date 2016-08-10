package creation.factory.apps;

import creation.factory.domains.Factory;
import creation.factory.domains.Insurance;
import creation.factory.domains.InsuranceFactory;
import creation.factory.domains.InsuranceStaticFactory;


public class FactoryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factory factory = new InsuranceFactory();
		
		Insurance insurance = factory.getInstance(2);
		
		System.out.println(insurance.calculatePremium());
		
		Insurance insurance2 = InsuranceStaticFactory.getInstance(3);
		System.out.println(insurance2.calculatePremium());
		
	}

}
