/*
 * Wayne Chaney
 * Intructor: Amjad Meisam
 * CSE - 174 I
 * September 20, 2019
 * File: Lab4
 * Description: We are using if statments to create diffent tempertures
*/ 

import java.util.Scanner; 
public class Lab4 {
  public static void main(String[] args) {
     
     Scanner input = new Scanner(System.in);
   
   //Define Variables//
   double temperture,fahrenheit, celsius;
   System.out.print("Enter Farhernheit temperture:");
   fahrenheit = input.nextDouble();
   
   celsius = (fahrenheit -32) * 5/9;//Equation for celsius
   

   System.out.printf("%.3f Fahrenheit = %.3f Celsius \n", fahrenheit,celsius);// This is the farhernheit and celsuis
   
    // All of the if Statments
    if (celsius <=0) {
      System.out.print("Solid");
    }
    else if(celsius>=100){
       System.out.print("Gas");
    }
      else{
        System.out.print("Water is liquid");
      }
   
   
   //Final 
   //System.out.printf("Enter Fahrenheit: %.1",fahrenheit);
   
   //System.out.printf("%.3 Farherheit", temperture);
   
 //  System.out.printf("%s");
   
   
   
   
  }}
   
    