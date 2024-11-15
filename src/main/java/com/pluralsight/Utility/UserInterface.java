package com.pluralsight.Utility;

import com.pluralsight.Orders.Order;
import com.pluralsight.FoodItems.Sandwich;
import com.pluralsight.FoodItems.Chips;
import com.pluralsight.FoodItems.Drink;
import java.util.Scanner;

public class UserInterface {
    private static Scanner scanner = new Scanner(System.in);
    private static Order currentOrder = new Order();

    public static void main(String[] args) {
        displayHomeScreen();
    }

    public static void displayHomeScreen() {
        System.out.println("====== Welcome to DELI-CIOUS! ======");
        System.out.println("To Start a New Order Press (1)");
        System.out.println("Press (0) to Exit");
        int choice = getUserChoice();

        if (choice == 1) {
            startNewOrder();
        } else if (choice == 0) {
            System.out.println("Goodbye!!!!");
            System.exit(0);
        } else {
            System.out.println("=====Invalid choice, please try again.=====");
            displayHomeScreen();
        }
    }
    public static void startNewOrder() {
        currentOrder = new Order();
        displayOrderScreen();
    }
    public static void displayOrderScreen() {
        System.out.println("===Current Order:===");
        System.out.println(currentOrder);
        System.out.println("=== 1.) Add Sandwich ===");
        System.out.println("=== 2.) Add Drink ===");
        System.out.println("=== 3.) Add Chips ===");
        System.out.println("=== 4.) Checkout ===");
        System.out.println("=== 0.) Cancel Order ===");
        int choice = getUserChoice();
        switch (choice) {
            case 1:
                addSandwich();
                break;
            case 2:
                addDrink();
                break;
            case 3:
                addChips();
                break;
            case 4:
                checkout();
                break;
            case 0:
                cancelOrder();
                break;
            default:
                System.out.println("=== Invalid choice, please try again. ===");
                displayOrderScreen();
                break;
        }
        switch (choice) {
            case 1 -> addSandwich();
            case 2 -> addDrink();
            case 3 -> addChips();
            case 4 -> checkout();
            case 0 -> cancelOrder();
            default -> {
                System.out.println("=== Invalid choice, please try again. ===");
                displayOrderScreen();
            }
        }
    }
    public static void addSandwich() {
        Sandwich sandwich = createSandwich();
        currentOrder.addItem(sandwich);
        System.out.println("--- Your sandwich has been added. ---");
        displayOrderScreen();
    }
    public static Sandwich createSandwich() {
        System.out.println("Select sandwich size:");
        System.out.println("1.) 4\" ($5.50)\n2.) 8\" ($7.00)\n3.) 12\" ($8.50)");
        int sizeChoice = getUserChoice();
        String size = switch (sizeChoice) {
            case 1 -> "4\"";
            case 2 -> "8\"";
            case 3 -> "12\"";
            default -> "8\"";
        };
        System.out.println("--- Select bread type: ---");
        System.out.println("1.) White\n2.) Wheat\n3.) Rye\n4.) Wrap");
        int breadChoice = getUserChoice();
        String bread = switch (breadChoice) {
            case 1 -> "White";
            case 2 -> "Wheat";
            case 3 -> "Rye";
            case 4 -> "Wrap";
            default -> "White";
        };

        System.out.println("--- Select your meat: (4inch +$1.00, 8inch +$2.00, 12inch +$3.00) ---");
        System.out.println("1.) Turkey\n2.) Chicken\n3.) Ham\n4.) Roast Beef\n5.) Veggie");
        int meatChoice = getUserChoice();
        String meat = switch (meatChoice) {
            case 1 -> "Turkey";
            case 2 -> "Chicken";
            case 3 -> "Ham";
            case 4 -> "Roast Beef";
            case 5 -> "Veggie";
            default -> "Turkey";
        };
        System.out.println("--- you want your sandwich toasted? ---");
        System.out.println("1.) Yes\n2.) No");
        int toastedChoice = getUserChoice();
        boolean toasted = toastedChoice == 1;
        Sandwich sandwich = new Sandwich(size, bread, meat, toasted);


        System.out.println("Do you want extra meat? (4inch +$.50, 8inch +$1.00, 12inch +$1.50)");
        System.out.println("1. Yes\n2. No");
    int extraMeatChoice = getUserChoice();
        sandwich.setExtraMeat(extraMeatChoice == 1);


        System.out.println("Select cheese type (or select (0) for no cheese):");
        System.out.println("1. American\n2. Provolone\n3. Cheddar\n4. Swiss\n0. No Cheese");
    int cheeseChoice = getUserChoice();
        if (cheeseChoice != 0) {
        String cheese = switch (cheeseChoice) {
            case 1 -> "American";
            case 2 -> "Provolone";
            case 3 -> "Cheddar";
            case 4 -> "Swiss";
            default -> "American";
        };
        sandwich.setCheese(cheese);
    }


        System.out.println("Do you want extra cheese? (4inch +$.30, 8inch +$.60, 12inch +$.90)");
        System.out.println("1.) Yes\n2.) No");
    int extraCheeseChoice = getUserChoice();
        sandwich.setExtraCheese(extraCheeseChoice == 1);

    addToppings(sandwich);
        return sandwich;
}
    public static void addToppings(Sandwich sandwich) {
        System.out.println("--- Select toppings & Sauces --- (press (0) to stop)");
        System.out.println("TOPPINGS:\n1.)Lettuce\n2.)Tomato\n3.)Pickles\n4.)Onion\nSAUCES:\n" +
                "5.)Mayo\n6.)Mustard\n7.)Ketchup\n8.)Ranch\n9.)Thousand Island\n ");
        int toppingChoice;
        while ((toppingChoice = getUserChoice()) != 0) {
            switch (toppingChoice) {
                case 1 -> sandwich.addTopping("Lettuce");
                case 2 -> sandwich.addTopping("Tomato");
                case 3 -> sandwich.addTopping("Pickles");
                case 4 -> sandwich.addTopping("Onion");
                case 5 -> sandwich.addTopping("Mayo");
                case 6 -> sandwich.addTopping("Mustard");
                case 7 -> sandwich.addTopping("Ketchup");
                case 8 -> sandwich.addTopping("Ranch");
                case 9-> sandwich.addTopping("Thousand Islands");
                default -> System.out.println("Invalid choice.");
            }
            System.out.println("Add another topping or press (0) to stop");
        }
    }


    public static void addDrink() {
        System.out.println("--- Select drink size: ---");
        System.out.println("1.) Small($2.00)\n2.) Medium($2.50)\n3.) Large($3.00)");
        int sizeChoice = getUserChoice();
        String size = switch (sizeChoice) {
            case 1 -> "Small";
            case 2 -> "Medium";
            case 3 -> "Large";
            default -> "Medium";
        };
        System.out.println("--- Select flavor: ---");
        System.out.println("1.) Coca-Cola\n2.) Lemonade\n3.) Water");
        int flavorChoice = getUserChoice();
        String flavor = switch (flavorChoice) {
            case 1 -> "Coca-Cola";
            case 2 -> "Lemonade";
            case 3 -> "Water";
            default -> "Coca-Cola";
        };
        Drink drink = new Drink(size, flavor);
        currentOrder.addItem(drink);
        System.out.println("Your drink has been added.");
        displayOrderScreen();
    }
    public static void addChips() {
        System.out.println("--- Select chip type: ($1.50) ---");
        System.out.println("1.) Plain\n2.) Kettle-Cooked\n3.) BBQ");
        int chipChoice = getUserChoice();
        String chipType = switch (chipChoice) {
            case 1 -> "Plain";
            case 2 -> "Kettle-Cooked";
            case 3 -> "BBQ";
            default -> "Plain";
        };
        Chips chips = new Chips(chipType);
        currentOrder.addItem(chips);
        System.out.println("Your chips have been added.");
        displayOrderScreen();
    }

    public static void checkout() {
        String receipt = "--- Your order has been placed! ---\n" + currentOrder.toString();
        Receipts.saveReceipt(receipt);
        System.out.println(receipt);
    }
    public static void cancelOrder() {
        currentOrder = new Order();
        System.out.println("--- Your order has been canceled. ---");
        displayHomeScreen();
    }
    public static int getUserChoice() {
        return scanner.nextInt();
    }
}