import java.util.ArrayList;

public class TestOrders {

    public static void main(String[] args) {
        ////////////////////////////////////// Items
        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = 3.50;

        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = 4.00;

        Item item3 = new Item();
        item3.name = "Drip Coffee";
        item3.price = 1.75;

        Item item4 = new Item();
        item4.name = "Cappuccino";
        item4.price = 3.50;


        ////////////////////////////////////// Orders
        Order order1 = new Order();
        order1.name = "Cindhuri";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";


        ////////////////////////////////////// Application Simulations
        // Jimmy ordered a Mocha
        order2.items.add(item1);
        order2.total += item1.price;

        // Noah ordered a Cappuccino
        order3.items.add(item4);
        order3.total += item4.price;

        // Sam ordered a Latte
        order4.items.add(item2);
        order4.total += item2.price;

        // Cindhuri's order is now ready
        order1.ready = true;

        // Sam added 2 Lattes to their order
        order4.items.add(item2);
        order4.total += item2.price;
        order4.items.add(item2);
        order4.total += item2.price;

        // Jimmy's order is now ready
        order2.ready = true;
    }

}

