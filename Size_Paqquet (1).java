// PU5	Finding the Size of a Paqqet 
// pre-requisite  	Strings, Files 
 
// Use case description  	 When any user wants to send an Paqqet, he/she needs to check the Paqqet size. If the size is below some appropriate size, he/she should be able to sent that Paqqet. 
// Assignment  	Write a java program that determines total Paqqet size by reading the number of files along with content  and message that needs to be sent with the Paqqet 
// Testcase1  	Input:  
// No.of files to be sent-----3
// Enter File Names : abc.txt, bit.txt,xyz.txt

// Enter Message: sample message
 
// Output:   
//      Paqqet size is 10MB. This Paqqet can be sent. 
// Testcase2	Input:  
// No.of files to be sent-----4
// Enter File Names : abc.txt, bit.txt,kumar.txt,xyz.txt
 
// Enter Message: sample message

// Output:   
//     Paqqet size is 30MB. This Paqqet cannot be sent as it exceeds the limit.
// covered topics  	Strings, Files


import java.util.*;
import java.io.*;

class Size_Paqquet{
  public static void main(String args[]){
    long sumf=0;
    Scanner s = new Scanner(System.in);
    System.out.println("No.of files to be sent-----   ");
    int n = s.nextInt();
     System.out.println("Enter File Names :    ");
    for(int i=0;i<n;i++){
      String str = s.next();
      File fi = new File(str);
      long file =fi.length();
      sumf=sumf+file;
    }
    System.out.println("Enter Message:   ");
    String str1 = s.next();
    long summ = str1.length();
    sumf=sumf+summ;
    System.out.println("Paqqet size in bytes     "+sumf+"Bytes");
      long  kilobytes = (sumf/1024);
    System.out.println("Paqqet size in kilo bytes     "+kilobytes+"KB");
       long megabytes = (kilobytes/1024);
    if(megabytes>10){
       System.out.println("Paqqet size in megabytes     "+megabytes+"MB");
      System.out.println("This Paqqet cannot be sent as it exceeds the limit."); 
    }
    else{
       System.out.println("Paqqet size in megabytes     "+megabytes+"MB");
    System.out.println("This Paqqet can be sent. "); 
    }
   
  }
}

