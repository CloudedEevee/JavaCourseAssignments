public class DemoBA {

    public static void main(String[] args) {

        ////////////////////////////////////// BankAccounts
        BankAccount acc1 = new BankAccount();


        ////////////////////////////////////// Tests
        System.out.println("\n-----------------Deposit Test-----------------");
        System.out.println("\n----Checking----");
        acc1.deposit("checking", 100);
        acc1.deposit("Checking", 200);
        System.out.println("\n----Savings----");
        acc1.deposit("savings", 300);
        acc1.deposit("Savings", 400);

        System.out.println("\n-----------------Withdrawal Test-----------------");
        System.out.println("\n----Checking----");
        acc1.withdraw("checking", 100);
        acc1.withdraw("Checking", 200);
        acc1.withdraw("Checking", 200);
        System.out.println("\n----Savings----");
        acc1.withdraw("savings", 300);
        acc1.withdraw("Savings", 400);
        acc1.withdraw("Savings", 400);

        System.out.println("\n-----------------Total Balance Test-----------------");
        System.out.println("Total balance: " + acc1.getTotalMoney());
        acc1.deposit("Checking", 200);
        System.out.println("Total balance: " + acc1.getTotalMoney());
        acc1.deposit("savings", 300);
        System.out.println("Total balance: " + acc1.getTotalMoney());
        acc1.withdraw("checking", 100);
        System.out.println("Total balance: " + acc1.getTotalMoney());
        acc1.withdraw("savings", 300);
        System.out.println("Total balance: " + acc1.getTotalMoney());

        System.out.println("\n-----------------Account Num Test-----------------");
        System.out.println("Account Number is: " + acc1.getAccNum());

        System.out.println("\n");
    }

}