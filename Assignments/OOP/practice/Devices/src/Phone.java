
public class Phone extends Device {

	//////////////////////////////////// Member Variables

	//////////////////////////////////// Constructor
	public Phone() {
		super();
	}
	
	//////////////////////////////////// Getters & Setters
	
	//////////////////////////////////// Methods
	public void makeCall() {
		System.out.println("You make a call.");
		super.setBattery(getBattery()-5);
		System.out.println(String.format("Battery remaining: %d \n", this.getBattery()));
		this.checkBatteryCrit();
	}
	
	public void playGame() {
		if (this.getBattery() >= 25) {
			System.out.println("You play a game.");
			super.setBattery(getBattery()-20);
			System.out.println(String.format("Battery remaining: %d \n", this.getBattery()));
			this.checkBatteryCrit();
		}
		else {
			System.out.println("Not enough battery. Please charge. \n");
		}
	}
	
	public void charge() {
		System.out.println("You charge your phone.");
		super.setBattery(getBattery()+50);
		System.out.println(String.format("Battery remaining: %d \n", this.getBattery()));
	}
	
	public void checkBatteryCrit() {
		if (super.getBattery() <= 10) {
			System.out.println("****** Battery critical. Please Charge. ****** \n");
		}
	}
}
