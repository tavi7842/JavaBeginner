/*PU1	Count the Number of files available in a directory.  
pre-requisite	File Operations, Control statements, Exception handling
Use case description	The Pharmacy company wants to develop the application. It needs to find the total number of flies available in a specific folder like the medicine folder, employees' folder, etc. The company also wants the number of files specific to each type. Design an application to count the number of files in one directory and the number of files with a specific extension. 
Report exception if the user does not mention the proper directory name or complete path of a directory
Assignment	Allow the user to enter specific folder name / path of the folder. 
1.	Categories number of files according to instruction
2.	Find the total number of files sent together in that directory. 
Testcases1	Input:
Enter folder name/ path of the folder: f:/abc

Output: 
Number of files in each file extension
.txt files    :   1
.csv files   :   1
.xls file      :   2

Total  no of files in directory abc is     : 4
Input:
Abc.txt
Output:
Invalid Folder name 
*/


import java.util.*;
import java.io.*;

class Count_Files{
  public static void count(String str) throws IOException,NullPointerException{
    File fi = new File(str);
    String str1[] = fi.list();
    int tcount=0,ccount=0,xcount=0;
    int sum=0;
      if(fi.exists()){
        if(fi.list()==null){
      throw new NullPointerException("Files not exists");
    }
    else{
      for(int i=0;i<str1.length;i++){
      if(str1[i].endsWith(".txt")){
        tcount++;
      }else if(str1[i].endsWith(".csv")){
        ccount++;
      }else if(str1[i].endsWith(".xls")){
        xcount++;
      }
    }
    System.out.println("Number of files in each file extension");
    if(tcount>0){
      System.out.println(".txt files " +tcount);
    }
    if(ccount>0){
      System.out.println(".csv files " +ccount);
    }
    if(xcount>0){
      System.out.println(".xls files " +xcount);
    }
    }
    sum = tcount+ccount+xcount;
    System.out.println("Total  no of files in directory"+"is     : " +sum);
  }else{
        System.out.println("Folder/Folder in path not exits");
  }
      }
      
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the directory name");
    String str = s.nextLine();
    try{
      count(str);
    }
    catch (NullPointerException e){
      System.out.println(e.getMessage());
    }
    catch(IOException a){
      System.out.println(a.getMessage());
    }
  }
}