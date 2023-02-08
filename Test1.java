class Test1{
  static int fact(int n){
    int result=0;
    if(n==1){
      return 1;
    }else{
      return (n*fact(n-1));
    }
  }
  public static void main(String args[]){
    System.out.println(fact(5));
    System.out.println(fact(4));
    System.out.println(fact(3));
    System.out.println(fact(1));
    
  }
}




// FileReader fr = new FileReader("Match.csv");
//     BufferedReader br = new BufferedReader(fr);
//     String str = br.readLine();
//     String str1[]=str.split(",");
//     for(int i=0;i<str1.length;i++){
//       if(str1[i].equals("City_Name")){
//         System.out.println(i);
        
//       }
//       String str2=null;
//       int ccount=0;
//       while((str2=br.readLine())!=null){
//         String str3[]=str.split(",");
//         for(int j=0;j<str3.length;j++){
//           if(str3[7].equals("Chennai")){
//             ccount++;
//           }
//         }
//       }
//       if(ccount>0){
//           System.out.println("The no of matches held in chemnnai will be:  "+ccount);
//         }else{
//           System.out.println("no  matches held in chemnnai");
//         }
//     }