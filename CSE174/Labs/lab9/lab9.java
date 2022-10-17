/* 
 * Wayne Chaney
 * CSE 174 I
 * Amjad Mesiam
 * October 25, 2019
 * Lab 9
 * Description: get multiple of lab.
*/
import java.util.Scanner; 
public class lab9{
public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int step = 0;//intializing steps 
      int max= Integer.MIN_VALUE;
      for(int j =1; j <=6; j++){//{}
        
 int count= 0;
 String num= "";
 
// System.out.print("Enter a number: ");
// int input= in.nextInt();
// System.out.print("Enter a start point:");
// int number1 = in.nextInt();
// System.out.print("Enter a end point:");
// int number2 = in.nextInt();
 int number1 = (int)(1000 + Math.random() * (20000-1000 +1));int number2 = (int)(20000 + Math.random() * (50000-20000+1));// start and end
 for(int i = number1; i <= number2; i++){
   
   if(isEven(i)){
       if(multiple3or7(2 *i)) count++;//count
     
     num = num +(2 * i) + " ";
   }
   else{
     if(multiple3or7(-(2 * i -1))) count++;//count
       
     num = num + (-(2 * i -1)) + " ";
    }

 }
//System.out.println(num);
System.out.printf("%d-%d: %d multiple of 3 or 7. \n",number1,number2,count);// print statment
      
if(count> max){
max= count;
step = j-1;//steps
}
}
 System.out.printf("Max is: %d from the step %d\n", max, step);
}
      
     
public static boolean isEven(int num){//even or odd method
  return num %2 != 0;
}
public static boolean multiple3or7(int num){//multiple of 3 or 7
  return num % 3== 0 || num % 7 == 0 ;

}}