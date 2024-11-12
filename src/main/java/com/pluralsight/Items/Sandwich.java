package com.pluralsight.Items;

import java.util.ArrayList;

public class Sandwich {
    private String size;
    private String breadType;
    private ArrayList<Topping> toppings = new ArrayList<>();
    private boolean toasted;

    public Sandwich(String size, String breadType, boolean toasted){
        this.size = size;
        this.breadType = breadType;
        this.toasted = toasted;
    }
    public void addTopping(Topping topping){
        toppings.add(topping);
    }
    public double calculateCost(){
        double baseCost = getBaseCost();
        double toppingsCost = 0.0;
        for (Topping topping : toppings){
            toppingsCost += topping.getCost(size);
        }
        return baseCost + toppingsCost;
    }
    private double getBaseCost(){
        switch (size){
            case "4)": return 5.50;
            case "8)": return 7.00;
            case "12)": return 8.50;
            default: return 0.0;
        }
    }
}
