
public class Mammal {
	//////////////////////////////////// Member Variables
	private int energy;
	
	//////////////////////////////////// Constructor
	public Mammal() {
		this.energy = 100;
	}
	
	public Mammal(int energy) {
		this.energy = energy;
	}
	
	//////////////////////////////////// Getters & Setters
	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	//////////////////////////////////// Methods
	public void displayEnergy() {
		System.out.println("Energy remaining:" + this.getEnergy());
	}
	
	public boolean isEnergyGone() {
		boolean isEnergyGone = false;
		if (this.getEnergy() == 0) {
			isEnergyGone = true;
		}
		return isEnergyGone;
	}
	

	
	
	
}
