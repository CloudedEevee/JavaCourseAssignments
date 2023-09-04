import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();

        System.out.println("\n\n----- Ten Rolls Test -----");
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
        System.out.println("\n----- Letter Test -----");
		System.out.println(generator.getRandomLetter());

        System.out.println("\n----- Pasword Test -----");
		System.out.println(generator.generatePassword());

        System.out.println("\n----- Pasword SET Test -----");
		System.out.println(generator.getNewPasswordSet(5));
		System.out.println(generator.getNewPasswordSet(5));
		System.out.println(generator.getNewPasswordSet(5));

        // System.out.println("\n----- Shuffle Array Test -----");
		// System.out.println(generator.shuffleArray());


        System.out.println("\n");
	}
}
