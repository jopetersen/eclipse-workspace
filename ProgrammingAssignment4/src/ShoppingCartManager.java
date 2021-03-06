// Creator: Jordan Petersen
// Last modified: 10/9/21


// prompt the user for a customer's name and today's date. Output the name and date. 
//Create an object of type ShoppingCart. (1 pt)
/*(4) Implement the printMenu() method. printMenu() has a ShoppingCart parameter, and outputs a menu of options to manipulate the shopping cart. Each option is represented by a single character. Build and output the menu within the method.

If the an invalid character is entered, continue to prompt for a valid choice. 
Hint: Implement Quit before implementing other options. Call printMenu() in the main() method. 
Continue to execute the menu until the user enters q to Quit. (3 pts)
 * 
 * 
 */
import java.util.Scanner;


public class ShoppingCartManager {
   
   public static Scanner scnr = new Scanner(System.in);
   
   // write printMenu, which displays the primary output (with instructions) to the console
   public static void printMenu (ShoppingCart cart) {
      
      
      System.out.println("\nMENU");
      System.out.println("a - Add item to cart");
      System.out.println("d - Remove item from cart");
      System.out.println("c - Change item quantity");
      System.out.println("i - Output items\' descriptions");
      System.out.println("o - Output shopping cart");
      System.out.println("q - Quit\n");
      
   }
   
   public static void main(String[] args) {
      
      char inputChoice;
      
      // prompt the user for their name, today's date.
      
      System.out.println("Enter Customer's Name:");
      String name = scnr.nextLine();
      
      System.out.println("Enter Today's Date:");
      String date = scnr.nextLine();
      
      ShoppingCart cart = new ShoppingCart(name, date);
      
      System.out.println("\nCustomer Name: " + cart.getCustomerName());
      System.out.println("Today's Date: " + cart.getDate());
      
      // create a new item object
      ItemToPurchase item = new ItemToPurchase();
      
      // print the options input while asking the user to navigate through the menu
      do {
         
         printMenu(cart);
         
         do {
            
            System.out.println("Choose an option:");
            inputChoice = scnr.next().charAt(0);
      
            // create a condition to reloop if there is an invalid input
         } while ((inputChoice != 'a') && (inputChoice != 'o') && (inputChoice != 'i') && (inputChoice != 'd') && (inputChoice != 'c') && (inputChoice != 'q'));
         
         
         // use a switch statement to more easily write different user inputs to navigate
         switch (inputChoice) {
            
         
         // quit
            case 'q':
               break;
              
         // add items
            case 'a':
               System.out.println("ADD ITEM TO CART");
               
               System.out.println("Enter the item name:");
               String itemName = scnr.next() + scnr.nextLine();
               item.setName(itemName);
               itemName = item.getName();
               
               System.out.println("Enter the item description:");
               String itemDescription = scnr.nextLine();
               item.setDescription(itemDescription);
               itemDescription = item.getDescription();
               
               System.out.println("Enter the item price:");
               int itemPrice = scnr.nextInt();
               item.setPrice(itemPrice);
               itemPrice = item.getPrice();
               
               System.out.println("Enter the item quantity:");
               int itemQuantity = scnr.nextInt();
               item.setQuantity(itemQuantity);
               itemQuantity = item.getQuantity();
               
               ItemToPurchase addItem = new ItemToPurchase(itemName, itemDescription, itemPrice, itemQuantity);
               cart.addItem(addItem);
               continue;
            
               // print shopping cart
            case 'o':
               cart.outputCart();
               continue;
              
               
               //output item descriptions
            case 'i':
               cart.printDescriptions();
               continue;
               
            // remove
               
            case 'd':
               System.out.println("REMOVE ITEM FROM CART");
               System.out.println("Enter name of item to remove:");
               String rName = scnr.next() + scnr.nextLine();
               cart.removeItem(rName);
               continue;
             
               // change item quantity
               
            case 'c':
               System.out.println("CHANGE ITEM QUANTITY");
               System.out.println("Enter the item name:");
               String cName = scnr.next() + scnr.nextLine();
               System.out.println("Enter the new quantity:");
               int cQuan = scnr.nextInt();
               cart.modifyItem(item, cName, cQuan);
               continue;
               
            default:
               continue;
               
         }
         
      } while (inputChoice != 'q');
      
   }
   
}
