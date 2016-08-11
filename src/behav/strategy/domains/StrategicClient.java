package behav.strategy.domains;

import java.util.Collections;

public class StrategicClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		PatientContext patient1=new PatientContext();
		
		//Collections.sort(new NameComparator());
		
		patient1.setStrategy(new CardPayment());
		patient1.makePayment(5800);
		
        PatientContext patient2=new PatientContext();
        
      //Collections.sort(new AgeComparator());
		patient1.setStrategy(new CardPayment());
		patient1.makePayment(7800);
	}

}
