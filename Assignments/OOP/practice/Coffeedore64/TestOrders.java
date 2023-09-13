import java.util.ArrayList;

public class TestOrders {

    public static void main(String[] args) {
        ////////////////////////////////////// Application Simulations
        CoffeeKiosk kiosk1 = new CoffeeKiosk();
        System.out.println("\n-----------------Add Menu Item Tes-----------------");
        kiosk1.addMenuItem("Mocha", 3.5);
        kiosk1.addMenuItem("Latte", 4.00);
        kiosk1.addMenuItem("Drip Coffee", 1.75);
        kiosk1.addMenuItem("Cappuccino", 3.5);
        
        System.out.println("\n-----------------Display Menu Test-----------------");
        kiosk1.displayMenu();

        System.out.println("\n");
    }

}

