/* 
 * Wayne Chaney
 * CSE 174 - I 
 * Mesiam Amjad
 * Program11
 * November 6th, 2019
 * Decription: Lockers
 */

import java.util.Scanner;
public class Program11{
  
  static Scanner in = new Scanner(System.in);
  static int num;
  public static void main(String[] args){//Could not get main under 12 but every other method is under12 lines.Go to many errors, I even made extra methods to shorten
    String games = "y";//yes continue
    boolean[] printing = new boolean[0];
       while(games.equals("y")){   //loop 
    System.out.print("Number of lockers:");
    num = in.nextInt();//how many lines
       if (num < 3){
        System.out.println("invalid input");
  continue;//go through loop
      }
      if(num > 2){
    System.out.print("Show Stages [y/n]?");//question if they want to see what happened
      }
       String show = in.next();
    if (show.equals("y")){
      
      printing= loop(num);//show the work
            showLocks(printing);//show thee work
      games = Last();//games is the output of the last method
      }
    else {
        printing = nShow(num);//show the work
      showLocks(printing);//show thee work
       games = Last();//games is the output of the last method
    }
      }
  System.out.println("End");
  }
  public static boolean[] arrayMaker(int input) {//boolean array
    boolean[] lockers = new boolean [input];
    return lockers;
    
    
  }
  public static int[] stagesMaker(int num){//stages
    int[] stages = new int [num];
    return stages;
    
    
  }
  public static void print(boolean[] lockers) {//printing out the stages 
    String last="";
    // printing lockers and counting opens and closed
    int open = 0, close = 0;
    for (boolean lock:lockers){
      System.out.print((lock)?"O":"-");//forloop for print statement
      if (lock) open++;
      else close++;
  
  
    }
    System.out.printf("  \tOpen: %d\t Closed: %d\n", open, close);//acutall print statement
    

    
    
  }
  public static boolean[] loop(int num){//doing the acutall work 
    boolean[] lockers = new boolean[num];
    for(int steps = 1; steps <= num; steps++) {//count the open and closed 
      for(int locks = 0; locks < lockers.length; locks++) {
        if ((locks + 1) % steps == 0){
          lockers[locks] = !lockers[locks];
        }
      }
      print(lockers);   //printing out the array        
    }
    return lockers;
  }
  public static String Last(){
      System.out.print("Do you want to continue [y/n]?");//promting the user if they want to keep going
      String games = in.next();
      return games;
      //ifgames.equals("y") continue
        
   
        }
  public static void showLocks(boolean[] arr){
    System.out.print("Open: ");
    for (int i =0; i<arr.length; i++){ // loop to show which ones are open at the end
      if(arr[i])
        System.out.print(i+1 + " ");  //print statement for numbers
    }
    System.out.println("");
  }
  public static boolean[] nShow(int num){//same method as loop except now not printing anything just returning lockers
     boolean[] lockers = new boolean[num];
    for(int steps = 1; steps <= num; steps++) {
      for(int locks = 0; locks < lockers.length; locks++) {
        if ((locks + 1) % steps == 0){
          lockers[locks] = !lockers[locks];
        }
      }         
    }
    return lockers;
  }
  }
           
 //END
//worked with hunter








