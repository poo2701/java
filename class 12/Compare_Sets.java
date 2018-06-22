import java.util.*;
class Compare_Sets{
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("purnima");
		hs.add("vidhi");
		hs.add("priyanka");
		hs.add("rashpreet");
		hs.add("navjeet");
		hs.add("rukman");
		System.out.println("friend:"+hs);
		HashSet<String> subset=new HashSet<String>();
		subset.add("nuzhat");
		subset.add("kajal");
		subset.add("neha");
		subset.add("shivani");
		subset.add("toshi");
		subset.add("smrity");
		subset.add("anjali");
		subset.add("nahid");
		System.out.println("school friend:"+subset);
		hs.retainAll(subset);
		System.out.println(hs);

	}
}