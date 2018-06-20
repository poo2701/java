import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;
class ABC{
public static void main(String[] args)throws IOException
{
	File f1=new File("C:\\Users\\PUJA KUMARI\\Desktop\\java\\class 9\\abc.txt");
	File f2=new File("C:\\Users\\PUJA KUMARI\\Desktop\\java\\class 9\\xyz.txt");
	FileReader fis=new FileReader(f1);
	FileWriter fos=new FileWriter(f2);
	BufferedReader brs=new BufferedReader(fis);
	BufferedWriter bos=new BufferedWriter(fos);
	String c;
	while((c=brs.readLine())!=null){
		System.out.print(c);
		bos.write(c);
		bos.flush();
	
}

}
	
}