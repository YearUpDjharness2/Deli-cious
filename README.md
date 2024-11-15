# Deli-cious
This project is the point of sales application for DELI-cious, a custom sandwich
shop. Currently at DELI-cious our customers can fully customize their sandwich
orders. Until recently we have been managing all orders in person and are
currently taking all orders on paper. But our business is growing, and we need a
way to automate the order process (and eventually even make it available
online).
This application takes full advantage of Object Oriented Analysis and
Design Create classes and interfaces as necessary to build this solution.

 ![image](https://129757024.cdn6.editmysite.com/uploads/1/2/9/7/129757024/s841251545676646705_p36_i1_w399.png)

# Code Summary
## The Main class
The Main Class starts the program and calls UserInterface.displayHomeScreen(),
which shows a menu and processes the user's choice, such as creating a sandwich or exiting.


## The UserInterface
The UserInterface class serves as the main entry point for an interactive sandwich shop ordering system.
It guides users through creating a new order, adding sandwiches, drinks, and chips, and customizing items with options like size, toppings, and flavors.
Users can view their current order, calculate the total cost, and save a receipt at checkout. The class, handles invalid inputs, and 
integrates with other components like Order and Receipts.

## The Order class
The Order Class manages a collection of food items (such as Sandwich, Chips, and Drink) for a customer's order. 
It contains an ArrayList<OrderFood> to store these items and provides methods to add items and calculate the total price of the order.
 The addItem method allows adding an OrderFood item (like a Sandwich, Chips, or Drink) to the list. 
The calculateTotal method iterates through each item in the order and sums up their individual prices by calling each item’s calculatePrice method.
 The toString method generates a formatted summary of the order, listing each item’s details and the total price.
 Also, there’s a getItems method to retrieve the list of items in the order. 

  ## The Receipts class
  The Receiptes class provides a utility method, saveReceipt, for saving receipts to text files. When saveReceipt is called with a
 receipt string, it checks if a receipts directory exists; if not, it creates one.
 A filename is generated based on the current date and time in the format yyyyMMdd-HHmmss.txt, making sure each receipt is saved with
 a distinct timestamp. The method then writes the receipt content to a new file within the receipts folder.
 If there’s an error during this process, it catches the exception and outputs an error message.

  ## The OrderFood class
  The OrderFood is an abstract base class for food items in an order (e.g., Sandwich, Chips, Drink).
 It includes fields for the name and price of the item, which are initialized by the constructor and can be accessed
 or modified using getter and setter methods. The class defines an abstract method, calculatePrice, which requires each
 subclass to provide its own implementation to calculate the item's price, allowing customization or variations.
 The toString method returns a simple string representation of the item (e.g., "Sandwich: $5.50").


  ## The Chips class
  The Chips Class extends the OrderFood class,
 representing a type of food item with a fixed name ("Chips") and price ($1.50)
 set through the superclass constructor. It overrides the getPrice method to return this fixed price and provides
 a toString method to display the item’s name and price in a formatted string (e.g., "Chips: $1.50").
 

## The Drink class
The Drink Class extends OrderFood, representing a customizable drink item with attributes for size (e.g., Small, Medium, Large)
 and flavor (e.g., Cola, Lemonade, Water). The constructor initializes the Drink object with a name ("drink"),
 base price (2.50), size, and flavor, and then calls setPriceBasedOnSize to adjust the price based on the chosen size.
 This setPriceBasedOnSize method sets the price to $2.00 for Small, $2.50 for Medium, and $3.00 for Large.
The toString method provides a formatted string showing the drink's name, size, flavor, and price.
 The class also includes getters and setters for size and flavor.


## The Sandwich class
The Sandwich Class, which extends OrderFood, represents a customizable sandwich item with various attributes,
 such as size (4", 8", or 12"), breadType, meat, toppings, cheese, and options for extra cheese or extra meat.
 The constructor initializes the sandwich's size, bread type, meat type, and toasted status, setting the base price based on the size.
 The calculatePrice method then calculates the total price by adding the base price and additional costs for meat, cheese, extra meat, and extra cheese,
 depending on the sandwich size. The toString method returns a formatted description of the sandwich,
 including all chosen attributes like size, bread type, toppings, and extras.
 This class also provides getters and setters for each attribute, allowing for further customization.


![image](https://github.com/user-attachments/assets/4bc15151-9fba-46af-9a9d-0347a1a46bd0)

## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/YearUpDjharness2/Deli-cious)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](www.linkedin.com/in/davidharness
)



## License

[MIT](https://choosealicense.com/licenses/mit/)

