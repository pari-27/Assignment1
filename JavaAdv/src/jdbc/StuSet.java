package jdbc;
import java.util.*;
public class StuSet {
	static Scanner sc=new Scanner(System.in);
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		StuSet ss;
		HashSet hs=new HashSet();
		ArrayList as;
		for(int i=1;i<5;i++){
			System.out.print("Enter name "+i+":");
			String name=sc.next();
			ss=new StuSet();
			ss.setName(name);
			hs.add(ss);
			
		}
		
		Iterator it=hs.iterator();
		System.out.println(hs.size());
		while(it.hasNext()){
			StuSet s=(StuSet)it.next();
			System.out.println(" "+s.name);
		}
	}

}
