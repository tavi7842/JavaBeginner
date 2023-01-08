/* 2. Write a program to accept basic salary from user and find gross salary. Gross_Salary = basic+DA+HRA.  
      DA is 82% on basic and HRA is 70% on basic.  Use setter and getter methods to set and get values. 
      After printing gross salary display user defined message once object got garbage collected.

      Sample Input:
      Enter Basic salary: 23000
      
      Expected Output:
      Your gross salary is: 57960
      Object is garbage collected
*/
import java.util.*;
public class GrossSalary {
  private int basic_Salary;
  GrossSalary(int basic_Salary){
    this.basic_Salary=basic_Salary;
  }
  public void setBasic_Salary(int basic_Salary){
    this.basic_Salary=basic_Salary;
  }
  public int getBasic_Salary(){
    return basic_Salary;
  }
  public void display(){
    int da = (82*basic_Salary)/100;
      int hra = (70*basic_Salary)/100;
      System.out.println("Your gross salary is: "+(basic_Salary+da+hra));
  }
  public void finalize(){
    System.out.println("Object is garbage collected");
  }
    public static void main(String[ ] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the Basic Salary");
      int salary=s.nextInt();
      GrossSalary gs = new GrossSalary(salary);
      gs.display();
      gs=null;
      System.gc();
    }
}
