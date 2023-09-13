class Item {
    private String name;
    private double price;
    private int index;
    ////////////////////////////////////// Constructor 
    public Item(String name, double price, int index) {
        this.name = name;
        this.price = price;
        this.index = index;
    }
    ////////////////////////////////////// Getters & Setters
    /////////////////// Getters
    public String getItemName() {
        return this.name;
    }

    public double getItemPrice() {
        return this.price;
    }

    public int getItemIndex() {
        return this.index;
    }
    /////////////////// Setters
    public void setItemName(String name) {
        this.name = name;
    }

    public void setItemPrice(double price) {
        this.price = price;
    }

    public void setItemIndex(int index) {
        this.index = index;
    }

}