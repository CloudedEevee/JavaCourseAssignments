class Item {
    private String name;
    private double price;
    ////////////////////////////////////// Constructor 
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    ////////////////////////////////////// Getters & Setters
    /////////////////// Getters
    public String getItemName() {
        return this.name;
    }

    public double getItemPrice() {
        return this.price;
    }
    /////////////////// Setters
    public void setItemName(String name) {
        this.name = name;
    }

    public void setItemPrice(double price) {
        this.price = price;
    }

}