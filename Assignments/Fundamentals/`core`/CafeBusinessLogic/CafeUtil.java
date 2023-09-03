import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {

    public int getStreakGoal(int numWeeks) {
        int drinkSum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            drinkSum += i;
        }
        return drinkSum;
    } 

    public double getOrderTotal(double[] prices) {
        double orderSum = 0;
        for (int i = 0; i < prices.length; i++) {
            orderSum += prices[i];
            System.out.println(orderSum);
        }
        return orderSum;

    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            String thisItem = menuItems.get(i);
            System.out.println(String.format("%s  %s", i, thisItem));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
            // Customer enters name
        System.out.println("Please enter your name:");
        String customerName = System.console().readLine();
            // Customer's name is added to list, greet customer and "process"
        customers.add(customerName);
        System.out.println(String.format("Hello, %s", customerName));
        System.out.println("Processing..........");
            // Check for first person in line, if so say this:
        if (customers.size() == 1) {
            System.out.println("You're the first in line! Thank you for your patience.");
        }
            //If not first in line, say this:
        else if (customers.size() >= 2) {
            System.out.println(String.format("There are %s people ahead of you. Thank you for your patience.", customers.size()));
        }
            // Show the customer names in line (top to bottom, first to last)
        System.out.println("Customers in line:");
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
            // Print product name
        System.out.println(product);
            // Print total if bought in i quantity (up to maxQuantity)
        double total = 0;
        for (int i = 1; i <= maxQuantity; i++) {
            // total is the price by how many, minus $0.50 for every quantity > 1
                // Since we don't want to give a discount to the first item, and i = 1, the $0.50 needs to multiply by i - (the first one) = i-1 
            total = (price * i) - ((i-1) * .5);
            System.out.println(String.format("%d - $%.2f", i, total));
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        }
        else { 
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.println(String.format("%d %s -- $%.2f", i, menuItems.get(i), prices.get(i)));
            }
        }
        return true;
    }

    public void addCustomers() {
        ArrayList<String> customers  = new ArrayList<String> ();
        System.out.println("Please enter the customer names. Enter 'q' when you're done.");
        String customerName = "";
        while (!customerName.equalsIgnoreCase("q")) {
            customerName = System.console().readLine();
            customers.add(customerName);
        }
        System.out.println(String.format("Thank you. Here's the list of entered customers:"));
            // customers' LAST value will be "q", but I don't want that to print. 
        for (int i = 0; i < customers.size() -1; i++) {
                // customers is 0-indexed, so i will +1 in print for human readability. (first = 1 instead of 0)
            System.out.println(String.format("%d  %s", i+1, customers.get(i)));
        }
    }

}