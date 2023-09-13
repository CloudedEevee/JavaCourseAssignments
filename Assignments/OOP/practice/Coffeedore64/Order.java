import java.util.ArrayList;

class Order {

    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items;
    ////////////////////////////////////// Constructor 
    public Order() {
        this.name = "Guest";
        this.total = 0;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    ////////////////////////////////////// Class Methods
    public String getStatusMessage() {
        boolean isReady = this.checkReady();
        if (isReady) {
            return "Your order is ready!";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        double orderTotal = 0;
        for (int i = 0; i < this.getItems().size(); i++) {
            orderTotal += this.items.get(i).getItemPrice();
        }
        return orderTotal;
    }

    public void display() {
        System.out.println(String.format("Customer Name: %s", this.name));
        for (int i = 0; i < this.items.size(); i++) {
            System.out.println(String.format("%s: $%.2f", this.items.get(i).getItemName(), this.items.get(i).getItemPrice()));
        }
        System.out.println(String.format("Total: $%s", this.getOrderTotal()));
    }


    ////////////////////////////////////// Getters & Setters
    /////////////////// Getters
    public String getOrderName() {
        return this.name;
    }

    public boolean checkReady() {
        return this.ready;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }


    /////////////////// Setters
    public void setOrderName(String name) {
        this.name = name;
    }

    public void setReadyTrue() {
        this.ready = true;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

}