package baseClasses;

public class MotorBike extends Bicycle{

	private String type;
	private float engine;
	private int gasTank;
	private String exhaust;
	private int horsePower;
	
	
	// Default Constructor
		public MotorBike() {
			this.engine = 0;
			this.gasTank = 0;
			this.horsePower = 0;
			this.type = "Undefined";
			this.exhaust = "Undefined";
			
		}
	
	// Fully Parameterized Constructor
	public MotorBike(int cadence, int speed, int gear, String brake, String color, String suspension, int tierSize,String type, float engine, int gasTank, int horsePower, String exhaust) 
	{
		super(cadence,speed, gear, brake, color);
		this.type = type;
		this.engine = engine;
		this.gasTank = gasTank;
		this.horsePower = horsePower;
		this.exhaust = exhaust;
	}

	
	//Getter And Setter For MotorBike Variables
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getEngine() {
		return engine;
	}

	public void setEngine(float engine) {
		this.engine = engine;
	}

	public int getGasTank() {
		return gasTank;
	}

	public void setGasTank(int gasTank) {
		this.gasTank = gasTank;
	}

	public String getExhaust() {
		return exhaust;
	}

	public void setExhaust(String exhaust) {
		this.exhaust = exhaust;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	//Methods
	public void incresehorsePower(int hp)
	{
		this.horsePower = this.horsePower + hp; 
	}
	public void decresehorsePower(int hp)
	{
		this.horsePower = this.horsePower - hp; 
	}
	
	
	public void increseEngineSize(float Lit)
	{
		this.engine = this.engine + Lit; 
	}
	public void decreseEngineSize(float Lit)
	{
		this.engine = this.engine - Lit; 
	}

	@Override
	public String toString() {
		return "MotorBike [type=" + type + ", engine=" + engine + ", gasTank=" + gasTank + ", exhaust=" + exhaust
				+ ", horsePower=" + horsePower + "]";
	}
	
	
	
	
	
	
}
