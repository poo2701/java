import java.util.Scanner;
class Palindrome{
	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		int n=ab.nextInt();
		int temp=n;
		int b,rev=0;
		while (n!=0){
			b=n%10;
			rev=rev*10+b;
			n=n/10;
		}
		if (rev==temp) {
			System.out.println(rev+" No is Pallendrome");
		}
		else{
			System.out.println("Not Pallendrome");
		}
	}
}
	