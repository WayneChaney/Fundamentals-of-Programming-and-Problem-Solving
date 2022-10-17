/* 
 * Wayne Chaney
 * CSE 174 - I 
 * Mesiam Amjad
 * La10
 * November 1st, 2019
 * Decription: Testing Arrays
 */
import java.util.Scanner;
public class Lab10{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);//Scanner 
    
    System.out.print("How many random numbers do you want to generate?");
    int amount = in.nextInt();//how many numbers
    System.out.printf("What is the number of values for each random draw?");
    int size = in.nextInt();//inputs
    int[] together = new int [size];
    for(int i = 0; i < amount; i++){
      int index = (int)(Math.random() * size);//index of each number
      together[index]++;//each number 
      
      
    }
    
    
    int max =Integer.MIN_VALUE;//how get max value
      int min =Integer.MAX_VALUE;//how to get min value
    for(int i = 0; i < size; i++){//loop for values
      //comparing max an min values
      if(together[i] > max)
        max = together[i];
      if(together[i] < min) 
        min = together[i];
    }
    int difference = max - min;//getting the difference in each value
    for(int i = 0; i < size; i++){
      System.out.printf("%d %d\n", i, together[i]);//print statment
      
      
      
    }
     System.out.printf("The max difference = %d\n",difference);//final statement
    
    
  }
}