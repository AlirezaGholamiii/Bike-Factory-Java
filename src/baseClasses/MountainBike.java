package baseClasses;

public class MountainBike extends Bicycle {
	
	private String suspension;
	private int tierSize;
	
	
	// Default Constructor
		public MountainBike() {
			
			this.tierSize = 0;
			this.suspension = "Undefined";
			
		}
	// Fully Parameterized Constructor
	public MountainBike(String serialNumber,int cadence, int speed, int gear, String brake, String color, String suspension, int tierSize) {
		super(serialNumber,cadence,speed, gear, brake, color);
		this.suspension = suspension;
		this.tierSize = tierSize;
	}

	// Getters & Setters
	public String getSuspension() {
		return suspension;
	}

	public void setSuspension(String suspension) {
		this.suspension = suspension;
	}

	public int getTierSize() {
		return tierSize;
	}

	public void setTierSize(int tierSize) {
		if (tierSize < 10) {
			System.out.println("Mountain Bike's Tier Size CANNOT Be Under 10!!\nYou've Entered \"" + tierSize + "\"");
		} else {
			System.out.println("Mountain Bike's Tier Size Updated To " + tierSize);
			this.tierSize = tierSize;
		}
		//this.tierSize = tierSize;
	}

	@Override
	public String toString() {
		return "\nMountainBike [serialNumber=" + getSerialNumber() + ", cadence=" + getCadence() + ", speed=" + getSpeed() + ", gear=" + getGear()
				+ ", brake=" + getBrake() + ", color=" + getColor() +  "suspension=" + suspension + ", tierSize=" + tierSize + "]";
	}
	
	
	
}
