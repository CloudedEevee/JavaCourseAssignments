import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
            // create an instance of Random for use in all methods. 
        Random random = new Random();

    public ArrayList<Integer> getTenRolls() {
            // generate and return array with 10 rand num from 1 thru 20
        ArrayList<Integer> tenRandNum = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int randNum = random.nextInt(20) + 1; // +1 makes the inclusive range 1-20 instead of 0-19
            tenRandNum.add(randNum);
        }
        return tenRandNum;
    }

    public char getRandomLetter() {
            // generate array with all 26 letters -- alphabetArray
        char[] alphabetArray = new char[26];
        char letter = 'a';
        for (int i = 0; i < 26; i++) {
            alphabetArray[i] = letter;
            letter++;
        }
            // pull and return one random letter from alphabetArray
        int randIndex = random.nextInt(26); // actual inclusive range: 0-25, 26 chars total
        return alphabetArray[randIndex];
    }

    public String generatePassword() {
        // use getRandomLetter to create rand 8-char string
        String[] letters = new String[8];
        char thisLetter;
        for (int i = 0; i < 8; i++) {
            thisLetter = getRandomLetter(); // getRandomLetter returns a char, cannot .join char - only string. 
            letters[i] = "" + thisLetter; // convert char thisLetter to String by concat with empty string ("") and assign to proper index. 
        }
        return String.join("", letters);
    }

    public ArrayList<String> getNewPasswordSet(int arrayLen) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for (int i = 0; i < arrayLen; i++) {
            String thisPassword = generatePassword();
            passwordSet.add(thisPassword);
        }
        return passwordSet;
    }

    // public String[] shuffleArray(ArrayList<String> givenArrayList) {
    //         // find given array length
    //     int arrayLen = givenArrayList.size();
    //         // 

    // }

}