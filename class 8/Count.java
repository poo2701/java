public class  Count
{
	public static void main(String[] args){
	String s="java is more useful language";
	int count = 1;
	for(int i=0;i<s.length()-1;i++){
	if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')){
	count++;
	}
	}
	System.out.println("number of words:="+count);
	}
}