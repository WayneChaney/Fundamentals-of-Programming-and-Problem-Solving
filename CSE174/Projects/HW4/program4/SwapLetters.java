/*
 * Name: Wayne Chaney 
 * Intructor: Meisam Amjad
 * CSE 174, Section I
 * Date: 09/20/2019
 * Filename: SwapLetters.java
 * Description: moving letter around in java
 */
import java.util.Scanner; // Swapping letters in java 

public class SwapLetters{ // name of the class.
  public static void main(String[] args ) {
    
    Scanner in = new Scanner(System.in);
    
    String word, first, middle, last;// getting the strings together
    int i, j;//getting intergers
    
    
    System.out.print("Enter a word:");//setence to put down
    word = in.next();// interger to put in
    
    
    System.out.print("Enter two values for i and j between(0-6):");//statement user reads 
    i = in.nextInt();//input from user
    j = in.nextInt();//second input from user 
    
    
    first = word.substring(0, i); //formula for problem
    middle= word.substring(i+1, j); //formulas for middle 
    last= word.substring(j+1, word.length());//last formula
    
    
    //Finish product
    System.out.printf("** ");//statment that need to be printed
    System.out.printf(first + word.charAt(j) + middle + word.charAt(i) + last);//final task to get finish product
    System.out.printf(" ** \n");//statement that need to be printed
  }
}