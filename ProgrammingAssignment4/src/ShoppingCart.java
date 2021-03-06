/* Creator: Jordan Petersen
 * Last modified: 10/9
 * 
 * specifications:Private fields

String customerName - Initialized in default constructor to "none"
String currentDate - Initialized in default constructor to "January 1, 2016"
ArrayList cartItems
Default constructor

Parameterized constructor which takes the customer name and date as parameters (1 pt)

Public member methods

getCustomerName() accessor (1 pt)
getDate() accessor (1 pt)
addItem()
Adds an item to cartItems array. Has parameter ItemToPurchase. Does not return anything.
removeItem()
Removes item from cartItems array. Has a string (an item's name) parameter. Does not return anything.
If item name cannot be found, output this message: Item not found in cart. Nothing removed.
modifyItem()
Modifies an item's description, price, and/or quantity. Has parameter ItemToPurchase. Does not return anything.
If item can be found (by name) in cart, check if parameter has default values for description, price, and quantity. If not, modify item in cart.
If item cannot be found (by name) in cart, output this message: Item not found in cart. Nothing modified.
getNumItemsInCart() (2 pts)
Returns quantity of all items in cart. Has no parameters.
getCostOfCart() (2 pts)
Determines and returns the total cost of items in cart. Has no parameters.
printTotal()
Outputs total of objects in cart.
If cart is empty, output this message: SHOPPING CART IS EMPTY
printDescriptions()
Outputs each item's description.
 * 
 * 
 */

import java.util.ArrayList;

public class ShoppingCart {
   
   //Private fields per spec
   
   private String customerName;
   private String currentDate;
   
   //create an arraylist called cartMItemsbecause we need it to be dynamically allocated
   private ArrayList<ItemToPurchase>cartItems = new ArrayList<ItemToPurchase>();
   
   //Default constructor
   
   // creare a default constructor
   public ShoppingCart() {
      customerName = "none";
      currentDate = "January 1, 2016";
   }
   
   // overload constructor
   public ShoppingCart(String name, String date) {
      customerName = name;
      currentDate = date;
   }
   
   //Public member methods
   
   // get methods
   public String getCustomerName() {
      return customerName;
   }
   
   public String getDate() {
      return currentDate;
   }
   
   
   // create an append-like function
   public void addItem(ItemToPurchase item) {
      cartItems.add(item);
   }
   
   // remove item method
   public void removeItem(String name) {
      
      int flag = 0;
      
      // write a for loop that removes a given item at index i
      
      for (int i = 0; i < cartItems.size(); i++) {
         if (cartItems.get(i).getName().equals(name)) {
            cartItems.remove(i);
            flag = 1;
         }
      }
      if (flag == 0) { // if there's nothing in the cart, return a statement
         System.out.println("Item not found in cart. Nothing removed.");
      }
   }
   
   // create a method that changes price or quantity
   public void modifyItem(ItemToPurchase item, String name, int quantity) {
      
      int flag = 0;
      
      for (int i = 0; i < cartItems.size(); i++) {
         
         if (cartItems.get(i).getName().equals(name)) {
            
            item.setQuantity(quantity);
            System.out.println(item.getQuantity());
            
            // create a new objectfrom the old one but modified
            ItemToPurchase newItem = new ItemToPurchase(name, cartItems.get(i).getDescription(), cartItems.get(i).getPrice(), quantity);
            
            cartItems.set(i, newItem);
            
            flag = 1;
            break;
         }
      }
      if (flag == 0) { // if there's nothing left in the cart.. do this
         System.out.println("Item not found in cart. Nothing modified.");
      }
   }
   
   
   // display the items that are in a cart
   public int getNumItemsInCart() { 
      
      int numItems = 0;
      
      if (cartItems == null) {
         return numItems;
      }
      
      for (int i = 0; i < cartItems.size(); i++) {
         numItems = numItems + cartItems.get(i).getQuantity();
      }
      
      return numItems;
   }
   
   // write a loop that sums the total cost of the items in the cart, given price
   public int getCostOfCart() {
      
      if (cartItems == null) {
         return 0;
      }
      
      int totalCost = 0;
      int cost = 0;
      
      for (int i = 0; i < cartItems.size(); i++) {
         cost = ((cartItems.get(i).getPrice()* cartItems.get(i).getQuantity()));
         totalCost = totalCost + cost;
      }
      return totalCost;
   }
   
   // now that we've done the calculation, we need to print the cost
   
   public void printTotal() {
      
      int totalCost = getCostOfCart();
      
      if (totalCost == 0) {
         System.out.println("SHOPPING CART IS EMPTY\n");
         System.out.println("Total: $" + totalCost);
      }
      else {
         System.out.println("Total: $" + totalCost);
      }
      
   }
   
   // print how many items/descriptors are in the cart.
   public void printDescriptions() {
      
      System.out.println("OUTPUT ITEMS\' DESCRIPTIONS");
      
      System.out.println(getCustomerName() + "\'s Shopping Cart - " + getDate());
      
      System.out.println("\nItem Descriptions");
      
      for (int i = 0; i < cartItems.size(); i++) {
         System.out.println(cartItems.get(i).getName() + ": " + cartItems.get(i).getDescription());
      }
      
   }
   // create a method to print out all of the contents of the cart
   
   public void outputCart() {
      
      System.out.println("OUTPUT SHOPPING CART");
      
      System.out.println(getCustomerName() + "\'s Shopping Cart - " + getDate());
      
      System.out.println("Number of Items: " + getNumItemsInCart());
      
      // loop that prints out/iterates through the cart & prints everything out.
      for (int i = 0; i < cartItems.size(); i++) {
         if (i == 0) {
            System.out.println();
         }
         System.out.println(cartItems.get(i).getName() + " " + cartItems.get(i).getQuantity() + " @ $" + cartItems.get(i).getPrice() + " = $" + (cartItems.get(i).getPrice() * cartItems.get(i).getQuantity()));
      }
      
      System.out.println();
      
      printTotal();
      
   }
   
}
