import java.util.Random;
public class NumbersGame {
    public static void main(String[] args){
        boolean playAgain = true;
        while(playAgain) {
            System.out.println("Hello, human. I am thinking of a number between 0 and 10.");
            System.out.println("*********************************************************");
            System.out.println("You have 3 tries. Can you guess the number? ");
            System.out.println("If you are not up to the task, you can always type 'q' to quit.");
            int answer = new Random().nextInt(0,10);
            int numOfGuesses = 1;
            boolean hasQuit = false;
            //Play game
            while(numOfGuesses <= 3){
                String guess = System.console().readLine();
                try {
                    if(guess.equals("q")){
                        System.out.println("I knew you didn't have it in you.");
                        hasQuit = true;
                        break;
                    }
                    if(Integer.parseInt(guess) > 10 || Integer.parseInt(guess) < 0) {
                        System.out.println("The number is between 0 and 10!");
                        numOfGuesses++;
                        continue;
                    }
                    if(Integer.parseInt(guess)==answer){
                        System.out.println("Lucky guess! But can you do it again?");
                        break;
                    }
                    else if (numOfGuesses == 1){
                        System.out.println("Swing and a miss! Keep trying...");
                        numOfGuesses++;
                        continue;
                    }
                    else if (numOfGuesses == 2){
                        System.out.println("Miss again! One more try...");
                        numOfGuesses++;
                        continue;
                    }
                    else if (numOfGuesses == 3){
                        System.out.println("Oof... Couldn't do it, huh? Try again next time.");
                        break;
                    }
                    
                }
                catch (NumberFormatException error){
                    System.out.println("Please enter a number between 0 and 10 to guess or 'q' to quit.");
                }
            }
            // Play again?
            if (hasQuit) {
                playAgain = false;
                break;
            }
            else {
                System.out.println("Would you like to play again? y or n?");
                String playAgainYN = System.console().readLine();
                if (!playAgainYN.equalsIgnoreCase("y") && !playAgainYN.equalsIgnoreCase("yes") ) {
                    playAgain = false;
                }
            }
        }
        System.out.println("Game over. Shutting down...");
    }
}

