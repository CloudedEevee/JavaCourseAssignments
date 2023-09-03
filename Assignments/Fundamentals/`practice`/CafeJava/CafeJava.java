public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables
        double mochaPrice = 3.50;
        double dripCoffeePrice = 1.75;
        double lattePrice = 4.00;
        double cappuccinoPrice = 3.50;

        // Customer name variables
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION
        // Cindhuri's Order
        System.out.println("****************"); 
        System.out.println(generalGreeting + customer1); 
        System.out.println(customer1 + pendingMessage); 
        System.out.println(customer1 + readyMessage); 
        System.out.println(displayTotalMessage + dripCoffeePrice); 
        System.out.println("****************"); 

        // Noah's Order
        System.out.println("****************"); 
        System.out.println(generalGreeting + customer4); 
        System.out.println(customer4 + pendingMessage); 
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage); 
            System.out.println(displayTotalMessage + cappuccinoPrice); 
        }
        System.out.println("****************"); 

        //Sam's Order
        System.out.println("****************"); 
        System.out.println(generalGreeting + customer2); 
        System.out.println(customer2 + pendingMessage); 
        System.out.println(displayTotalMessage + (lattePrice + lattePrice)); 
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage); 
        }
        System.out.println("****************"); 

        // Jimmy's Order Change
        System.out.println("****************"); 
        System.out.println(generalGreeting + customer3); 
        System.out.println(customer3 + pendingMessage); 
        System.out.println(customer3 + readyMessage); 
        System.out.println(displayTotalMessage + (lattePrice - dripCoffeePrice)); 
        System.out.println("****************"); 
    }
}