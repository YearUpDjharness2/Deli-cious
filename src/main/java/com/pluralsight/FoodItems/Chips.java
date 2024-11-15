package com.pluralsight.FoodItems;
import com.pluralsight.Orders.Order;
import com.pluralsight.Orders.OrderFood;
public class Chips extends OrderFood {
    public Chips(String chipType) {
        super("Chips", 1.50);  // Chips cost $1.50
    }
    @Override
    public double getPrice() {
        return super.getPrice();
    }
    @Override
    public double calculatePrice() {
        return 0;
    }
    @Override
    public String toString() {
        return getName() + ": $" + getPrice();
    }

}