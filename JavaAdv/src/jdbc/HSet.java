package jdbc;
import java.util.*;
public class HSet {
	public static void main(String[] args) {
 HashSet hs=new HashSet();
		//TreeSet hs=new TreeSet();
     hs.add("one");
     hs.add("two");
     hs.add("three");
     hs.add("two");
     hs.add("five");
     System.out.println("the elements of hash set are:"+hs);
     
     Iterator it=hs.iterator();
		//System.out.println(hs);
		while(it.hasNext()){
			String s=(String)it.next();
			System.out.println(" "+s);
		}
	}

}
