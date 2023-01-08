/* 3. Write a program to accept employee salary and 3 shopping bills, find how much % of amount 
      employee is spending on shopping on his/her salary. After printing % details, create another 
      reference variable for Employee object and clone employee object. Use setter and getter methods to set and get values. 
      Display user defined message once employee object got garbage collected.

      Sample Input: 
      Enter your salary: 10000
      Enter shopping bill1: 2000 
      Enter shopping bill2: 1400
      Enter shopping bill3: 500

      Expected Output:
      39 % of amount you are spending on shopping in your salary.
      Object got garbage collected.
*/
import java.util.*;
public class EmployeeSalaryDetails {
  private int salary;
  private int s_Bill1;
  private int s_Bill2;
  private int s_Bill3;
  EmployeeSalaryDetails(int salary,int s_Bill1,int s_Bill2,int s_Bill3){
    this.salary=salary;
    this.s_Bill1=s_Bill1;
    this.s_Bill2=s_Bill2;
    this.s_Bill3=s_Bill3;
  }
  public void setSalary(int salary){
    this.salary=salary;
  }
  public void setS_bill1(int s_Bill1){
    this.s_Bill1=s_Bill1;
  }
  public void setS_bill2(int s_Bill2){
    this.s_Bill2=s_Bill2;
  }
  public void setS_bill3(int s_Bill3){
    this.s_Bill3=s_Bill3;
  }
  public int getSalary(){
    return salary;
  }
  public int getS_bill1(){
    return s_Bill1;
  }
  public int getS_bill2(){
    return s_Bill2;
  }
  public int getS_bill3(){
    return s_Bill3;
  }
  public void display(){
    int total=((s_Bill1+s_Bill2+s_Bill3)*100)/salary;
        System.out.println(total+" "+"% of amount you are spending on shopping in your salary.");
  }
  public void finalize(){
    System.out.println("Object got garbage collected");
  }
    public static void main(String[ ] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the Salary");
      int salary = s.nextInt();
      System.out.println("Enter the Bill1");
      int bill1 = s.nextInt();
      System.out.println("Enter the Bill2");
      int bill2 = s.nextInt();
      System.out.println("Enter the Bill3");
      int bill3 = s.nextInt();
      EmployeeSalaryDetails esd = new EmployeeSalaryDetails(salary,bill1,bill2,bill3);
      esd.display();
      esd=null;
      System.gc();
     
    }
}