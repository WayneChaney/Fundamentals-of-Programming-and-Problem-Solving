/*
 * Name: Wayne Chaney 
 * Intructor: Meisam Amjad
 * CSE 174, Section I
 * Date: 09/20/2019
 * Filename: DonutBoxes.java
 * Description: Donut Boxes 
 */

// Test case: 
// These work correctly :0,12,24,27,48,60,97,144,2048,400,1000,10000
// These do not work:All work
import java.util.Scanner; // this has to be in the system in order to get a scanner



public class DonutBoxes{ // name of the class.
  public static void main(String[ ] args ) {
   Scanner input = new Scanner(System.in);//importing sanner 100
   
      int donuts,boxes;//Intergers 
      
    System.out.printf("How many donuts?");//First statement
    
      donuts = input.nextInt();//where the user puts in donuts 
      boxes = (donuts % 12 == 0) ? donuts/12 : (donuts/12 +1);//boxes equation
      System.out.printf("You will need %d boxes for the donuts. \n", boxes);//statment getting printed
    
    
    
    
  }}