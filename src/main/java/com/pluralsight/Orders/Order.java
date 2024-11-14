
package com.pluralsight.Orders;

import com.pluralsight.FoodItems.Sandwich;
import com.pluralsight.FoodItems.Chips;
import com.pluralsight.FoodItems.Drink;
import java.util.ArrayList;

public class Order {
    private ArrayList<OrderFood> items;  // List to store the order items (Sandwiches, Chips, Drinks)

    // Constructor to initialize the order with an empty list
    public Order() {
        items = new ArrayList<>();
    }

    // Method to add an item (Sandwich, Chips, Drink) to the order
    public void addItem(OrderFood item) {
        items.add(item);
    }

    // Calculate the total price of the order
    public double calculateTotal() {
        double total = 0.0;
        for (OrderFood item : items) {
            total += item.calculatePrice(); // Calls the specific item's calculatePrice method
        }
        return total;
    }

    // Method to return a summary of the order
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

    // Getter for the items list
    public ArrayList<OrderFood> getItems() {
        return items;
    }
}