/* 5. Write a program to find prime numbers from given two arrays and store in 3rd array.Handle ArrayIndexOutOfBoundsException while storing values into 3rd array.
*/


public class ArrayIndexOutOfBoundsException {

    public static void main(String args[]) {
      int arr1[]={1,2,3,4,5};
      int arr2[]={6,7,8,9,10,11};
      int ar3[]=new int[3];
      int a=0;
      int count=0,count1=0;
      for(int i=0;i<arr1.length;i++){
        count=0;
        for(int j=1;j<=arr1[i];j++){
        if(arr1[i]%j==0){
          count++;
        }  
        }
        if(count==2){
          try{
          ar3[a]=arr1[i];
          a++;
            }
          catch(Exception e){
            System.out.println(e.getMessage());
          }
          //System.out.println(arr1[i]);
        }
      }
      for(int k=0;k<arr2.length;k++){
        count1=0;
        for(int m=1;m<=arr2[k];m++){
        if(arr2[k]%m==0){
          count1++;
        }  
        }
        if(count1==2){
          try{
            ar3[a]=arr2[k];
          a++;
          }
          catch(Exception e){
            System.out.println(e.getMessage());
          }
          //System.out.println(arr2[k]);
        }
      }
      for(int h=0;h<ar3.length&&ar3[h]!=0;h++){
        System.out.println(ar3[h]);
      }
    }
}