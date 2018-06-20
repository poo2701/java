import java.util.Scanner;
public class ReverseString{
	Scanner sc=new Scanner(System.in);
	String ctr=sc.next ();
	String ctr1="";
	String Rev(){
	for(int i=ctr.length()-1;i>=0;i--){
	ctr1=ctr1+ctr.charAt(i);
	}
	return ctr1;
	}
	public static void main(String[] args){
	ReverseString r=new ReverseString();
	String ctr2=r.Rev();
	System.out.println(ctr2);
	}
}