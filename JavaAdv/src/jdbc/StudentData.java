package jdbc;
import java.util.*;
import java.sql.DriverManager;
import java.sql.*;
public class StudentData {
	static Scanner sc =new Scanner (System.in);
		public static void main(String args[])
	{

			try
			{ 
		    	
			Class.forName("com.mysql.jdbc.DriverManager");
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
			}
			catch(Exception e){
				System.out.println(e);
			}

		StudentData sd=new StudentData();
	
			String y="";
			do{
				sd.add();
				System.out.println("do you want to enter more data(y/n)");
				y=sc.next();
				
			}while(y=="y"||y=="Y");
		   System.out.println("The inserted data is :");
		  
		   sd.showTable();
		   		
	}

	void add()
	{
		System.out.println("Enter Student roll no: ");
		int roll=sc.nextInt();
		System.out.println("Enter Student name: ");
		String name=sc.next();
		System.out.println("Enter Student marks in hindi: ");
		float hindi=sc.nextFloat();
		System.out.println("Enter Student marks in english: ");
		float eng=sc.nextFloat();
		System.out.println("Enter Student marks in maths: ");
		float maths=sc.nextFloat();
		System.out.println("Enter Student marks in physcis: ");
		float phy=sc.nextFloat();
		System.out.println("Enter Student marks in chemistry: ");
		float chem=sc.nextFloat();
	}	
	void showTable()
	{
		
	}
}
