//this class to enter employee details --constructor---and show method
package jdbc;
import java.util.*;
public class Employee {
	String ecode ,name,desg;
	int sal;
	static Scanner sc = new Scanner(System.in);
	Employee(){
		this.desg="";
		this.ecode="";
		this.name="";
		this.sal=0;

	}
	Employee(String ecode,String name,String desg,int sal){
		this.desg=desg;
		this.ecode=ecode;
		this.name=name;
		this.sal=sal;
	}
	void show(){
		System.out.println("e-code: "+ecode);
		System.out.println("name: "+name);
		System.out.println("designation: "+desg);
		System.out.println("salary: "+sal);
		System.out.println("-------------------");
	} 
	void increase(){
		sal=sal+((sal*10)/100);
		
	}
	public static void main(String[] args) {
		ArrayList as=new ArrayList();
		Employee em;
		for(int i=0;i<1;i++){
			System.out.println("enter the customer details:\n-------------------------");
			System.out.println("ecode:");
			String ecode=sc.next();
			System.out.println("name:");
			String name=sc.next();
			System.out.println("designation:");
			String desg=sc.next();
			System.out.println("salary");
			int sal=sc.nextInt();
			em = new Employee(ecode,name,desg,sal);
			as.add(em);
		}  
		System.out.println("Details:\n--------------");
		Iterator it= as.iterator();
		while(it.hasNext()){
			em=(Employee)it.next();
			em.show();
		}
		System.out.println("after increase of salary:\n--------------");
		Iterator it1= as.iterator();
		while(it1.hasNext()){
			em=(Employee)it1.next();
			em.increase();
			em.show();
		}

	}

}
