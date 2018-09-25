package jdbc;
import java.util.*;
public class BankInfo {
	public static void main(String[] args) {
   Hashtable hs=new Hashtable();
   Scanner sc = new Scanner(System.in);
   System.out.println("enter your ac no. and name");
   hs.put(sc.nextInt(), sc.next());
   System.out.println("enter your ac no. and name");
   hs.put(sc.nextInt(), sc.next());
   System.out.println("enter your ac no. and name");
   hs.put(sc.nextInt(), sc.next());
   System.out.println("enter your ac no. and name");
   hs.put(sc.nextInt(), sc.next());
  
   Enumeration e=hs.keys();
   while(e.hasMoreElements()){
	   int k=(Integer)e.nextElement();
	   System.out.println(k+"-----"+hs.get(k));
   }
   
	}

}
