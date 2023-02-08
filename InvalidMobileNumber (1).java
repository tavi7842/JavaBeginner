/* 3.Write a program to create custom exception to validate mobile number. Create InvalidMobileNumber and throw this exception 
   whenever user enters the mobile number by not following the below conditions.

  ==> mobile number should contain only digits.
  ==> mobile number should contain only 10 digits.
  ==> mobile number should start with 9 or 8 or 7 or 6.

  Sample input: 
  Enter your mobile number: 4565333953
  Sample output: java.lang.InvalidMobileNumber: "Invalid mobile number"

  Sample input: 
  Enter your mobile number: 9884533953
  Sample output: Valid Mobile number
*/
import java.util.*;
import java.io.*;
class InvalidNumber extends Exception{
  public InvalidNumber(String str){
    super(str);
  }
}
public class InvalidMobileNumber {
  public static void mobileValidation(String num) throws InvalidNumber{
    if(num.length()==10){
      //System.out.println("Valid Mobile number");
        char ch = num.charAt(0);
        if(ch=='9' || ch=='8'|| ch=='7' || ch=='6')
        {
          //System.out.println("Valid Mobile number");
          int count=0;
          for(int i=0;i<num.length();i++){ 
            if(num.charAt(i)>=0 || num.charAt(i)<=9){
              count++;
            }else{
              throw new InvalidNumber("Mobile number should have digits");
            }
          }
          if(count==10){
              System.out.println("Valid Mobile number");
            }
        }else{
        throw new InvalidNumber("Mobile should start with 9 or 8 or 7 or 6");
     }    
      } else{
        throw new InvalidNumber("Mobile number should have all 10 digits");
     }
  }
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the mobile number");
      String num1 = s.nextLine();
      try{
        mobileValidation(num1);
      }
      catch(InvalidNumber e){
         System.out.println(e.getMessage());
        //e.printStackTrace();
      }
    }
}