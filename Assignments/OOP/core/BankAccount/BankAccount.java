import java.util.ArrayList;
import java.util.Random;

public class BankAccount {

    ////////////////////////////////////// Member Variables
    private String accountNum;
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney; // sum of all bank account balances

    ////////////////////////////////////// Constructor
    public BankAccount() {
        this.accountNum = this.createAccNum();
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        this.accounts = 0;
        this.totalMoney = 0;
    }

    ////////////////////////////////////// Getters
    public String getAccNum() {
        return this.accountNum;
    }
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public int getNumAccounts() {
        return this.accounts;
    }

    public double getTotalMoney() {
        double totalMoney = this.getCheckingBalance() + this.getSavingsBalance();
        return totalMoney;
    }


    ////////////////////////////////////// Methods
    public void deposit(String accountType, double inAmt) {
        double cBal = this.getCheckingBalance();
        double sBal = this.getSavingsBalance();
        if (accountType.equalsIgnoreCase("checking")){
            this.checkingBalance = cBal + inAmt;
            this.totalMoney = this.getTotalMoney() + inAmt;
            System.out.println(String.format("Depositing $%.2f into your Checking Account. Balance is now: $%.2f.", inAmt, this.getCheckingBalance()));
        }
        else if (accountType.equalsIgnoreCase("savings")){
            this.savingsBalance = sBal + inAmt;
            this.totalMoney = this.getTotalMoney() + inAmt;
            System.out.println(String.format("Depositing $%.2f into your Savings Account. Balance is now: $%.2f.", inAmt, this.getSavingsBalance()));
        }
        else {
            System.out.println("Please submit Checking or Savings.");
        }
    }

    public void withdraw(String accountType, double outAmt) {
        double cBal = this.getCheckingBalance();
        double sBal = this.getSavingsBalance();
        if (accountType.equalsIgnoreCase("checking")){
            if (cBal- outAmt < 0) {
                System.out.println("Insufficient funds.");
            }
            else {
                this.checkingBalance = cBal - outAmt;
                this.totalMoney = this.getTotalMoney() - outAmt;
                System.out.println(String.format("Withdrawing $%.2f from your Checking Account. Balance is now: $%.2f.", outAmt, this.getCheckingBalance()));
            }
        }
        else if (accountType.equalsIgnoreCase("savings")){
            if (sBal- outAmt < 0) {
                System.out.println("Insufficient funds.");
            }
            else {
                this.savingsBalance = sBal - outAmt;
                this.totalMoney = this.getTotalMoney() - outAmt;
                System.out.println(String.format("Withdrawing $%.2f from your Savings Account. Balance is now: $%.2f.", outAmt, this.getSavingsBalance()));
            }
        }
        else {
            System.out.println("Please submit Checking or Savings.");
        }
    }

    /////////////////// Create accountNum
    private String createAccNum() {
            // Create alphaNum ArrayList to pull from
        ArrayList<String> alphaNumArr =  new ArrayList<String>();
                //add letters
        char letter = 'a';
        for (int i = 0; i < 26; i++) {
            alphaNumArr.add("" + letter);
            letter++;
        }
                //add 0-9 (incl.)
        for (int i = 0; i < 10; i++) {
            alphaNumArr.add("" + i);
        }
            // create Random instance
        Random random = new Random();
            // pull from alphaNumArr, add to accountNumArr
        ArrayList<String> accountNumArr =  new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            int randIndex = random.nextInt(alphaNumArr.size());
            accountNumArr.add(alphaNumArr.get(randIndex));
        }
        return String.join("", accountNumArr);
    }


}