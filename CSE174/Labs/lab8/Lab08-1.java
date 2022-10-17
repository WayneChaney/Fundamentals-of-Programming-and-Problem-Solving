/* Wayne Chaney
 * CSE 174 - Lab 8 
 * Amjad Meisam 
 * October 18, 2019
 * Decription: Making a scrable game.
 */
import java.util.Scanner;
public class Lab08{
  public static void main(String[] args){
    int wordNum,num,wordQ,wordV,maxLength,shortLength;//defining all variable 
    String word, allWords;
    double average;
    num= 1;
    double sum = 0;
    wordQ= 0;
    wordV=0;
    maxLength = 0;
    shortLength=Integer.MAX_VALUE;
    allWords = "";
    Scanner input = new Scanner(System.in);//Scanner to have inputs
    
    System.out.print("How many words will you enter?");
    wordNum= input.nextInt();//input 
    if(wordNum< 1){
     System.out.println("NO WORDS ENTERED.");//if user doesnt enter anywords.
     return;
    }
    
   
    while(num <= wordNum){
      
      
      System.out.print("Enter word#"+num + ":");//tells user to put words in
      
      word= input.next();//words
  
      sum = sum + word.length();// howmany times repeats 
      if(word.indexOf("q") > -1)// word amount
           wordQ++;
       if(word.indexOf("Q") > -1)
              
         wordQ++;
      
      if(startsWithVowel(word))// calling method
         wordV++;
     
      if(word.length() > maxLength){//getting largest numbers
        maxLength = word.length();
    }   
      
      if(shortLength > word.length())//getting shortest number 
        shortLength = word.length();
      allWords = allWords +" "+ word;
      
      
      num++;
    }
    
    // average = (word.length() + word.length() +word.length() )/2;
    
    System.out.println("RESULTS:...");//all of the lined statements 
    System.out.println("Average word length: " + sum / wordNum);
    System.out.println("Length of shortest word:" + shortLength);
    System.out.println("Length of longest word:" + maxLength);
    System.out.println("Words containing q:" + wordQ);
    System.out.println("Words starting with a vowel:"+wordV);
    System.out.print("You entered " + (num-1) + " words:"+ allWords); 
    
  }
  public static boolean startsWithVowel(String word){//new method
    int num1= 0;
    if(word.startsWith("a") || (word.startsWith("e")||(word.startsWith("i")||(word.startsWith("o")||(word.startsWith("u"))))))// seeing if word has vowel in it 
      return true;//answer if vowel
    return false;
  }                                                
  
  

}