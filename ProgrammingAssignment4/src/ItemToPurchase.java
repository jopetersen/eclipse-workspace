// Creator: Jordan Petersen
// Last modified: 10/9/21

// I had imports here but didn't end up needing them.. so I removed them.

/*Extend the ItemToPurchase class per the following specifications:

Private fields
string itemDescription - Initialized in default constructor to "none"
Parameterized constructor to assign item name, item description, item price, and item quantity 
(default values of 0). (1 pt)
Public member methods
setDescription() mutator & getDescription() accessor (2 pts)
printItemCost() - Outputs the item name followed by the quantity, price, and subtotal
printItemDescription() - Outputs the item name and description
 * 
 * 
 */

// this class is going to be mostly for setter/getter functions

public class ItemToPurchase {
   
	// set private fields per the spec
	
   private String itemName;
   private int itemPrice;
   private int itemQuantity;
   private String itemDescription;
   
   // default constructor
   public ItemToPurchase () {
      itemName = "none";
      itemPrice = 0;
      itemQuantity = 0;
      itemDescription = "none";
   }
   
   // overload constructor
   public ItemToPurchase (String name, String description, int price, int quantity) {
      itemName = name;
      itemPrice = price;
      itemQuantity = quantity;
      itemDescription = description;
   }
   
   
   // setter/getter functions
   public void setDescription(String description) {
      itemDescription = description;
   }
   
   public String getDescription() {
      return itemDescription;
   }
   
   public void printItemCost() {
      System.out.println(itemName + " " + itemQuantity +  " @ $" + itemPrice + " = $" + (itemPrice * itemQuantity));
   }
   
   public void printItemDescription() {
      System.out.println(itemName + ": " + itemDescription);
   }
   
   public void setName(String name) {
      itemName = name;
   }
   
   public String getName() {
      return itemName;
   }
   
   public void setPrice(int price) {
      itemPrice = price;
   }
   
   public int getPrice() {
      return itemPrice;
   }
   
   public void setQuantity(int quantity) {   
      itemQuantity = quantity;
   }
   
   public int getQuantity() {
      return itemQuantity;
   }

}
