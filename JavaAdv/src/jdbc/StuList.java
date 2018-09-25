package jdbc;
import java.util.*;
public class StuList implements Comparable {
	static Scanner sc=new Scanner(System.in);
	String roll,name;
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	int age;
	public static void main(String[] args) {
		ArrayList as=new ArrayList();
		StuList sl;
		for(int i=1;i<=3;i++){
			sl=new StuList();
			System.out.println("details of student"+i+"\n----------------------");
			System.out.print("enter your roll");
			sl.setRoll(sc.next());
			System.out.print("enter your name");
			sl.setName(sc.next());
			System.out.print("enter your age");
			sl.setAge(sc.nextInt());
			as.add(sl);
						
		}
		Collections.sort(as);
	}
	@Override
	public int compareTo(Object o) {
		
		return 0;
	}
	

}
