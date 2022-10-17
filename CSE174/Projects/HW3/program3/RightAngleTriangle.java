/*
 * Name: Wayne Chaney 
 * Intructor: Meisam Amjad
 * CSE 174, Section F
 * Date: 09/9/2019
 * Filename: RightAngleTriangle.java
 * Description: Write my classes in Java
 */
import java.util.Scanner; // this has to be in the system in order to get a scanner



public class RightAngleTriangle{ // name of the class.
  public static void main(String[ ] args ) {
    Scanner input = new Scanner(System.in);// this will give a opportunity to use imputs 
    String triangleName;
    String letter1, letter2, letter3;
    String angleA, angleB, angleC;
    String cordinateA, cordinateB, cordianteC;
    double x0, y0, x1, y1, x2, y2, ox, oy;
    double side1, side2, side3,side4;
    double sine1, sine2, sine3,sine4;
    System.out.print("Enter the three letter name of Triangle");
    triangleName = input.next();
    double area,base,height,perimeter;
    double cenx,ceny,centroid;
    
    letter1 = triangleName.substring(0,1);
    letter2 = triangleName.substring(1,2);
    letter3 = triangleName.substring(2,3);
    
    System.out.printf("Enter the coordinates of %s: ", letter1);
    x2 = input.nextDouble();
    y2= input.nextDouble();
    
    System.out.printf("Enter the coordinates of %s: ", letter2);
    x1 = input.nextDouble();
    y1= input.nextDouble();
    
    x0 = x1;
    y0 = y2;
    
    
    
    // --- Displayin results -----
    System.out.printf("###### Right Triangle Calculation for the %s Triangle ######\n", triangleName);
    System.out.printf("** The coordinates of the triangles are: **\n");
    
    
    System.out.printf("%s : (%.3f, %.3f)\n", letter1.toUpperCase(), x2, y2);
    System.out.printf("%s : (%.3f, %.3f)\n", letter2.toUpperCase(), x1, y1);
    System.out.printf("%s : (%.3f, %.3f)\n", letter3.toUpperCase(), x0, y0);
    
    //Side length//
    System.out.printf("** The Side lengths are **\n");
    side1= Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    side2= Math.sqrt(Math.pow((x2-x0),2) + Math.pow((y2-y0),2));
    side3= Math.sqrt(Math.pow((x0-x1),2) + Math.pow((y0-y1),2));
    side4= Math.sqrt(Math.pow((x0-x2),2) + Math.pow((y0-y2),2));  
    
    
    System.out.printf("Side %s : = %.3f units\n",letter1, side3);
    
    System.out.printf("Side %s : = %.3f units\n",letter2, side2);
    
    System.out.printf("Side %s : = %.3f units\n",letter3, side1);
    //Angles//
    System.out.printf("** The angles are **\n");
    sine2= Math.toDegrees(Math.asin(side2/side1));
    sine1= Math.toDegrees(Math.asin(side3/side1));
    sine4= Math.toDegrees(Math.asin(side4/side2));
  //   sine3= Math.toDegrees(Math.asin(side3/side2));//
    
    
    System.out.printf("Angle %s : %.3f degrees \n",letter1.toUpperCase(), sine1);
    System.out.printf("Angle %s : %.3f degrees \n",letter2.toUpperCase(), sine2);
    System.out.printf("Angle %s : %.3f degrees \n",letter3.toUpperCase(), sine4);
    //System.out.printf("Angle %s : %.3f degrees \n",letter3, sine3);// incase of error 
    
    //Area and Perimeter
    System.out.printf("** The area and perimeter **\n");
    base = (x2-x1);
    height=(y1-y2);
    area= Math.abs(base * height)/2;
    perimeter = Math.abs(side1 + side2 + side3);
    System.out.printf("Area = %.3f sq units \n",area);
    System.out.printf("Perimeter = %.3f units \n",perimeter);
    
    //centroid cordinate//
        cenx= (x1+x2+x0)/ 3;
          ceny= (y1+y2+y0)/ 3;
     System.out.printf("** The centroid coordinate **\n");
     
     System.out.printf("0 : (%.3f, %.3f) \n" , cenx,ceny);
     
    
    /*
     *     
     System.out.printf("side %s : %.3, units)\n", Letter.toLowerCase(), ;
     System.out.print("Enter side a:");
     a= input.nextDouble();
     double b;
     System.out.print("Enter side b:");
     b= input.nextDouble();
     double c;
     c = Math.sqrt( Math.pow(a,2) + Math.pow(b,2));//the formula for surface area
     System.out.println("hypotenuse =" + c);//this will give the answers for hypotenuse
     String name = "john smith";
     
     name.toUpperCase();
     
     System.out.printf(name);
     
     System.out.println(Integer.SIZE+" "+Double.SIZE);
     */
    
  }
}
