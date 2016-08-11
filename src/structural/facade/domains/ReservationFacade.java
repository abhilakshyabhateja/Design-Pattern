package structural.facade.domains;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import java.util.*;

public class ReservationFacade {
	
	private HotelAvailability hotelStatus;
	private FlightAvailability flightStatus;
	
	
	
	public ReservationFacade(){
		
		hotelStatus = new HotelAvailability();
		flightStatus = new FlightAvailability();
	}

	public Map<String,Map<String,Integer>> getAllStatus(Date date)
	{
		Map<String, Map<String,Integer>> list = new HashMap<String,Map<String,Integer>>();
		
		Map<String,Integer> fitList = new HashMap<String,Integer>();
		fitList.put("Indigo",flightStatus.indiGoStatus(date));
		fitList.put("SpiceJet",flightStatus.spiceJetStatus(date));
		
		Map<String,Integer> hotelList = new HashMap<String,Integer>();
		hotelList.put("Oberoi", hotelStatus.oberoiHotelStatus(date));
		hotelList.put("Taj", hotelStatus.tajHotelStatus(date));
		
		list.put("FlightStatus",fitList);
		list.put("HotelStatus",hotelList);
		
		return list;
	}

	public HotelAvailability getHotelStatus() {
		return hotelStatus;
	}



	public FlightAvailability getFlightStatus() {
		return flightStatus;
	}
}
