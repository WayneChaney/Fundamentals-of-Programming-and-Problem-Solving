/*
 * Name: Wayne Chaney 
 * Intructor: Meisam Amjad
 * CSE 174, Section I
 * Date: 09/16/2019
 * Filename: IntGenerator.java
 * Description: Generator number
 */
import java.util.Scanner; // this has to be in the system in order to get a scanner

public class IntGenerator{ // name of the class.
  public static void main(String[ ] args ) {
    
    
    String even;//String name
    int numBer1,numBer2,big;// namming interger
    
    numBer1 = 50 + (int)(Math.random()*(100-50+1));// Do the mininmum and the maximum
    even =(numBer1 % 2== 0) ? "EVEN!" : "ODD!"; //Determind if number is even or odd
    
    
    System.out.printf("The generated number is %d and it is %s \n", numBer1, even); // This is the print statement
    
  }}