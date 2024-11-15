package com.pluralsight.FoodItems;
import com.pluralsight.Orders.Order;
import com.pluralsight.FoodItems.Sandwich;
import com.pluralsight.FoodItems.Chips;
import com.pluralsight.FoodItems.Drink;
import com.pluralsight.Orders.OrderFood;
import java.util.Scanner;
public class Drink extends OrderFood {
    private String size;
    private String flavor;
    public Drink(String size, String flavor) {
        super("Drink",2.50);
        this.size = size;
        this.flavor = flavor;
        setPriceBasedOnSize(size);
    }
    private void setPriceBasedOnSize(String size) {
        if (size.equals("Small")) {
            this.setPrice(2.00);
        } else if (size.equals("Medium")) {
            this.setPrice(2.50);
        } else if (size.equals("Large")) {
            this.setPrice(3.00);
        }
    }
    @Override
    public double calculatePrice() {
        double price = 0;
        return price;
    }
    @Override
    public String toString() {
        return super.toString() + "\nSize: " + size + "\nFlavor: " + flavor + "\nPrice: $" + calculatePrice();
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
        setPriceBasedOnSize(size);
    }
    public String getFlavor() {
        return flavor;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
