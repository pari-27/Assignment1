package jdbc;
import java.util.*;
public class ArrayListEx {
	public static void main(String[] args)
	{
		ArrayList ar=new ArrayList();
		ar.add("ram");
		ar.add(new Integer(1));
		ar.add("jon");
		ar.add("aman");
		//ar.add("ram");
		System.out.println("list="+ar);
		ar.add(2,"xyz");
		System.out.println("list="+ar);
		ar.set(2,"abc");
		System.out.println("list="+ar);
		System.out.println("size="+ar.size());
		//	ar.remove("ram");
		//System.out.println("list="+ar);
		ar.remove(1);
		System.out.println("list="+ar);
		//ar.removeAll(ar);
		System.out.println(ar.size());
		Collections.reverse(ar);
		System.out.println("list after reverse--"+ar);
		Collections.shuffle(ar);
		System.out.println("list after shuffle--"+ar);
		Iterator it=ar.iterator();
		String nm;
		System.out.println("list elements are--");
		while(it.hasNext())
		{
			nm=(String)it.next();
			System.out.println(nm);
		}
	}


}


