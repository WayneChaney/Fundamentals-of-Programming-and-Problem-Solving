/* Wayne Chaney 
 * CSE 174 I - Program 8
 * Amjad Meisam
 * Octorber, 18 2019
 * Decription: Making a scrable game.
 */
import java.util.Scanner;
public class Patternchecker {
  static int num=0;
  static int num1= 0;
  static int num2= 0;
  static int num3= 0;
  static int num4= 0;
  static int num5= 0;
  static int num6= 0;
  static int num7= 0;
  static int num8= 0;
  static int num9= 0;

  static int limit =0;
  static String wo1rd;
  static int largestNum=0;
  static int secondLargestNum=0;
  static int smallestNum=Integer.MAX_VALUE;
  static int secondSmallestNum=0;
  static String sRan = "";
  static Scanner input = new Scanner(System.in);
  public static void main(String[] args){
    
    int choice = 0;
    int num2,num3,num4,num5,num6;
        while((choice != 1) || (choice != 2) || (choice != 3)){
    System.out.println("List of Pattern Checker problems:");
    System.out.println("(1) Largest and Smallest Pairs");
    System.out.println("2) Counting digits");
    System.out.println("3) Quit");
    System.out.print("Choice:");
    choice =input.nextInt();
    
    if(choice == 1){
      System.out.print("Enter the limit ");
      limit=input.nextInt();
      if(limit<2)
        System.out.println("Invalid input. The limit should be at least 2");
      
      System.out.print("Enter " + limit + " numbers:");
      String chicken = largestNum(limit);
      System.out.println(chicken);
     
    }    
    if(choice == 2){
      String word = randomNum(num1) + "";
      System.out.println("The generated random number is: " + word);
      System.out.print("*** Counted Pairs are =");
      
      System.out.println(CountingDigits(word));
      return;
      
      
    }
    if((choice < 1) || (choice >3)){
      System.out.print("Invaild input");
    }
    if(choice == 3){
 System.out.println("*** End");
      break;
     
    }
      
  }
  }
  public static String largestNum(int limit){
    int count = 0;
    int max = Integer.MIN_VALUE;
    int max2= Integer.MIN_VALUE;
    int min1= Integer.MAX_VALUE;
    int min2 = Integer.MAX_VALUE;
    
    while(count<limit){
      int in= input.nextInt();
      if(in > max){
        max2 = max;
        max= in;
      }
      
      else if(max2 < in){
        max2 = in;
        
      }
      
      
      
      if(min1>in){
        min2 = min1;
        min1 = in;
      }
      else if(min2 >in){
        min2 = in;
      }
      count++;
    }
    
    
    return "*** Largest and Smallest Pairs: " + "(" + max + "," + max2 + "),(" + min1 + "," + min2 + ")";
    
  }  
  
  public static int randomNum(int a){
    int ranNum= (int)(Math.random()* ((2000000-1000000) +1) + 1000000);
    return ranNum;    
  }
  public static int  LargestandsmallestNum(int a){
    
    
    
    return 5;
  }
  public static String CountingDigits(String word){
    int num=0;
    int num1= 0;
    int num2= 0;
    int num3= 0;
    int num4= 0;
    int num5= 0;
    int num6= 0;
    int num7= 0;
    int num8= 0;
    int num9= 0;
    int i = 0;
    
    while(i < 7){
      if(word.charAt(i)=='0')
      num++;
      if(word.charAt(i)=='1')
      num1++;
      if(word.charAt(i)=='2')
      num2++;
      if(word.charAt(i)=='3')
      num3++;
      if(word.charAt(i)=='4')
      num4++;
      if(word.charAt(i)=='5')
      num5++;
      if(word.charAt(i)=='6')
      num6++;
      if(word.charAt(i)=='7')
      num7++;
      if(word.charAt(i)=='8')
      num8++;
      if(word.charAt(i)=='9')
      num9++; 
      i++; 
    }
    
    String wes= "";
      if(num != 0){
      wes += "(0," + num + "), " ;
    }
    if(num1 != 0){
      wes += "(1," + num1 + "), " ;
    }
    if(num2 != 0){
      wes += "(2," + num2 + "), " ;
    }
    if(num3 != 0){
      wes += "(3," + num3 + "), " ;
    }
    if(num4 != 0){
      wes += "(4," + num4 + "), " ;
    }
    if(num5 != 0){
      wes += "(5," + num5 + "), " ;
    }
    if(num6 != 0){
      wes += "(6," + num6 + "), " ;
    }
    if(num7 != 0){
      wes += "(7," + num7 + "), " ;
    }
    if(num8 != 0){
      wes += "(8," + num8 + "), " ;
    }
    if(num9 != 0){
      wes += "(9," + num9 + ") " ;
    }
  
    return wes + "";
     

  } 
  public static String viewNumbers(String a){
    String wes= "";
      if(num != 0){
      wes += "(0," + num + "), " ;
    }
    if(num != 1){
      wes += "(1," + num1 + "), " ;
    }
    if(num != 2){
      wes += "(2," + num2 + "), " ;
    }
    if(num != 3){
      wes += "(3," + num3 + "), " ;
    }
    if(num != 4){
      wes += "(4," + num4 + "), " ;
    }
    if(num != 5){
      wes += "(5," + num5 + "), " ;
    }
    if(num != 6){
      wes += "(6," + num6 + "), " ;
    }
    if(num != 7){
      wes += "(7," + num7 + "), " ;
    }
    if(num != 8){
      wes += "(8," + num8 + "), " ;
    }
    if(num != 9){
      wes += "(9," + num9 + "), " ;
    }
  
    return wes + "";
    
      
      
  
  }}













