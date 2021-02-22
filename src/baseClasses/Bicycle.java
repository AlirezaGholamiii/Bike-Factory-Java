package baseClasses;

public class Bicycle {
	private int cadence;
	private int speed;
	private int gear;
	private String brake;
	private String color;
	
	// Default Constructor
	public Bicycle() {
		this.cadence = 0;
		this.speed = 0;
		this.gear = 0;
		this.brake = "Undefined";
		this.color = "Undefined";
	}
	
	// Fully Parameterized Constructor
	public Bicycle(int cadence, int speed, int gear, String brake, String color) {
		this.cadence = cadence;
		this.speed = speed;
		this.gear = gear;
		this.brake = brake;
		this.color = color;
	}
	
	
	//Methodes//
	// SpeedUp
	public void speedUp(int sp) {
		this.speed = this.speed + sp; 
	}
	
	// SpeedDown
	public void speedDown(int sp) {
		this.speed = this.speed - sp; 
	}
	
	
	// Getters & Setters
	public int getCadence() {
		return cadence;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public String getBrake() {
		return brake;
	}

	public void setBrake(String brake) {
		this.brake = brake;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "This Bicycle has the Cadence of \"" + cadence + "\", Speed of \"" + speed + "\", Gear of \"" + gear + "\", Brake of \"" + brake + "\", and Color of \"" + color + "\"";
	}
	
	
	
	
	
}
