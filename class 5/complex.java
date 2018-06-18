import java.util.Scanner;
class Complex{
	int real;
	int Imaginary;
	public void display(int real,int Imaginary){
		int r=real;
		int im=Imaginary;
		 System.out.println(r+"+"+im+"i");
	}
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.print("Enter Real and Imaginary part");
	int rl=in.nextInt();
	int img=in.nextInt();
	Complex c1=new Complex();
	c1.display(rl,img);
}
}