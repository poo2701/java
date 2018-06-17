import java.util.Scanner;
class Primecheck{
    public static void main(String args[]){    
        int i,m=0,flag=1; 
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no to find prime or nor: ");
        int n=in.nextInt();     
            
              m=n/2;      
  if(n==0||n==1){  
        System.out.println(n+"not a prime number");      
  }else{  
        for(i=2;i<=m;i++){      
    if(n%i==0){      
        System.out.println(n+" not a prime number");      
        flag=0;      
     break;      
    }      
   }      
   if(flag==1)  { System.out.println(n+" is prime number"); 
 }  
}
}}