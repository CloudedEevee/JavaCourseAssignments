
public class Device {
	//////////////////////////////////// Member Variables
	private int battery;

	//////////////////////////////////// Constructor
	public Device() {
		this.battery = 100;
	}

	//////////////////////////////////// Getters & Setters
	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	//////////////////////////////////// Methods
	public int lifeLeft() {
		return this.getBattery();
	}
	
	
}
