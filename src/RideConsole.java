import java.util.HashMap;
import java.util.Map;

/**
* This class ....
*
* @author Kayleigh DiNatale
* @version 1.0
*/

public class RideConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ride ride1 = new Ride("WW", "Wildcat Waterfall", Ride.RideType.WATER, 60, 6);
		
		Ride ride2 = new Ride("RR", "Roarin' Racer", Ride.RideType.COASTER, 90, 48);
				
		Ride ride3 = new Ride("HL", "Haunted Lab", Ride.RideType.THRILL, 30, 12);
		
		Ride ride4 = new Ride("MR", "Mine Ride", Ride.RideType.GENERAL, 40, 24);

		Ride ride5 = new Ride("CC", "Cats Carousel", Ride.RideType.GENERAL, 180, 50);

		Ride ride6 = new Ride("MC", "Mini Cat", Ride.RideType.KIDDIE, 45, 20);
		
		// Create Map
		Map<String, Ride> rideDB = new HashMap<String, Ride>();
		
		// Add key value entries of ID and Ride object
		
		rideDB.put(ride1.getRideId(), ride1);
		
		rideDB.put(ride2.getRideId(), ride2);
		
		rideDB.put(ride3.getRideId(), ride3);
		
		rideDB.put(ride4.getRideId(), ride4);
		
		rideDB.put(ride5.getRideId(), ride5);
		
		rideDB.put(ride6.getRideId(), ride6);
		
		for(String rideId: rideDB.keySet()) {
			System.out.println(rideId);
			
			System.out.println(rideDB.get(rideId));
		}
		
	}

}
