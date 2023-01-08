/* 5. Write a program create custom Exception to manage stock. Create OutOfStockException and throw this exception if user 
     entered stock is not present while purchase products. Create the following methods.
     ==> addStock(int qty)   : write code to add stock
     ==> purchase(int qty)   : write code to purchase products
     ==> diplayStock()       : write code to display available stock

  Display list of options to user before accept option from user, such as 
  1. addStock  
  2. purchaseProduct 
  3. displayStock
*/

import java.util.*;
class OutOfStock extends Exception{
  public OutOfStock(String str){
    super(str);
  }
}
public class OutOfStockException {
  String name;
  int id;
  int qty;
  Scanner s = new Scanner(System.in);
  public  void addStock(int qty){
    System.out.println("Enter the product name");
    name=s.next();
    System.out.println("Enter the product id");
    id=s.nextInt();
    this.qty=qty;
    System.out.println("Stock added Successfull");
  }
  public  void purchase(int qty) throws OutOfStock{
    if(qty==this.qty){
       System.out.println("Purchase Successful");
    } else{
      throw new OutOfStock("Stock not available");
    }
  }
  public void diplayStock(){
    System.out.println("Product_Name: "+name+" "+"Product_Id: "+id+" "+"Product_Qty: "+qty);
  }

    public static void main(String args[]) {
      int option=0;
      char ch=0;
      OutOfStockException oe = new OutOfStockException();
      do{
         System.out.println("1.addStock");
      System.out.println("2.purchaseProduct");
      System.out.println("3. displayStock");
      System.out.println("Choose the option");
      Scanner sc = new Scanner(System.in);
      option = sc.nextInt();
      switch(option){
        case 1:
          oe.addStock(10);
          break;
          case 2:
          try{
          oe. purchase(20);
          }
          catch(OutOfStock e){
            System.out.println(e.getMessage());
          }
          break;
        case 3:
          oe.diplayStock();
          break;
      }
        System.out.println("Do Wish to continue to options(y/n)");
        ch=sc.next().charAt(0);
      }while(ch=='y');
      System.out.println("Thank You");
    }
}

