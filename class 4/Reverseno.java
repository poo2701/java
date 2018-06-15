import java.util.Scanner;
class Reverseno{
	public static void main(String[] args) {
		int b,n,rev=0,temp;
		System.out.println("Enter no to reverse");
		Scanner ab=new Scanner(System.in);
		 n=ab.nextInt();
		temp=n;
		while(n!=0){
		b=n%10;
		rev=rev*10+b;
		n=n/10;
	}
	System.out.println("Reverse no is :" + rev);
	}
}