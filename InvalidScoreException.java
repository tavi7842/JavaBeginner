/* 4. Write a program to create custom exception to validate eligibility score to join in bitLabs. 
      Create InvalidScoreException and throw this exception if user entered score is less than 70.

  Sample input:
  Enter your score to check eligibility:  65

  Sample output: 
  Java.lang.InvalidScoreException: "Sorry, you are not eligible to join in bitLabs."


  Sample input:
  Enter your score to check eligibility:  89

  Sample output: 
  "Great, you are eligible to join in bitLabs."
*/


import java.util.*;
import java.io.*;
class InvalidScore extends Exception{
  public InvalidScore(String str){
    super(str);
  }
}
class InvalidScoreException{
 
  public static void scoreValidation(int marks) throws InvalidScore{
    if(marks>=70 && marks<=100){
      System.out.println("Great, you are eligible to join in bitLabs.");
    }
    else{
      throw new InvalidScore("Sorry, you are not eligible to join in bitLabs.");
    }
  }
  public static void main(String args[]){
try{
    scoreValidation(89);
}
catch(InvalidScore e){
  System.out.println(e.getMessage());
} 
  }
}