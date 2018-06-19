//package p;
import java.util.Scanner;
public class Maximum{
	Scanner sc =new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
	void convert(){

		if(Integer.parseInt(s1)>Integer.parseInt(s2)){
			System.out.println("s1 is bigger");
		}
		else
		{
			System.out.println("s2 is bigger");
		}
	}
	public static void main(String[] args) {
		Maximum p=new Maximum();
		p.convert();
		
	}
}

