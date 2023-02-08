// PU4	Validate file accessibility
// pre-requisite	Files, Date Package , Control statements , OOPS - Core java

// Use case description	A company want to send their tender quotation. For security reasons this file will be available to download for specified number of days only. Once the days crossed from the send date, file will not be available to download. Now build a logic to validate the expiry date to download the file.
// Assignment	Allow the user to enter expiry days and implement the following operations:
// 1.	Create a file and read the file creation date as sent date
// 2.	Calculate the difference between sent date and current date
// 3.	If the different days is less than the expiry date display “File is available to download”
// 4.	Else display file is expired
// Testcases1	Input:
// Enter number of days to expire: 10
// file creation date: 25-11-2022
// Output: 
// Your file is available to download
// Testcase2	Input:
// Enter number of days to expire: 10
// file creation date: 01-11-2022
// Output: 
// Your file is expired
// covered topics	Files, Date Package , Control statements , OOPS - Core java

import java.io.*; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date; 

public class FileAccess { 
  public static void main(String[] args) { 
 //to get the path of file
  Path filePath = Path.of("1GB.bin");
    BasicFileAttributes attr=null;
  try 
    {
    //to get creation date of file given above
    attr = Files.readAttributes(filePath,
   BasicFileAttributes.class);  
    } 
  catch (IOException e) { 
    System.out.println("Error reading file attributes: " + e.getMessage()); 
  }
    Date creationDate = new Date(attr.creationTime().toMillis());

      //to get current date 
   Date currentDate = new Date();

      //to know difference between current date and creation date in time
      long diff = currentDate.getTime() - creationDate.getTime();

      //to convert the above mentioned time in days between creation & current date of a above given file
      
      long diffInDays = diff / (24*60*60*1000);
      //print Statements
      System.out.println("Current date: " + currentDate);
      System.out.println("File creation date: " + creationDate);
      System.out.println("Differenece File creation date: " + diffInDays);
      if( diffInDays>10){
        System.out.println("Your file is expired");
      }else{
         System.out.println("Your file is available to download");
      }
   
  } 
}