package jdbc;
import java.util.*;
public class KBC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Hashtable<String,String> hs=new Hashtable<String,String>();
		ArrayList as= new ArrayList();
		hs.put("ram","");
		hs.put("shayam","");
		hs.put("tony","");
		System.out.println("how many faces does a cube has?");
		System.out.println("answer of ram:");
		String ram_ans=sc.next();
		hs.replace("ram",ram_ans);
		System.out.println("answer of shayam:");
		String shayam_ans=sc.next();
		hs.replace("shayam",shayam_ans);
		System.out.println("answer of tony:");
		String tony_ans=sc.next();
		hs.replace("tony",tony_ans);
		System.out.println("----------------------------");
		String k,v;
		Enumeration eu = hs.keys();
		while(eu.hasMoreElements())
		{
			k=(String)eu.nextElement();
			v=(String)hs.get(k);
			
			if(v.equals("6")){
				as.add(k);
			}
			else{
				System.out.println("no winner");
			}
		}
	
		System.out.println(as.get(0));
		
	}

}
