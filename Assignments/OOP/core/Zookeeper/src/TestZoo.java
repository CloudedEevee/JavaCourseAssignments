
public class TestZoo {

	public static void main(String[] args) {
		//////////////////////////////////// Gorilla
		Gorilla g = new Gorilla();
		
		g.throwSomething();
		g.throwSomething();
		g.throwSomething();
		
		g.eatBananas();
		g.eatBananas();
		
		g.climb();
		
		//////////////////////////////////// Bat
		Bat b = new Bat();
		
		b.attackTown();
		b.attackTown();
		b.attackTown();
		
		b.eatHumans();
		b.eatHumans();
		
		b.fly();
		b.fly();
	}

}
