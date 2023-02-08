// PU2	Find the Size of the file in Server.  
// pre-requisite 	Control Statements,Strings, Methods, Exception Handling

// Use case description 	 "Karun Technology’ is a Software company which maintains server to store all his company project details and files but the server capacity is only 500TB, because of that whenever he wants to store the files into that server, he needs to check the server capacity whether file size is lesser than the available size or not on the server.
// Assignment 	Write a piece code to check the size of the file before storing on the server and following operations will be perform
// 1.	Find the size of the file in the Bytes 
// 2.	Find the size of the file in the Kilo Bytes  
// 3.	Find the size of the file in the Mega Bytes  
// 4.	Compare the file size and available size on server to store the file 

// Testcases1 	Input: 
// File Name: xyz.docx
// Output:  
// Size of the file:
// In Giga Bytes:   1 GB
// In Mega Bytes:  1024 MB
// In Kilobytes:1,048,576KB
// In Bytes:1073741824 Bytes 
// covered topics 	Control Statements, ,Strings, Methods, Exception Handling

import java.util.*;
import java.io.*;
class Invalid_FileSizeException extends Exception{
  public Invalid_FileSizeException(String str){
    super(str);
  }
}
class Size_Files{
  public static void validate(String str)throws IOException,Invalid_FileSizeException {
    File f = new File(str);
    long bytes=0,kilobytes=0,megabytes=0,gigabytes=0,terabytes=0,available=0;
  
    if(f.exists()){
           bytes = f.length();
       kilobytes = (bytes/1024);
       megabytes = (kilobytes/1024);
       gigabytes =(megabytes/1024);
       terabytes =(gigabytes/1024);
      
    }else{
      System.out.println("file not Found ");
    }
    if(megabytes >500){
      System.out.println("Size of the file:");
      System.out.println("In Giga Bytes:   "+gigabytes+" GB");
      System.out.println("In Mega Bytes:   "+megabytes+" MB");
      System.out.println("In Kilo Bytes:   "+kilobytes+" KB");
      System.out.println("In TeraBytes:   "+terabytes+" Bytes");
      System.out.println("In Bytes:   "+bytes+" Bytes");
      
      available =500-megabytes;
      System.out.println("The Remaining capacity available in the server is:  "+available);
    }else{
      
      throw new Invalid_FileSizeException("File Size is greater than 500TB");
    }
  }
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the String");
    String str1 = s.nextLine();    
    try{
      validate(str1);
    }
    catch(IOException e){
      System.out.println(e);
    }
     catch(Invalid_FileSizeException e){
      System.out.println(e.getMessage());
    }
  }
}
