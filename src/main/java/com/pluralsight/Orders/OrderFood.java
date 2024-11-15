package com.pluralsight.Orders;
public abstract class OrderFood {
    private String name;
    private double price;
    public OrderFood(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public abstract double calculatePrice();
    @Override
    public String toString() {
        return name + ": $" + price;
    }
    public void addSauce() {
    }
}
