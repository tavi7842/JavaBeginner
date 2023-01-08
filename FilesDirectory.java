/* 1. Write a Java program to get a list of all files/directory names from the given path using File class object.*/
import java.io.*;
public class FilesDirectory {

    public static void main(String args[]) {
      File f = new File("/home/runner/Java-Beginner-tavi7842/FileHandlingUsingByteStreams_Assignment-tavi7842/Assignment_5");
      String f1[]=f.list();
      for(int i=0;i<f1.length;i++){
        System.out.println(f1[i]);
      }
    }
}

