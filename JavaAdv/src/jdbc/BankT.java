package jdbc;
import java.util.*;
public class BankT {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Hashtable hs=new Hashtable();
		Customer cs=new Customer();
		for(int i=1;i<3;i++){

			System.out.println("enter customer"+i+" ac no.:");
			String ac_no=sc.next();
			System.out.println("enter customer"+i+" name:");
			cs.setCust_nm(sc.next());
			System.out.println("enter customer"+i+" balance:");
			cs.setBal(sc.nextInt());
			System.out.println("enter customer"+i+" contact:");
			cs.setContact(sc.next());
			System.out.println("----------------");
			hs.put(ac_no,cs);
		}
		System.out.println("enter the account no. to be viewed");
		String k=sc.next();
		cs=(Customer)hs.get(k);
     System.out.println("Customer details:\n---------------"+"\nCutomer name:"+cs.getCust_nm()+"\ncustomer balance:"+cs.getBal()+
    		 "\ncustomer contact no:"+cs.getContact()+"\n------------------" );
	}

}
