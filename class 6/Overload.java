public class Overload{
	static void print(){
	System.out.println("hello");
	}
	static void print(int a){
	System.out.println("hello"+a);
	}
	static void print(float a){
	System.out.println("hello"+a);
	}
	public static void main(String[] args){
	int a=1;
	float b=2;
	Overload.print();
	Overload.print(b);
	Overload.print(a);  
	}
}