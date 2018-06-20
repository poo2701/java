import java.io.*;
 class ABC{
	public static void main(String[] args) throws IOException
	{File f=new File("abc.txt");
	FileReader ab=new FileReader(f);
int i;
	while((i=ab.read())!=-1){
		System.out.print((char)i);
	}
	
	}
}