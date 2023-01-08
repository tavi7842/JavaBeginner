/* 5. Write a Java program to accept 5 students details such as name and marks and store in studentdetails.txt file in the below format.
     Ramu, 60
     Kumar,56
     Rakesh,89
     Suresh,66
    Read data from studentdetails.txt file and print Student name and marks who got top score. 
*/
import java.util.*;
import java.io.*;
public class StudentDetails {
  
    public static void main(String args[])throws IOException {
    Scanner s = new Scanner(System.in);
    String name[]=new String[5];
      int marks[]=new int[5];
     
      for(int i=0;i<5;i++){
        System.out.println("Enter the Student name");
         name[i]=s.next();
        System.out.println("Enter the Student marks");
         marks[i] =s.nextInt();
        
      }
      FileWriter fw = new FileWriter("Studentdetails.txt");
     BufferedWriter bw = new BufferedWriter(fw);
      for(int k=0;k<5;k++){
        bw.write(name[k]+","+marks[k]);
        bw.newLine();
      }
      bw.close();
      fw.close();
      System.out.println("Student details written to the file successfully!");
      FileReader fr = new FileReader("Studentdetails.txt");
      BufferedReader br = new BufferedReader(fr);
      String str;
      int score=0;
      String scorer="";
      while((str=br.readLine())!=null){
        String part[]=str.split(",");
        String s_name = part[0];
        int s_marks=Integer.parseInt(part[1]);
        if(s_marks>score){
          score=s_marks;
          scorer=part[0];
        }
      }
      System.out.println("The top Scorer will be:  "+scorer+" will Score of  "+score);
    }
}
