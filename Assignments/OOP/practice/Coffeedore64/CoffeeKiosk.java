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

    public void newOrder() {
        // create the order
        System.out.println("Please enter the name for the order or 'q' for a guest order:"); // Ask order name
        String name = System.console().readLine(); // recvd order name
            // create order using order name
            if (!name.equalsIgnoreCase("n")) {
                this.getOrders().add(new Order(name));
            }
            else {
                this.getOrders().add(new Order());
            }
        // fill out the order
            // show the menu
        this.displayMenu();
        System.out.println("Please enter a menu item index, or 'q' to quit");
        String itemIndexNum = "";
        int thisOrderIndex = (this.getOrders().size()) - 1;
        while (!itemIndexNum.equalsIgnoreCase("q")) {
            itemIndexNum = System.console().readLine();
            try {
                if (itemIndexNum.equalsIgnoreCase("q")) {
                    break;
                }
                else if (Integer.parseInt(itemIndexNum) >= 0) {
                    Item thisAddItem = this.getMenu().get(Integer.parseInt(itemIndexNum));
                    this.getOrders().get(thisOrderIndex).addItem(thisAddItem);
                    System.out.println(String.format("Added %s", thisAddItem.getItemName()));
                    continue;
                }
                else{
                    System.out.println("Please enter a menu item index, or 'q' to quit");
                    continue;
                }
                
            }
            catch (NumberFormatException | IndexOutOfBoundsException e){
                System.out.println("Please enter a menu item index, or 'q' to finish");
                continue;
            }
        }
        if (this.getOrders().get(thisOrderIndex).getItems().size() > 0) {
            System.out.println(String.format("Your order is processing... Total is: $%.2f.", this.getOrders().get(thisOrderIndex).getOrderTotal()));
        }
        System.out.println(String.format("Thank you for using Coffeedore 64. Please come again soon."));
    }

        


}