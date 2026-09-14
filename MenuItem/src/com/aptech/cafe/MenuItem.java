package com.aptech.cafe;

public class MenuItem {
    public static final double TAX_RATE = 0.08;
    private static int itemsOnMenu = 0;

    private final String name;
    private final double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
        itemsOnMenu++;
    }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public double priceWithTax() { return price * (1 + TAX_RATE); }
    
    public static int getItemsOnMenu() { return itemsOnMenu;}
    
    @Override
    public String toString() {
        return String.format("%-16s $%6.2f  (with tax $%6.2f)", name, price, priceWithTax());
        
    }
}
