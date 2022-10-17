/*
 * Lab 6
 * Wayne Chaney
 * Instructor:
 * MethodTestLab.java
 * October 4th, 2019
 * practicing methods and case methods
 */

import java.util.Scanner;

public class MethodTestLab {
  public static void main(String[] args) {
    // Declaring variables
    int userChoice;// first user input
    String str;//Strings
    int num;// Intergers 
    Scanner input = new Scanner(System.in);//Scanner to have inputs
    
    //Display menu
    System.out.printf("Menu\n1.hasX\n2.big2Digits\n" +
                      "3.loneSum\n4.average\n");// where the user choses which one they want
    
    //Read user's choice
    System.out.printf("Enter your choice");
    userChoice = input.nextInt();//choice
    
    //Invoke methods
    switch(userChoice) { 
      case 1:
        //This is written for you as an example
        System.out.printf("\nGiven a string, return true if there is any 'x' "+
                          "in the string.\n");
        System.out.printf("Enter a String: ");
        str = input.next();
        
        //hasX method is invoked. 
        System.out.println(hasX(str));//calling the method so that you can get that output
        
        break;// finish with that case
        
      case 2:
        //write your code here
        System.out.printf("\nGiven a 3 digit interger, return true if the first digit is greater than last digit otherwise,false.\n");
        System.out.printf("Enter a 3 Digit Interger: ");
        num = input.nextInt();// user enters 3 digit number
        System.out.print(big2Digits(num));//calling the method so that you can get that output
        
        break;// finish with that case
        
        
      case 3:
        System.out.printf("\nGiven 3 int values, a b c, return their sum. However, if one of the values is the same as another\nof the values, it does not count towards the sum.\n");
        System.out.printf("Enter a 3 Intergers: ");
        int one = input.nextInt();//user enters integer
        int second = input.nextInt();//user enters integer
        int three = input.nextInt();//user enters integer
        System.out.println(loneSum(one , second , three));//calling the method so that you can get that output
        
        break;// finish with that case
        
        //write your code here
        
      case 4:
        System.out.printf("\nGiven three numbers, return the average of those numbers.\n");
        System.out.printf("Enter a 3 Intergers: ");
        int first = input.nextInt();//user enters integer
        int two = input.nextInt();//user enters integer
        int third = input.nextInt();//user enters integer
        System.out.println(average(first , two , third));//calling the method so that you can get that output
        break;
        
        
      default: 
        System.out.println("Invalid Choice");
    }   
    System.out.println("\n**End**");
    
  }//end of main()
  
  //----- Complete the method stubs here....
  
  public static boolean hasX(String s) {
    int value = s.indexOf('x');//character needed
    if (value == -1)//-1 because that is if there us no x in there
      return false;  
    else 
      return true;//if x then will print ture
  }
  
  public static boolean big2Digits(int num) {
    
    int firstDigit = (num / 100);//divided int by 100 becasue it will give the first digit out
    int lastDigit = (num % 10); //mod 10 because will give the last digit in 3 digit number
    if (firstDigit > lastDigit)// if ture than will print ture 
      return true;
    else
      return false;//will print false
    
  }
  
  public static int loneSum(int num1, int num2, int num3) {
    if (num1 == num2 && num2 == num3 && num3 == num1) //if all number equal each other than wont count the number 
      return 0;// will give 0
    else if (num1 == num2)//if these equal each other than will only print one number
      return num3;
    else if (num1 == num3)//if these equal each other than will only print one number
      return num2;
    else if (num2 == num3)//if these equal each other than will only print one number
      return num1;
    else 
      return (num1+ num2 + num3);//if none equal than will add all 
    
  }
  
  public static double average(int num1, int num2, int num3) {
    
    return((num1 + num2 + num3)/3.0);// will give double answers of numbers.
    
  }
}
