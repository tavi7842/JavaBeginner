/* 1. Write a program to accept 3 Students information with name, five subject’s marks and print name along with total marks. 
      Use setter and getter methods to set and get values. After displaying student total marks, assign null value to reference 
      variable and Display user defined message once student object got garbage collected.

      Sample Input: 
      Enter student1 name: Ramesh
      Enter 5 subjects marks: 34, 56, 78, 89, 99
      Enter student1 name: Rakesh
      Enter 5 subjects marks: 99, 50, 70, 84, 23
      Enter student1 name: Satish
      Enter 5 subjects marks: 34, 33, 22, 22, 10

      Expected Output:
      Total marks of Ramesh is: 356
      Object got garbage collected

      Total marks of Rakesh is: 321
      Object got garbage collected

      Total marks of Satish is: 121
      Object got garbage collected
*/
import java.util.*;
public class StudentInformation {
  private String s_name;
  private int s1;
  private int s2;
  private int s3;
  private int s4;
  private int s5;
  public void setS_Name(String s_name){
    this.s_name=s_name;
  }
  public void setS1(int s1){
    this.s1=s1;
  }
  public void setS2(int s2){
    this.s2=s2;
  }
  public void setS3(int s3){
    this.s3=s3;
  }
  public void setS4(int s4){
    this.s4=s4;
  }
  public void setS5(int s5){
    this.s5=s5;
  }
  public String getS_Name(){
    return s_name;
  }
  public int getS1(){
    return s1;
  }
  public int getS2(){
    return s2;
  }
  public int getS3(){
    return s3;
  }
  public int getS4(){
    return s4;
  }
  public int getS5(){
    return s5;
  }
  public void finalize(){
    System.out.println("Object got garbage collected");
  }
    public static void main(String[ ] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the size of array");
      int n = s.nextInt();
      StudentInformation si[] = new StudentInformation[n];
      for(int i=0;i<si.length;i++){
        si[i]=new StudentInformation();
       System.out.println("Enter the Student name");
       si[i].setS_Name(s.next());
       System.out.println("Enter the 5 Subject  marks");
       si[i].setS1(s.nextInt());
       si[i].setS2(s.nextInt());
       si[i].setS3(s.nextInt());
       si[i].setS4(s.nextInt());
       si[i].setS5(s.nextInt());
               
      }
      for(int i=0;i<si.length;i++){
       System.out.println("Total marks of "+si[i].getS_Name()+" "+"is :"+(si[i].getS1()+si[i].getS2()+si[i].getS3()+si[i].getS4()+si[i].getS5())); 
        si[i]=null;
        System.gc();
        System.runFinalization();
      }
      
    }
}