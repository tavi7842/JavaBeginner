/* 3. Write a program to accept firstName, lastName and mobileNumber in string format. 
   Print number of characters in firstName and lastName, and print sum of digits of a mobileNumber. 
   Handle NumberFormatException while converting mobileNumber to long.
*/
import java.util.*;
public class NumberFormatException {
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the firstname");
      String str1 = s.next();
      System.out.println("Enter the lastname");
      String str2 = s.next();
      System.out.println("Enter the mobileNumber");
      String str3 = s.next();
      System.out.println("The no.of characters in firstName "+str1.length());
      System.out.println("The no.of characters in lastName "+str2.length());
      try{
        long a = Long.parseLong(str3);
        long sum=0;
        while(a!=0){
          sum=sum+a%10;
          a=a/10;
        }
        System.out.println("The sum of digits in mobile number is "+sum); 
      }
      catch(Exception e){
        System.out.println(e.getMessage());
      }
    }
}