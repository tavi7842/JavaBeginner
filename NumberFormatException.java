/* 2. Write a program which will illustrate NumberFormatException. Create a test method, with in the test method accept two numbers 
   using next() method of scanner class. Convert into numerical values and print addition of two numbers. 
   Please write your comments regarding NumberFormatException such as "When NumberFormatException will occur in this program?"
*/
import java.util.*;
public class NumberFormatException {
   public static void test(int a,int b){
     System.out.println(a+b); 
  }
  public static void main(String args[]){
    //ExceptionAss2 ea2 = new  ExceptionAss2();
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the a value");
     String a = s.next();
     System.out.println("Enter the b value");
      String b = s.next();
    try{
     int a1 = Integer.parseInt(a);
     int b1 = Integer.parseInt(b);
      /*NumberFormatException  will occur at this point because the 
      operation is done to covert string containing numbers to int data tpe but if
      thestring contain any sort of characters or special characters it will give number format exception*/
       test(a1,b1);
      }
    catch(Exception e){
       System.out.println(e);
    }
     System.out.println("Demo of NumberFormatException");
  }

}
