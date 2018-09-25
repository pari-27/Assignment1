package jdbc;
import java.sql.*;
import java.util.*;
import java.sql.DriverManager;

public class UserAdd {
Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
			UserAdd ua=new UserAdd();
			UserInfo ui=new UserInfo();
			Statement st=con.createStatement();
			//ua.add(con,st);
			
		ua.dash(con,st,ui);
			
			
		}
		catch(Exception e){
			System.out.println(e);
		}

	}
void dash(Connection con,Statement st,UserInfo ui){
	
	System.out.println("Enter your user name");
	
    ui.setUsr_nm(sc.next());
	System.out.println("Enter your password");
	ui.setPass(sc.next());
	String qry="select * from user where usr_nm ='"+ui.getUsr_nm()+"'";
	try{
	ResultSet rs=st.executeQuery(qry);
	if(rs.next()){
		System.out.println("login successfull");
		System.out.println("Firstname:"+rs.getString(3)+"      "+"Lastname:"+rs.getString(4));
		System.out.println("Email:"+rs.getString(6)+"       "+"Contact:"+rs.getString(5));
		System.out.println("Role:"+rs.getString(7));
	}
	}
	catch(Exception e){
	System.out.println("error"+e);	
	}
}
void add(Connection con,Statement st){
	try{String query[]={
			"insert into user (usr_nm,pass,fname,lname,contact,email,role,status) values ('taha00021','password','taha','haveliwala','888967865','tahahave','dgp','1')"
		   ,"insert into user (usr_nm,pass,fname,lname,contact,email,role,status) values ('amisha1010','ami','amisha','chauhan','888967854','tahahave','dgp','0')"
		   ,"insert into user (usr_nm,pass,fname,lname,contact,email,role,status) values ('rishika1010','rishi','rishika','dhanotiya','888967865','tahahav','dgp','1')"};
   for (String qry:query){
	 st.addBatch(qry);  
   }
   int i[]=st.executeBatch();
   if(i[0]>0){
	   System.out.println("success");
   }
   
	}
	catch(Exception e){
		System.out.println(e);
	}
}
}
