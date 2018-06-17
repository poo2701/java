import java.util.Scanner;
class Reverse{
public static void main(string[] args){
	Scanner sc; 
	sc=new Scanner(system.in);
	int n,rev=0,r,original;
	n=sc.nextInt();
	original=n;
	while(original!=0){
	r=original%10;
	rev=rev*10+r;
	original=original/10;}}
	System.out.println(rev);

}	
