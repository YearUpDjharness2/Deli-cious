
package com.pluralsight.Orders;
import com.pluralsight.FoodItems.Sandwich;
import com.pluralsight.FoodItems.Chips;
import com.pluralsight.FoodItems.Drink;
import java.util.ArrayList;
public class Order {
    private ArrayList<OrderFood> items;
    public Order() {
        items = new ArrayList<>();
    }
    public void addItem(OrderFood item) {
        items.add(item);
    }
    public double calculateTotal() {
        double total = 0.0;
        for (OrderFood item : items) {
            total += item.calculatePrice();
        }
        return total;
    }
    @Override
    public String toString() {
        StringBuilder orderSummary = new StringBuilder();
        orderSummary.append(" -------------- Your Order: -------------\n");
        for (OrderFood item : items) {
            orderSummary.append(item.toString()).append("\n"); // Prints each item's details
        }
        orderSummary.append("---------------Total: $").append(calculateTotal()).append(" ---------------"); // Adds the total price
        return orderSummary.toString();
    }
    public ArrayList<OrderFood> getItems() {
        return items;
    }
}