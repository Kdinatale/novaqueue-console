
public class Ride {
	
	public enum RideType{
		WATER,
		COASTER,
		THRILL,
		GENERAL,
		KIDDIE
	}
	
	// Attributes 
	private String rideId;
	
	private String rideName;
	
	private RideType rideType;
	
	private int dispatchTime;
	
	private int ridersPerDispatch;
	
	// Constructor 
	public Ride(String rideId, String rideName, RideType rideType, int dispatchTime, int ridersPerDispatch) {
		
		this.rideId = rideId;
		
		this.rideName = rideName;
		
		this.rideType = rideType;
		
		this.dispatchTime = dispatchTime;
		
		this.ridersPerDispatch = ridersPerDispatch;
		
	}
}
