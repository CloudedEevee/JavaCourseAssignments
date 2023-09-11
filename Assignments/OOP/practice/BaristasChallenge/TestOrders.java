import java.util.ArrayList;

public class TestOrders {

    public static void main(String[] args) {
        ////////////////////////////////////// Items
        Item mocha = new Item("Mocha", 3.5);

        Item latte = new Item("Latte", 4.00);

        Item dripCoffee = new Item("Drip Coffee", 1.75);

        Item cappuccino = new Item("Cappuccino", 3.5);

        ////////////////////////////////////// Application Simulations
        // +2 Guest orders
        Order guest1 = new Order();
        Order guest2 = new Order();

        // +3 Orders with names
        Order billyOrder = new Order("Billy");
        Order ciriOrder = new Order("Ciri");
        Order meowdalynOrder = new Order("Meowdalyn");

        // Check all methods: 
        // addItem, terminal test in display
        billyOrder.addItem(mocha);
        billyOrder.addItem(dripCoffee);

        ciriOrder.addItem(cappuccino);
        ciriOrder.addItem(cappuccino);

        meowdalynOrder.addItem(cappuccino);
        meowdalynOrder.addItem(mocha);

        guest1.addItem(latte);
        guest1.addItem(dripCoffee);

        guest2.addItem(dripCoffee);
        guest2.addItem(mocha);

        // getStatusMessage
        System.out.println("\n-----------------Get Status Message Test-----------------");
        System.out.println(ciriOrder.getStatusMessage());
        System.out.println("\n-----------------Status Change Test-----------------");
        ciriOrder.setReadyTrue();
        System.out.println(ciriOrder.getStatusMessage());

        

        // getOrderTotal
        System.out.println("\n-----------------Get Order Total Test-----------------");
        System.out.println(String.format("Your total: $%.2f", billyOrder.getOrderTotal()));

        //display
        System.out.println("\n-----------------Display Test-----------------");
        billyOrder.display();
        System.out.println("\n");

        ciriOrder.display();
        System.out.println("\n");

        meowdalynOrder.display();
        System.out.println("\n");

        guest1.display();
        System.out.println("\n");

        guest2.display();

        System.out.println("\n");
    }

}

