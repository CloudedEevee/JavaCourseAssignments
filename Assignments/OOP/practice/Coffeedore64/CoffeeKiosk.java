import java.util.ArrayList;

public class CoffeeKiosk {

    private ArrayList<Item> menu;
    private ArrayList<Order> orders;
    ////////////////////////////////////// Constructor 
    public CoffeeKiosk() {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }
    ////////////////////////////////////// Getters & Setters
    /////////////////// Getters
    public ArrayList<Item> getMenu() {
        return this.menu;
    }

    public ArrayList<Order> getOrders() {
        return this.orders;
    }

    
    ////////////////////////////////////// Methods
    public void addMenuItem(String itemName, double itemPrice) {
        Item thisItem = new Item(itemName, itemPrice, menu.size());
        this.menu.add(thisItem);
    }
    
    public void displayMenu() {
        for (int i = 0; i < this.getMenu().size(); i++) {
            Item thisItem = this.getMenu().get(i);
            System.out.println(String.format("%d %s -- $%.2f", thisItem.getItemIndex(), thisItem.getItemName(), thisItem.getItemPrice()));
        }
    }
}