/* Week 5 lab 
 * Calculator.java 
 * Wayne Chaney
 * Intsructor : Meisam Amjad 
 * Performs a variety of calculations based on user input. 
 */ 

import java.util.Scanner; 

public class Calculator { 
   public static void main(String[] args) { 
      double num1, num2;
      String opCode;
      char opChar;
      Scanner in = new Scanner(System.in); 

      
      System.out.print("Enter an expression:"); 
      
      // Get the two numbers and the operator: 
      num1 = in.nextDouble(); 
      opCode = in.next(); 
      num2 = in.nextDouble(); 
      
      // Converting string into char
       opChar = opCode.charAt(0);
      
      
      // dealing with different conditions
      switch(opChar){ //MAIN SWITCH
         case '+': 
             System.out.printf("Addition: %.1f + %.1f = %.1f \n",num1, num2,num1+num2);// ADDDING
           break;
      
            
               
         case '-': 
             System.out.printf("Subtraction: %.1f - %.1f = %.1f \n",num1, num2,num1-num2);//SUBTRACTING
            // complete the rest// complete the rest
           break; 
             
     
         case '*': 
             System.out.printf("Multiplication: %.1f * %.1f = %.1f \n",num1, num2,num1 * num2);// MULTIPLICATION
           break;
       
        
         case '/': 
           if((num2) == 0){
             System.out.printf("Division: Divide by zero error");// DIVISIBLE BY ZERO
              
             break;
         }
           
             System.out.printf("Division: %.1f / %.1f = %.16f \n",num1, num2,(num1) / (num2));// DIVISION
           
          
             break;
           
        
          
         case '^': 
             System.out.printf("Power: %.1f ^ %.1f = %.1f \n",num1, num2,Math.pow(num1,num2));//POWER
           break;
       
               
         case '?': 
           if(num1 >= num2){
           System.out.printf("Random number: First number must be smaller than second number\n");//RANDOM NUMBER
           break;
         }
             System.out.printf("Power: %.1f ? %.1f = %.16f \n",num1, num2,(Math.random()*(num2 - num1)) + num1);//RANDON NUM
           break;
         default:
          System.out.printf("Invaild operator \n");
           break;
          
               }
               
   
   }}

    
