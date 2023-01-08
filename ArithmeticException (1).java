/* 1. Write a program to accept two numbers, one Arithmetic operator such as +, -, / , *  and print output of Arithmetic operation. 
   Write switch case to perform each operation. Handle ArithmeticException when you are performing division operation. 
*/
import java.util.*;
public class ArithmeticException {
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a and b values");
      int a = s.nextInt();
      int b = s.nextInt();
       System.out.println("Enter the Arthimetic operator");
      char ch = s.next().charAt(0);
      switch(ch){
        case '+':
            System.out.println("The addition of numbers will be:  "+(a+b));
          break;
        case '-':
            System.out.println("The subraction of numbers will be:  "+(a-b));
          break;
          case '*':
            System.out.println("The multiplication of numbers will be:  "+(a*b));
          break;
          case '/':
          try{
             System.out.println("The divison of numbers will be:  "+(a/b));
          }
            //here we will get arithmetic exception but i have not mentioned it as arithmetic exception because i have a problem with replit.
            
          catch(Exception e){
            System.out.println(e);
          }
          break;
        default:
          System.out.println("Invalid Input");
          break;
      }
      System.out.println("Handled Arithmetic Exception");
    }
}