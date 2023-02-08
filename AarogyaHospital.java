//package aarogya_hospital;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.io.*;

// the main class
public class AarogyaHospital {
      
      Scanner ip=new Scanner(System.in);
      // make constructor for the class and assign it a unique Id
      public AarogyaHospital(){
          
      }
      //For talking input for a patient
      public void input(){
          // Read data from user and store into a file. Handle IOException while storing patients info into a file
      }
    
      // pick the choice of task to be performed
	  public void choices(){
		 System.out.println("Press 1 for adding new member");
		 System.out.println("Press 2 to view list of all available members");
		 System.out.println("Press 3 to search member by ID");
		 System.out.println("Press 4 to search member from a particular city");
		 System.out.println("Press 5 to search member from a particular age group");
		 System.out.println("Press 6 to mark recovery of a member");
		 System.out.println("Press 7 to delete data of a member");
		 System.out.println("Press 0 to exit");
	     long option=ip.nextLong();
	    tasks(option);
	}

    public void tasks(long option){
    // initialise array list to store the patients
		//for adding task
		while(true){

			//take choice
			//invalid choice
			if(option<0||option>7){
			
			}
			// take the input and add in the arrayList
			else if(option==1){
	            
        	        }
			//iterate and print all the patient
	        else if(option==2){
	        	//print all the patients, Handle NullPointerException if patients list is empty

	        }
			// print details of the patient with a particular id (take id as input)
	        else if(option==3){
	               // Handle NullPointerException if patient is is not present in list 
	        }
			
			// to print all the patient from a particular city (take  city as input)
	        else if(option==4){
	        	// Handle NullPointerException if patient city is not present in list 
	        }
			// to print details of all the patient in a particular age group (take age limits as input)
	        else if(option==5){
	           
	        }
	        // take member id as input and mark it recovered and store recovered it 
	        else if(option==6){
	            
	        }
	        //take patient id as input mark the patient id as deleted
	        else if(option==7){
	        }
	        else{
	            break;
	        }
		}
	}

    
    //Main Method
    public static void main(String args[]){
        
    }
    
}