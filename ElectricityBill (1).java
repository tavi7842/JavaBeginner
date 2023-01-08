/* 4. Write a program to Calculate Electricity Bill. Accept last month units and present units in string format from the user. 
      Calculate Electricity Bill for last month units, otherwise throw ArithementicException along with some error message.  
      Handle NumberFormatException while converting units into numerical value. 

  Calculate Electricity Bill based on following charges:

  ==> first 50 units charges are: 0.50 per/unit
  ==> next 100 units charges are: 1.75 per/unit
  ==> next 100 units charges are: 2.50 per/unit
  ==> above 250 units charges are: 2.90 per/unit

  Add 10% surcharge on overall bill.

*/
import java.util.*;
import java.io.*;
public class ElectricityBill {
  double amount=0,charge=0;
  public void caluclateElectricityBill(int units)throws Exception{ 
    
    if(units>0 && units<=50){
      amount = 0.50*units;
      charge=amount+(amount*10)/100;
      System.out.println("The bill will be  "+amount);
      System.out.println("The bill with surcharge will be  "+charge);
    }else if(units>0 && units<=150){
      amount=0.50*50+(units-50)*1.75;
      charge=amount+(amount*10)/100;
      System.out.println("The bill will be  "+amount);
      System.out.println("The bill with surcharge will be  "+charge);
    }else if(units>0 && units<=250){
      amount=0.50*50+100*1.75+(units-150)*2.50;
      charge=amount+(amount*10)/100;
      System.out.println("The bill will be  "+amount);
      System.out.println("The bill with surcharge will be  "+charge);
    }
    else if(units>0 && units>250) {
      amount=0.50*50+100*1.75+150*2.50+(units-250)*2.90;
      charge=amount+(amount*10)/100;
      System.out.println("The bill will be  "+amount);
      System.out.println("The bill with surcharge will be  "+charge);
    }else{
      throw new Exception("Invalid amount");
    }
  }

  

    public static void main(String args[]) {
      ElectricityBill eb = new ElectricityBill();
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the last month units");
      String last_month = s.next();
      try{
        int last_month1 = Integer.parseInt(last_month);
        System.out.println("The bill of last month");
        try{
          eb.caluclateElectricityBill(last_month1);
        }
        catch(Exception f){
          System.out.println(f.getMessage());
        }
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
}
