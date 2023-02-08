// PU3	Find the Length  of the Message  
// pre-requisite 	Control Statements, Strings, Methods,  Exception Handling

// Use case description 	“United SMScompany” provides SMS services. SMS limit should be 160 characters only, so customers can send SMS with in this limit only.



// Assignment 	Find the length and size of the givenSMS and implement the following operations: 
// 1.	Find the length of the characters in SMS
//        2.Compare the SMS length with SMS limit 
// Testcases1 	Input: 
// SMS:Welcome to bitLabs
// Output:  
// Length of the SMS: 18
// Length of SMS is lesser than the limit ,
// SMS sent successfully
// Testcases2 	Input: 
// Message : Welcome to bitLabsUnited SMS company” provides SMS services. SMS limit should be 160 characters only, so customers can send SMS with in this limit only.

// Output:  
// Length of the SMS: 170
// Length of SMS is exceeds the limit
// Sorry SMS sent failed
// covered topics	Control Statements, Strings, Methods,  Exception Handling

import java.util.*;
class Invalid_LengthException extends Exception{
  public Invalid_LengthException(String str){
    super(str);
  }
}
class Length_Files{
  public static void length(String str)throws Invalid_LengthException{
    if(str.length()>160){
      System.out.println("Length of SMS: "+str.length());
      throw new Invalid_LengthException("Length of SMS is exceeds the limit"+"\nSorry SMS sent failed");
    }else{
      System.out.println("Length of SMS: "+str.length());
      System.out.println("Length of SMS is lesser than the limit");
      System.out.println("SMS sent successfully");
    }
  }
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the String");
    String str1 = s.nextLine();
    try{
      length(str1);
    }
    catch(Invalid_LengthException e){
      System.out.println(e.getMessage());
    }
  }
}

