
public class Gorilla extends Mammal {
	//////////////////////////////////// Constructor
	public Gorilla() {
		super();
	}

	public Gorilla(int energy) {
		super(energy);
	}

	//////////////////////////////////// Methods
	public void throwSomething() {
		if (!this.isEnergyGone()) {
			this.setEnergy(getEnergy()-5);
			System.out.println("Throwing something....");
			System.out.println("Energy is now at " + this.getEnergy());
		}
		else {
			System.out.println("Not enough energy");

		}
	}
	
	public void climb() {
		if (!this.isEnergyGone()) {
			this.setEnergy(getEnergy()-10);
			System.out.println("Climbing a tree....");
			System.out.println("Energy is now at " + this.getEnergy());			
		}
		else {
			System.out.println("Not enough energy");
		}
	}	

	public void eatBananas() {
			this.setEnergy(getEnergy()+10);
			System.out.println("Eating bananas....");
			System.out.println("Energy is now at " + this.getEnergy());			
	}
	

	
}
