package com.pluralsight;

import com.pluralsight.Items.Chips;
import com.pluralsight.Items.Drink;
import com.pluralsight.Items.Sandwich;

import java.util.ArrayList;

public class Order {
    private ArrayList<Sandwich> sandwiches = new ArrayList<>();
    private ArrayList<Drink> drinks = new ArrayList<>();
    private ArrayList<Chips> chips = new ArrayList<>();

    public void addSandwich(Sandwich sandwich){
        sandwiches.add(sandwich);
    }
    public void addDrink(Drink drink){
        drinks.add(drink);
    }
    public void addChips(Chips chip){
        chips.add(chip);
    }
    public double calculateTotal(){
        double total = 0.0;
        for (Sandwich sandwich : sandwiches) total += sandwich.calculateCost();
        for (Drink drink : drinks) total += drink.getCost();
        for (Chips chips : chips) total += chips.getCost();
        return total;
    }
    public void saveReceipt(){

    }
}

