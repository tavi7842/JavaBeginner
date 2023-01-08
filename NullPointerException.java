/*4. Write a program which will illustrate NullPointerException. Create student class along with name, marks and city and add setter methods and getter methods.
  Create a method which can take student class as a parameter and print name, marks and city in method business logic.
  Write your comments regarding NullPointerException such "When NullPointerException will occur in program?"
*/
import java.util.*;
class Student12{
  private String name;
  private int marks;
  private String city;
  Student12(String name,int marks,String city){
    this.name=name;
    this.marks=marks;
    this.city=city;
  }

  public void setName(String name){
    this.name=name;
  }
  public void setMarks(int marks){
    this.marks=marks;
  }
  public void setCity(String city){
    this.city=city;
  }
  public String getName(){
    return name;
  }
  public int getMarks(){
    return marks;
  }
  public String getCity(){
    return city;
  }
  public static void display(Student12 st){
    System.out.println(st.getName().length()+" "+st.getMarks()+" "+st.getCity());
  }
}
class NullPointerException{
  public static void main(String args[]){
    String name = null;
    int marks = 580;
    String city = "Guntur";
    Student12 stu = new Student12(name,marks,city);
    try{
      /*NullPointerException  will occur at this point because the 
      we are trying to access the String name which is null so that it will be given NullPointerException*/
      Student12.display(stu);
    }
     catch(Exception e){
      System.out.println(e);
     }
    System.out.println("Program on Null pointer exception");
  }
}

