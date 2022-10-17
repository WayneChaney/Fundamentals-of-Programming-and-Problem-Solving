/* 
 * Wayne Chaney
 * CSE 174 - I 
 * Mesiam Amjad
 * La10
 * November 1st, 2019
 * Decription: Testing Arrays
 */

import java.util.Scanner;
public class Program10{
  static int size = 0;
  static Scanner in = new Scanner(System.in);
  public static void main(String[] args){
    
    int input =1;
    while (input != 4) {
      input = start();
  
    
      switch(input) {// main method calling all the methods needed for the program
        case 1:// alternating sum method
          System.out.println("** alternatingSum **");
          System.out.printf("The result is: %d \n\n" ,alternatingSum());
          break;
          
        case 2://reverse method
          System.out.println("** reverse **");
          int[] reverse1 = reverse();
          System.out.print("The reverse array is: ");
              for(int game : reverse1)
        System.out.print(game + " ");
              System.out.println("");
                 System.out.println("");
          
          break;
        
        case 3: //the run method
          
          Run();
          break;
          
        case 4:// EXIT
          
          break;
      }
    }
    
    
  }
  public static int[] getValue() {// first method to get the numbers

    
    System.out.printf("How many integer values:");
    size = in.nextInt();
    while(size <1){
      System.out.printf("Invalid input!\n",size); 
      System.out.printf("How many integer values:");
      size = in.nextInt();
    }
    int[] numbers = new int[size];// how big the array will be
    
    System.out.printf("Enter the numbers: ");
    for (int i = 0; i < numbers.length; ++i)
      numbers[i] = in.nextInt();// telling user to put the numbers in 
    
    
    return numbers;// return the numbers in the array
  }
  public static int alternatingSum() {
    
    int sum=0;
    //System.out.println("** alternatingSum **");
    int[] numbers = getValue();//calling the method

    for(int i = 0; i < size; i++){// index is even add it 
      int index = 0;
      if(i % 2 ==0)
        sum = sum + numbers[i]; 
      else if(i % 2 !=0)
        sum= sum - numbers[i];//index is odd subtract it 
    }
       
    //System.out.printf("\nThe result is: %d \n",sum); 

    return sum; // return the sum
  }
  
  public static int[] reverse() {
    //System.out.println("** reverse **");

    int[] j = {};
    int[] numbers = getValue();// calling the method
    int[] reverse = new int [size];// making reverse equal size of array
    for( int i= 0; numbers.length > i; i++){
      reverse[i] = numbers[numbers.length-(i+1)];//putting each number in the other array
    }
   
       return reverse;//return the reverse

  }
  public static void Run() {
  boolean  not=false;// all intialized varablies
int amount= 20;
int count=0;
int count1=0;
int maxStart=0;
int start=0;
int maxFinal=0;
int final2=0;
int var=0;
int check=12;
int[] together = new int [amount];
    for(int i = 0; i < amount; i++)
      together[i] = (int)(Math.random() * 6 + 1);//index of each number
    for(int i = 0; i < amount; i++){
      if(together [i] == check){// checking to see if its= to the number in the last index
       if (var==0)// make sure it wasnt 0 the first time it ran through
       start = i-1;
       var = 1;
      final2=i;
      count++; 
      }
      else{
      count=0;// resetting the count
      var=0;
      }
    if(count > count1){// if count was greater than put then variables change
      maxStart = start;
    maxFinal = final2;
    count1=count;
    
      }
      check=together[i];
    }
      System.out.println("** run **");
          System.out.println("The sequence of numbers is:");// printing out each statment 
      for(int j=0; j < together.length; j++){
      if(j == maxStart)
        System.out.print("(");// printing the ( in 
      if(j != maxFinal)
         System.out.print(together[j] + " ");
      
        else
          System.out.print(together[j] + ") ");// putting the ) in 
      }     
        System.out.printf("\n\n");// needed this for the spacing
    }  
  
  public static void display(int[] numbers) {// extra method to check my work just to display the numbers 
    System.out.println("the Numbers are:");
    for(int number: numbers) {
      System.out.print(number + " ");
    }
  }
  public static int start() { // start of the program. this is the begining of the method
    
    System.out.println("PROGRAM#10");
    System.out.println("1- alternatingSum");
    System.out.println("2- reverse");
    System.out.println("3- Run");
    System.out.println("4- Exit");
    System.out.print("Enter a number[1-4]:");
    int input = in.nextInt();
    while(input < 1|| input > 4){
      System.out.println("Invalid input!");
      System.out.print("Enter a number[1-4]:");
      input = in.nextInt();// the input of the program
    }
    return input;// return the input
    
    
  }    
  
  
  
  
  
  
}
