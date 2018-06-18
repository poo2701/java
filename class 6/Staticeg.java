class Staticeg{
	static int i;
    int j;
    static {
        i = 10;
        System.out.println("In Static Block ");
    }
   Staticeg(){
        System.out.println("In Constructor block");
    }

 
public static void main(String[] args) {
	
     Staticeg s1 = new Staticeg();
       
    }
}