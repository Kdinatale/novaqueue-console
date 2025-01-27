import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
* This class prompts a user for ride id and the number of people in line 
* and returns information about the ride's wait time.
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
		
		int numPeopleInLine = -1;
		
		boolean notValidRideId = true;
		
		boolean notValidNumPeople = true;
		
		double waitTime;
		Ride ride = null;
		
		while(notStop) {
			
			// Prompt user for the ride id
			
			while(notValidRideId) {
				System.out.println("Enter the ride id: ");
				
				// Trim white space from input 
				rideId = scan.nextLine().trim();
				
				// Check if user inputs STOP
				if(rideId.equals("STOP")) {
					
					// Print Stop Statement
					System.out.print("Thanks for using NovaQueue");
					
					notStop = false;
					// Break out of loop
					break;
				}
				
				// Get Ride object from key
				ride = rideDB.get(rideId);
				if(ride != null) {
					notValidRideId = false;
				}
				else {
					System.out.println("No ride exists for ride id " + rideId);
				}
			}
			
			
			while(notValidNumPeople && notStop) {
				try {
					
					// Prompt user for the number of people in line
					System.out.println("Enter number of people currently in line: ");
					
					// Scan user input
					numPeopleInLine = scan.nextInt();
					
					if(numPeopleInLine >= 0 && numPeopleInLine <= 5000) {
						notValidNumPeople = false;
					}
					else {
						System.out.println("Invalid count for people currently in line");
					}
				}
				// Catch exception if user inputs an incorrect data type
				catch(InputMismatchException e) {
					
					// Check if the value input was STOP
					if(scan.nextLine().trim().equals("STOP")) {
						
						System.out.println("Thanks for using NovaQueue");
						notStop = false;
						break;
					}
					else {
						// Prompt user for new input of correct type
						System.out.println("Invalid count for people in line.");
						
					}
					
				}
				scan.nextLine();
								
			}

			// Wait time = (Dispatch Time / Riders per dispatch) * Line Size
			waitTime = (((double)ride.getDispatchTime() / ride.getRidersPerDispatch()) * numPeopleInLine)/60;

			System.out.print(ride.getRideName() + " has " + numPeopleInLine + " people in line and the wait time is ");
			
			System.out.format("%.1f ", waitTime);
			
			System.out.println(" minutes - ");
			
			//Add status
			
			System.out.println();
			
			notValidRideId = true;
			notValidNumPeople = true;
		}
		
	}

}
