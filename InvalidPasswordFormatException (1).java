/* 1. Write a program to create custom exception to validate password.
      Create InvalidPasswordFormatException and throw this exception
      whenever the user enters the password by not following the below conditions.
      ==> Password should contain at least one digit.
      ==> Password should contain at least one uppercase letter.
      ==> Password should contain at least one lowercase letter.
      ==> Password does not allow space and special characters.

  Sample Input: 
  Enter your password: Password@123
  Sample output: Valid password

  Sample Input: 
  Enter your password: abc123
  Sample output: java.lang.InvalidPasswordFormatException: "Sorry, Invalid passowrd"
*/
import java.util.*;
import java.io.*;
  class InvalidPassword extends Exception {
  public InvalidPassword(String str){
    super(str);
  }
}
public class InvalidPasswordFormatException{
  public static void validationPassword(String str) throws InvalidPassword{
    int countn=0,countu=0,countl=0,counts=0;
  char ch=0;
  for(int i=0;i<str.length();i++){
    ch=str.charAt(i);
   if( ch>='0' && ch<='9'){
     countn++;
     } 
     else if(ch>='A' && ch<='Z'){
       countu++;
     }
       else if(ch>='a' && ch<='z'){
         countl++;
         }
         else if(ch!=' '){
         counts++;
     }
  }
     System.out.println(countn+" "+countu+" "+countl+" "+counts);
  if(countn>=1 && countu>=1 && countl>=1 && counts>=1){
    System.out.println("Valid password");
  } else{
    throw new InvalidPassword("Sorry, Invalid passowrd");
    
  }
}
     public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the password");
      String str1 = s.nextLine();
      try{
        validationPassword(str1);
      }
      catch(InvalidPassword e){
        System.out.println(e);
      }
     }
}



