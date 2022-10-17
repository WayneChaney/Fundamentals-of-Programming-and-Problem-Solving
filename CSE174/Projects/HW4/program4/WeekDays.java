/*
 * Name: Wayne Chaney 
 * Intructor: Meisam Amjad
 * CSE 174, Section F
 * Date: 09/20/2019
 * Filename: WeekDays.java
 * Description: Weekdays in Java
 */
import java.util.Scanner; // this has to be in the system in order to get a scanner


public class WeekDays{ // name of the class.
  public static void main(String[ ] args ) {
    
    Scanner input = new Scanner(System.in);//Importing the scanners
    
    String weekDays =  "SunMonTueWedThuFriSat";//String 
    
    int firstChar, day;//Defining the interger
    
    
    System.out.print("Enter a number (0-6):");//statment user needs 
    day = input.nextInt();//give the user the right value
    
    firstChar = 3 * day;//giveing the int a value
    
    //Final Product
    System.out.printf("** %d is %s ** \n", day, weekDays.substring(firstChar, firstChar + 3));//The last statment needed
    
  }}