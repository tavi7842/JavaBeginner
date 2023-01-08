/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers. 
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/
public class ArithmeticException {
  public static void method(int a, int b){
    System.out.println("The division of a and b is  "+(a/b));
  }

    public static void main(String args[]) {
      /*ArithmeticException  will occur at this point because if the 
      operation done by dividing 'a' by 0('b') is wrong and gives arithmetic exception*/
      try{
        method(10,2);
      }
        catch(Exception e){
          System.out.println(e);
        }
    }
}