import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

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
		
		System.out.println("Welcome to NovaQueue");
		
		boolean notStop = true;
		
		Scanner scan = new Scanner(System.in);
		
		String rideId = "";
		
		int numPeople = -1;
		
		while(notStop) {
			
			// Prompt user for the ride id
			System.out.println("Enter the ride id: ");
			
			// Trim white space from input 
			rideId = scan.nextLine().trim();
			
			// Check if user inputs STOP
			if(rideId.equals("STOP")) {
				
				// Print Stop Statement
				System.out.print("Thanks for using NovaQueue");
				
				// Break out of loop
				break;
			}
			
			// Convert to upper case to ignore the input case
			rideId = rideId.toUpperCase();
			
			// For testing purposes 
			// System.out.println("Ride ID: " + rideId);
			
			// Prompt user for the number of people in line
			System.out.println("Enter number of people currently in line: ");
			
			
			try {
				// Scan user input
				numPeople = scan.nextInt();
			}
			// Catch exception if user inputs an incorrect data type
			catch(InputMismatchException e) {
				// Check if the value input was STOP
				if(scan.nextLine().trim().equals("STOP")) {
					System.out.println("Thanks for using NovaQueue");
					break;
				}
				else {
					// Prompt user for new input of correct type
				}
				
			}


			// Check if within range of a valid input for the number of people in line 


//			System.out.println("Number of People " + numPeople);
			
			System.out.println();
			
		}
		
	}

}
