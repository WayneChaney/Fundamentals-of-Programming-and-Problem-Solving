/*
 * Name: Wayne Chaney 
 * Intructor: Meisam Amjad
 * CSE 174, Section I
 * Date: 09/26/2019
 * Filename: MathQuiz.java
 * Description: Math Quiz
 */
import java.util.Scanner; // this has to be in the system in order to get a scanner
import java.util.concurrent.TimeUnit; //Impoting time utility
public class MathQuiz{ // name of the class.
  public static void main(String[ ] args )throws InterruptedException  {
    Scanner in = new Scanner(System.in);//Importing Scanner 
    String easy,hard,hard1, difficulty,sAnswer1,swAnswer1;//String
    int max,rand1,rand2,randD,javaAnswer,inputUser,pointsF;//labling Intergers
    int right = 0;//RIght multiplication answers
    int rightD =0;//right Divsion answers 
    boolean x=true;//boolean
    long displayMinutes=0;//for minutes
    
    long startTime,endtime,timeElapsed;//getting the long for time



    System.out.println("Welcome to my math quiz!");// The porgram talking to the the 
    System.out.println("This quiz will give you four multiplication problems,");
    System.out.println("followed by four division problems.");
    System.out.println("An easy quiz will include numbers up to 100.");
    System.out.println("A hard quiz will include numbers up to 1000.");
    System.out.printf("------------------------------------------------------\n");
    System.out.printf("Do you want an easy quiz or a hard quiz? \nEnter the word hard or easy:");//saying the difficult
    difficulty= in.next();//User put their difficulty in. 
    
    startTime = System.nanoTime();//timer starts after difficulty is chosen.
    
    System.out.println("-MULTIPLICATION--------------------------------------");
    System.out.printf("You have chosen %s.\n ", difficulty);
    if(difficulty.equals("hard")){
      max = 500;//half of the max for hard 
      rand1 = (int)(1 + Math.random() * (33-1));//take the square root of 1000
      rand2 = (int)(1 + Math.random() * (33-1));//take the square root of 1000
      javaAnswer = (rand1 * rand2);//getting the answer of the problem
      System.out.printf("%d x %d =",rand1,rand2);//showing the problem to the user
      inputUser = in.nextInt();//user input
      if(javaAnswer == inputUser){
        System.out.printf("Correct! %d answers correct so far. \n",++right);//if user got right print this
      }
      else
        System.out.printf("Sorry, %d x %d = %d. %d answers correct so far. \n",rand1, rand2,javaAnswer,right);//first question done,steps repeat 3 more times 
       max = 500;
      rand1 = (int)(1 + Math.random() * (33-1));
      rand2 = (int)(1 + Math.random() * (33-1));
      javaAnswer = (rand1 * rand2);
      System.out.printf("%d x %d =",rand1,rand2);
      inputUser = in.nextInt();
      if(javaAnswer == inputUser){
        System.out.printf("Correct! %d answers correct so far. \n",++right);
      }
      else
        System.out.printf("Sorry, %d x %d = %d. %d answers correct so far. \n",rand1, rand2,javaAnswer,right);//2nd
       max = 500;
      rand1 = (int)(1 + Math.random() * (33-1));
      rand2 = (int)(1 + Math.random() * (33-1));
      javaAnswer = (rand1 * rand2);
      System.out.printf("%d x %d =",rand1,rand2);
      inputUser = in.nextInt();
      if(javaAnswer == inputUser){
        System.out.printf("Correct! %d answers correct so far. \n",++right);
      }
      else
        System.out.printf("Sorry, %d x %d = %d. %d answers correct so far. \n",rand1, rand2,javaAnswer,right);//3rd
       max = 500;
      rand1 = (int)(1 + Math.random() * (33-1));
      rand2 = (int)(1 + Math.random() * (33-1));
      javaAnswer = (rand1 * rand2);
      System.out.printf("%d x %d =",rand1,rand2);
      inputUser = in.nextInt();
      if(javaAnswer == inputUser){
        System.out.printf("Correct! %d answers correct so far. \n",++right);
      }
      else
        System.out.printf("Sorry, %d x %d = %d. %d answers correct so far. \n",rand1, rand2,javaAnswer,right);//4th
    }
    else{//if user choese easy the program will jump to this 
      max = 50; // half of 100
      rand1 = (int)(1 + Math.random() * (10-1));//square root of 100
      rand2 = (int)(1 + Math.random() * (10-1));//square roo of 100
      javaAnswer = (rand1 * rand2);//answer of 2 intergers problems
      System.out.printf("%d x %d =",rand1,rand2);//displaying the question to user
      inputUser = in.nextInt();//user input 
      if(javaAnswer == inputUser){//if answer match will print this 
        System.out.printf("Correct! %d answers correct so far. \n",++right);
      }
      else
        System.out.printf("Sorry,  %d x %d = %d. %d answers correct so far. \n",rand1, rand2,javaAnswer,right);//1st Easy question one done, repeat steps 
       max = 50; 
      rand1 = (int)(1 + Math.random() * (10-1));
      rand2 = (int)(1 + Math.random() * (10-1));
      javaAnswer = (rand1 * rand2);
      System.out.printf("%d x %d =",rand1,rand2);
      inputUser = in.nextInt();
      if(javaAnswer == inputUser){
        System.out.printf("Correct! %d  answers correct so far. \n",++right);
      }
      else
        System.out.printf("Sorry,  %d x %d = %d. %d answers correct so far. \n",rand1, rand2,javaAnswer,right);
       max = 50; 
      rand1 = (int)(1 + Math.random() * (10-1));
      rand2 = (int)(1 + Math.random() * (10-1));
      javaAnswer = (rand1 * rand2);
      System.out.printf("%d x %d =",rand1,rand2);
      inputUser = in.nextInt();
      if(javaAnswer == inputUser){
        System.out.printf("Correct! %d  answers correct so far. \n",++right);
      }
      else
        System.out.printf("Sorry  %d x %d = %d. %d answers correct so far. \n",rand1, rand2,javaAnswer,right);
       max = 50; 
      rand1 = (int)(1 + Math.random() * (10-1));
      rand2 = (int)(1 + Math.random() * (10-1));
      javaAnswer = (rand1 * rand2);
      System.out.printf("%d x %d =",rand1,rand2);
      inputUser = in.nextInt();
      if(javaAnswer == inputUser){
        System.out.printf("Correct! %d  answers correct so far. \n",++right);
      }
      else
        System.out.printf("Sorry,  %d x %d = %d. %d answers correct so far. \n",rand1, rand2,javaAnswer,right);
      
    }
       
    System.out.println("-DIVISION--------------------------------------------");//Divsion questions
    if(difficulty.equals("hard")){// If user chose hard
      max = 500;//half of max
      rand1 = (int)(1 + Math.random() * (33-1));//square root of 10000
      rand2 = (int)(1 + Math.random() * (33-1));
      randD= (rand2 * rand1);//answer to problem
      System.out.printf("%d \u00F7 %d =",randD,rand2);//division symbole and printing the question to the user
      inputUser = in.nextInt();//User input
      if((rand1 == inputUser)){//if answer match input
         System.out.printf("Coorect! %d  answers correct so far. \n",++right);//if user answer is correct
         ++rightD;
      }
         else{
            System.out.printf("No, %d \u00F7 %d = %d.  answers correct so far. \n",randD,rand2,rand1);//if wrong answer then print this, 1st Question done repeat 3 more times
     }
               max = 500;
      rand1 = (int)(1 + Math.random() * (33-1));
      rand2 = (int)(1 + Math.random() * (33-1));
      randD= (rand2 * rand1);
      System.out.printf("%d \u00F7 %d =",randD,rand2);
      inputUser = in.nextInt();
      if((rand1 == inputUser)){
         System.out.printf("Coorect! %d  answers correct so far. \n",++right);
         ++rightD;
      }
         else{
             System.out.printf("No, %d \u00F7 %d = %d.  answers correct so far. \n",randD,rand2,rand1);
     }
               max = 500;
      rand1 = (int)(1 + Math.random() * (33-1));
      rand2 = (int)(1 + Math.random() * (33-1));
      randD= (rand2 * rand1);
      System.out.printf("%d \u00F7 %d =",randD,rand2);
      inputUser = in.nextInt();
      if((rand1 == inputUser)){
         System.out.printf("Coorect! %d  answers correct so far. \n",++right);
         ++rightD;
      }
         else{
            System.out.printf("No, %d \u00F7 %d = %d.  answers correct so far. \n",randD,rand2,rand1);
     }
               max = 500;
      rand1 = (int)(1 + Math.random() * (33-1));
      rand2 = (int)(1 + Math.random() * (33-1));
      randD= (rand2 * rand1);
      System.out.printf("%d \u00F7 %d =",randD,rand2);
      inputUser = in.nextInt();
      if((rand1 == inputUser)){
         System.out.printf("Coorect! %d  answers correct so far. \n",++right);
         ++rightD;
      }
         else{
             System.out.printf("No, %d \u00F7 %d = %d.  answers correct so far. \n",randD,rand2,rand1);
     }
    }
    else{//EASY
       max = 50;//Half Max
      rand1 = (int)(1 + Math.random() * (10-1));// square root of 100
      rand2 = (int)(1 + Math.random() * (10-1));
      randD= (rand2 * rand1);
      System.out.printf("%d \u00F7 %d =",randD,rand2);//division symbole and printing the question to the user
      inputUser = in.nextInt();//user imput
       if((rand1 == inputUser)){//if user input equal the answer
       System.out.printf("Coorect! %d  answers correct so far. \n",++right);//correct answer
       ++rightD;
    }
       else{
       System.out.printf("No, %d \u00F7 %d = %d.  answers correct so far. \n",randD,rand2,rand1);//if wrong answer then print this, 1st Question done repeat 3 more times
     }
       max = 50;
      rand1 = (int)(1 + Math.random() * (10-1));
      rand2 = (int)(1 + Math.random() * (10-1));
      randD= (rand2 * rand1);
      System.out.printf("%d \u00F7 %d =",randD,rand2);
      inputUser = in.nextInt();
       if((rand1 == inputUser)){
       System.out.printf("Coorect! %d  answers correct so far. \n",++right);
       ++rightD;
    }
       else{
         System.out.printf("No, %d \u00F7 %d = %d.  answers correct so far. \n",randD,rand2,rand1);
     }
       max = 50;
      rand1 = (int)(1 + Math.random() * (10-1));
      rand2 = (int)(1 + Math.random() * (10-1));
      randD= (rand2 * rand1);
      System.out.printf("%d \u00F7 %d =",randD,rand2);
      inputUser = in.nextInt();
       if((rand1 == inputUser)){
       System.out.printf("Coorect! %d  answers correct so far. \n",++right);
       ++rightD;
    }
       else{
          System.out.printf("No, %d \u00F7 %d = %d.  answers correct so far. \n",randD,rand2,rand1);
     }
       max = 50;
      rand1 = (int)(1 + Math.random() * (10-1));
      rand2 = (int)(1 + Math.random() * (10-1));
      randD= (rand2 * rand1);
      System.out.printf("%d \u00F7 %d =",randD,rand2);
      inputUser = in.nextInt();
       if((rand1 == inputUser)){
       System.out.printf("Coorect! %d  answers correct so far. \n",++right);
       ++rightD;
    }
       else{
         System.out.printf("No, %d \u00F7 %d = %d.  answers correct so far. \n",randD,rand2,rand1);
     }
    }
  
    
    endtime= System.nanoTime();//end time
    timeElapsed = endtime - startTime; 
   
    System.out.printf("-RESULTS---------------------------------------------\n");//Finish
    System.out.printf("You answered the questions in " + (timeElapsed / 1000000000) + " seconds.\n");//nano so divide by 1 bil
    
    System.out.printf("Multiplication score: %d out of 4 (%.2f",(right-rightD),(right-rightD)/ 4.0 * 100);//getting results from multiplication
    
    System.out.print("\u0025)\n");
    System.out.printf("Division score: %d out of 4 (%.2f",rightD,(rightD/ 4.0)* 100);//results from division
    System.out.print("\u0025)\n");
    System.out.printf("Overall score: %d out of 8 (%.2f",right,(right/ 8.0) * 100);//total results 
    System.out.print("\u0025)\n");

    // \u0025 SYmbol for %//
    
  }}

