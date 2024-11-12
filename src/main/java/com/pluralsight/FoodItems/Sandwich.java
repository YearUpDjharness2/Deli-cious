package com.pluralsight.FoodItems;

import com.pluralsight.Orders.OrderFood;

import java.util.ArrayList;

public class Sandwich extends OrderFood {
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    private String size;
    private String breadType;
    private ArrayList<String> toppings = new ArrayList<>();
    private String meat;
    private boolean toasted;

    public Sandwich(String size, String breadType, String meat, boolean toasted) {
        super("Sandwich", 0);
        this.size = size;
        this.breadType = breadType;
        this.meat = meat;
        this.toasted = toasted;
        switch (size) {
            case "4\"":
                setPrice(5.50);
                break;
            case "8\"":
                setPrice(7.00);
                break;
            case "12\"":
                setPrice(8.50);
                break;
        }
    }


    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public double calculatePrice() {
        double price = getPrice();

        // Charge extra for each topping
        price += toppings.size() * 0.50;  // Each topping costs $0.50

        return price;
    }


    @Override
    public String toString() {
        StringBuilder sandwichInfo = new StringBuilder();
        sandwichInfo.append("Sandwich: ").append(size).append(" ").append(breadType).append(" bread, ")
                .append(meat).append(" Meat, ").append(toasted ? "Toasted" : "Not Toasted").append("\n");
        sandwichInfo.append("Toppings: ");
        for (String topping : toppings) {
            sandwichInfo.append(topping).append(" ");
        }
        return sandwichInfo.toString().trim();
    }
}

