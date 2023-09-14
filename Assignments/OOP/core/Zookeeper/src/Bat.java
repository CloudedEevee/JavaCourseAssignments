
public class Bat extends Mammal {
	//////////////////////////////////// Constructor
	public Bat() {
		super(300);
	}

	public Bat(int energy) {
		super(energy);
	}
	//////////////////////////////////// Methods
	public void fly() {
		if (!this.isEnergyGone()) {
			this.setEnergy(getEnergy()-50);
			System.out.println("Flying....");
			System.out.println("Energy is now at " + this.getEnergy());			
		}
		else {
			System.out.println("Not enough energy");

		}
	}

	public void attackTown() {
		if (!this.isEnergyGone()) {
			this.setEnergy(getEnergy()-100);
			System.out.println("Attacking Town....");
			System.out.println("Energy is now at " + this.getEnergy());			
		}
		else {
			System.out.println("Not enough energy");
			
		}
	}
	
	public void eatHumans() {
			this.setEnergy(getEnergy()+25);
			System.out.println("Eating human....");
			System.out.println("Energy is now at " + this.getEnergy());			
	}
	
	
	
}
