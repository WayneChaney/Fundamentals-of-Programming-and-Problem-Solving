/*
 * CSE - 174 Lab3
 * Author: Wayne 
 * Instuctor: Meisam Amjad
 * 09/13/2019
 * File: Lab3
 * Description: making a Description on a person with grades
 */
import java.util.Scanner; 
public class lab3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);//inputting the scanner 
    
    //Defining all variables in project 
    String firstName, fullName, lastName;
    String phoneNumber, numberOutput;
    double maximum, median, minimum, average;
    double score1, score2, score3;
    
    // getting the first and last name of the person and makeing it all capital
    System.out.println("Enter your first and last name");
    firstName = input.next();
    lastName = input.next();
    fullName = (firstName.toUpperCase() + " " + lastName.substring(0,1).toUpperCase());
    
    
    
// Get the phone number and putting it in the right format 
    
    System.out.println("Enter the phone number in this format (___) ___-___ :");
    phoneNumber= input.next();
    numberOutput= phoneNumber.substring(5,8) + phoneNumber.substring(9,13);
    
    
    //Get Scoring Average
    //doing all the callculation you need for project
    System.out.println("Enter 3 scores : ");
    score3 = input.nextDouble();
    score2 = input.nextDouble();
    score1 = input.nextDouble();
    maximum = Math.max(score1, Math.max(score2, score3));
    minimum = Math.min(score1, Math.min(score2, score3));
    median = score1 + score2 + score3 -maximum-minimum;
    
    average = (score1 + score2 + score3)/ 3;
    
    
    //Final part of lab
    // putting everything together.
    System.out.println("Name : "+ fullName);
    System.out.println("Phone : " + numberOutput);
    System.out.printf("Average = %.2f.%n",average);
    System.out.printf("Maximum = %.2f.%n", + maximum);
    System.out.printf("Median = %.2f.%n", + median);
    System.out.printf("Minimum = %.2f.%n", + minimum);
    
    
  }}
