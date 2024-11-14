package com.pluralsight.FoodItems;

import com.pluralsight.Orders.OrderFood;
import java.util.ArrayList;

public class Sandwich extends OrderFood{
    private String size; // Size of the sandwich
    private String breadType; // Type of bread
    private ArrayList<String> toppings = new ArrayList<>(); // List of toppings
    private String meat; // Meat type
    private boolean toasted; // Whether the sandwich is toasted or not
    private String cheese; // Cheese type
    private boolean extraCheese; // Whether extra cheese is selected
    private boolean extraMeat; // Whether extra meat is selected

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
            default:
                setPrice(7.00);
                break;
        }
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    @Override
    public double calculatePrice() {
        double price = getPrice();

        double meatPrice = 0.0;
        switch (size) {
            case "4\"":
                meatPrice = 1.00;
                break;
            case "8\"":
                meatPrice = 2.00;
                break;
            case "12\"":
                meatPrice = 3.00;
                break;
        }
        price += meatPrice;

        if (extraMeat) {
            switch (size) {
                case "4\"":
                    price += 0.50;
                    break;
                case "8\"":
                    price += 1.00;
                    break;
                case "12\"":
                    price += 1.50;
                    break;
            }
        }

        double cheesePrice = 0.0;
        if (cheese != null) {
            switch (size) {
                case "4\"":
                    cheesePrice = 0.75;
                    break;
                case "8\"":
                    cheesePrice = 1.50;
                    break;
                case "12\"":
                    cheesePrice = 2.25;
                    break;
            }
            price += cheesePrice;
        }

        // Charge for extra cheese
        if (extraCheese) {
            switch (size) {
                case "4\"":
                    price += 0.30;
                    break;
                case "8\"":
                    price += 0.60;
                    break;
                case "12\"":
                    price += 0.90;
                    break;
            }
        }

        return price;
    }


    @Override
    public String toString() {
        StringBuilder sandwichDescription = new StringBuilder();
        sandwichDescription.append("Sandwich: ").append(size).append("\n")
                .append("Bread Type: ").append(breadType).append("\n")
                .append("Meat Type: ").append(meat).append("\n")
                .append(toasted ? "Toasted" : ",Not Toasted").append("\n");


        if (cheese != null) {
            sandwichDescription.append("Cheese: ").append(cheese).append("\n");
        }

        if (extraCheese) {
            sandwichDescription.append("Extra Cheese: ").append(extraCheese).append("\n");;
        }

        if (extraMeat) {
            sandwichDescription.append("Extra Meat: Yes\n");
        }

        sandwichDescription.append("Toppings: ");
        for (String topping : toppings) {
            sandwichDescription.append(topping).append(" ");
        }

        return sandwichDescription.toString().trim();
    }


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

}
