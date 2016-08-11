
package structural.facade.domains;

import java.util.Date;
import java.util.Map;

public class FacadeClient {

	public static void main(String args[]){
		
		ReservationFacade facade=new ReservationFacade();
		
		double indigo= facade.getFlightStatus().indiGoStatus(new Date());
		
		System.out.println("Tickets avaialable=  "+indigo);
		
		Map<String,Map<String,Integer>> details = facade.getAllStatus(new Date());
		System.out.println("details of available flights=  "+new Date());
		
		
		Map<String,Integer> flts=details.get("FlightStatus");
		
		System.out.println("Indigo"+flts.get("Indigo"));
		System.out.println("spice jet"+flts.get("SpiceJet"));
		
		Map<String,Integer> hotels=details.get("HotelStatus");
		
		System.out.println("Taj Hotel"+hotels.get("Taj"));
		System.out.println("Oberoi hotel"+hotels.get("Oberoi"));
		
	}
	
}
