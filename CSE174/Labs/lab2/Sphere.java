/* 
 * Author: Wayne Chaney
 * Instructor: Meisam
 * Date: 09/06/2019
 * File: name Sphere 
 * Description: we are doing math problems in java
 */    
import java.util.Scanner; // this has to be in the system in order to get a scanner
public class Sphere {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);// this will give a opportunity to use imputs 
    
    double radius;
    System.out.print("Enter the sphere's radius:");
    radius= input.nextDouble();
    
    double surfacearea = Math.pow(radius,2) * 4 * Math.PI;//the formula for surface area
    double voulume = Math.pow(radius,3) * (4.0/3.0) * Math.PI;//the formula for volume
    
    System.out.println("surface area ="+surfacearea);//this will give the answers for surface area
    System.out.println("voulume ="+voulume);// this will give answers for the voulume
    
    System.out.print("Enter new sphere's radius:");
    radius= input.nextDouble();
    
    surfacearea = Math.pow(radius,2) * 4 * Math.PI;//the formula for surface area
    voulume = Math.pow(radius,3) * (4.0/3.0) * Math.PI;//the formula for volume
    
    System.out.println("surface area ="+surfacearea);//this will give the answers for surface area
    System.out.println("voulume ="+voulume);// this will give answers for the voulume
    
    
  }
}
