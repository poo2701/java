import java.util.*;
import java.io.*;
class Dates{
	public static void main(String[] args)
	{
	HashMap<Integer,String> dat=new HashMap<Integer,String> ();
	  dat.put(1,"one");
	  dat.put(2,"two");
	  dat.put(3,"three");
	  dat.put(4,"four");
	  dat.put(5,"five");
	  dat.put(6,"six");
	  dat.put(7,"seven");
	  dat.put(8,"eight");
	  dat.put(9,"nine");
	  dat.put(10,"ten");
	  dat.put(11,"eleven");
	  dat.put(12,"tweleve");
	  dat.put(13,"thirteen");
	  dat.put(14,"fourteen");
	  dat.put(15,"fiveteen");
	  dat.put(16,"sixteen");
	  dat.put(17,"seventeen");
	  dat.put(18,"eighteen");
	  dat.put(19,"nineteen");
	  dat.put(20,"twenty");
	  dat.put(21,"twenty one");
	  dat.put(22,"twenty two");
	  dat.put(23,"twenty three");
	  dat.put(24,"twenty four");
	  dat.put(25,"twenty five");
	  dat.put(26,"twenty six");
	  dat.put(27,"twenty seven");
	  dat.put(28,"twenty eight");
	  dat.put(29,"twenty nine");
	  dat.put(30,"thirty");
	  dat.put(31,"thirty one");
	  
	  HashMap<Integer,String> mnth=new HashMap<Integer,String>();
	  mnth.put(1,"january");
	  mnth.put(2,"february");
	  mnth.put(3,"march");
	  mnth.put(4,"april");
	  mnth.put(5,"may");
	  mnth.put(6,"june");
	  mnth.put(7,"july");
	  mnth.put(8,"august");
	  mnth.put(9,"september");
	  mnth.put(10,"october");
	  mnth.put(11,"november");
	  mnth.put(12,"december");

	  HashMap<Integer,String> yr=new HashMap<Integer,String>();
	  yr.put(2011,"two thousand eleven");
      yr.put(2012,"two thousand tweleve");
      yr.put(2013,"two thousand thirteen");
      yr.put(2014,"two thousand fourteen");
      yr.put(2015,"two thousand fifteen");
      yr.put(2016,"two thousand sixteen");
      yr.put(2017,"two thousand seventeen");
      yr.put(2018,"two thousand eighteen");
      yr.put(2019,"two thousand ninteen");
      yr.put(2020,"two thousand twenty");
      String date="25/06/2018";
      Scanner sc=new Scanner(System.in);
      String n=sc.next();
      int str=Integer.parseInt(n.substring(0,2));
      int str1=Integer.parseInt(n.substring(3,5));
      int str2=Integer.parseInt(n.substring(6));
      System.out.println(dat.get(str)+" "+mnth.get(str1)+" "+yr.get(str2));

      // System.out.println(sub);

}
}