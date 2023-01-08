/* 5. Write a Java program to accept directory name, file name from user. Do the following steps using File class.
   ==> Create directory with user entered directory name
   ==> Create file in given directory.
   ==> Accept one sentence about bitLabs and store in give file using FileOutputStream class.
   ==> Read data from given file and display read data on console using FileInputStream class.
*/
import java.util.*;
import java.io.*;
public class CreatingDirectory {

    public static void main(String args[]) throws IOException {
      String str="";
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the Directory name");
      try{
        String dir_Name=s.nextLine();
      File f1 = new File(dir_Name); //Assignment_5
      boolean value = f1.mkdir();
      if(value){
        System.out.println("Directory Created Successfully");
      }
      System.out.println("Enter the file name");//FileAss
      String file_Name=s.nextLine();
      File f2 = new File(dir_Name+"/"+file_Name);
      boolean value1= f2.createNewFile();
      if(value1){
        System.out.println("File Created Successfully");
      }
      FileOutputStream fos = new FileOutputStream(f2);
      System.out.println("Enter the Sentence to store");
      //String sentence="Bitlabs Welcomes you";
        String sentence=s.nextLine();
        fos.write(sentence.getBytes());
        FileInputStream fis = new FileInputStream(f2);
        int a;
        while((a=fis.read())!=-1){
          str=str+(char)a;
        }
        System.out.println(str);
      }
      catch(IOException e){
        System.out.println(e);
      }
    }
}
