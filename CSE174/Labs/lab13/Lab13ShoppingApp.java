import java.util.*;

/**
 * Wayne Chaney 
 * CSE 174 F
 * \
 * Shopping Cart Application Template
 * Complete the missing code in the program
 */
public class Lab13ShoppingApp {
   static Scanner in = new Scanner(System.in);
   /* main method */
   public static void main(String[] args) {
      //create cart object with the capacity of 10 orders
      ShoppingCart cart = new ShoppingCart(10);
      
      boolean exit = false;// need this for exit
      
      while(!exit) {
         char op = menu();//menu
         
         switch (op) {
            case 'A': 
               cart.addOrder(readOrderFromKeyboard());//calling addOrder method
               break;
            case 'B': 
              cart.listOrders();//call the cart method
               //TODO - step2
               //Method call for listing orders in the cart
               break;
            case 'C': 
                  cart.listOrders();//call the cart method
                  System.out.printf("Total: $%.2f",cart.getBill());//using percent f to make the 2 digit after number.
                  System.out.printf("\nAre you sure(yes/no)");
                    if(in.next().equals("yes")){
                  cart = new ShoppingCart(10);//new cart
                      System.out.print("Done");
                      
                       }
          
               //TODO
               //Method call for listing orders in the cart
               //Method call for billing orders in the cart
               break;
            case 'X': 
              System.out.printf("\nAre you sure(yes/no)");
                    if(in.next().equals("yes"));{//are you sure.
                      exit = true;}//end loop
               //TODO
               //Code for exit
               break;
            default: System.out.println("Wrong Option"); //incorrect reloop
         }
      }
   }
   
   /**
    * prints a menu and returns a chosen option.
    * @return char The chosen option from the menu.
    */ 
   public static char menu() {//menu
      Scanner keyboard = new Scanner(System.in);
      System.out.println("\nShopping Cart App");//user input
      System.out.println("\tA. Add an item to the Shopping Cart");//user input
      System.out.println("\tB. List items in the Shopping Cart");//user input
      System.out.println("\tC. Pay the bill");//user input
      System.out.println("\tX. Exit");//user input
      System.out.println();
      System.out.print("Option:"); 
      
      return keyboard.next().toUpperCase().charAt(0);//first letter
   }
   
   
   public static Order readOrderFromKeyboard() {
 
     
    System.out.printf("***Enter the Details:\n");
    System.out.printf("  Bar Code:");//bar code 
  int barCode =  in.nextInt();
    System.out.printf("\n      Name:");//name 
  String name=  in.next();
    System.out.printf("\n     Units:");//units
   int units= in.nextInt();
    System.out.printf("\nUnit Price:");//price
   double price = in.nextDouble();
    
      //TODO - step1
      // You need to complete this method.
      // When you are done get rid of the return null line
      // since that line is just there to prevent 
      // compile errors.
      
      return new Order(barCode,name,units,price);//retruning barcode name and units and price.
   }
}
