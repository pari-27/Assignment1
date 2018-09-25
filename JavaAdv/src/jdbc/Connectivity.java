package jdbc;
import java.sql.*;
import java.util.Scanner;
import java.sql.DriverManager;

public class Connectivity {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
			Statement st=con.createStatement();
			
			
		//simple insert query 	
			/*String query="insert into student (id,name,sem,college)values(108,'amisha',8,'iips')";
			int r=st.executeUpdate(query);
				if(r==1){
					System.out.print("data inserted succesfully");
					
				}
				*/
				
		//insert query using prepared statement
			/*System.out.println("Enter id:");
			int id=sc.nextInt();
			System.out.println("Enter name:");
			String name=sc.next();
			System.out.println("Enter sem:");
			int sem=sc.nextInt();
			System.out.println("Enter college:");
			String college=sc.next();
			String qry="insert into student (id,name,sem,college)values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(qry);
			ps.setInt(1,id);
			ps.setString(2, name);
			ps.setInt(3, sem);
			ps.setString(4,college);
			int t=ps.executeUpdate();
			if(t==1){
				System.out.print("inserterd succesfully");
			}
			
			//simple select query
			/*String qry="select * from student";
			ResultSet rs=st.executeQuery(qry);
			while(rs.next()){
				System.out.println("Student id :"+rs.getInt(1));
				System.out.println("Student name :"+rs.getString(2));
				System.out.println("Student sem :"+rs.getInt(3));
				System.out.println("Student college :"+rs.getString(4));
				System.out.println("-------------------------------------");
			}*/
			/*

			System.out.println("enter the id to be searched");
			int id=sc.nextInt();
			String q="select * from student where id="+id;
			ResultSet r=st.executeQuery(q);	
			r.next();
			System.out.println("id:"+r.getInt(1));
			System.out.println("name:"+r.getString(2));
			System.out.println("sem:"+r.getInt(3));
			System.out.println("college:"+r.getString(4));
			*/
			System.out.println("enter id to be updated");
			int id1=sc.nextInt();
			System.out.println("enter field to be updated");
			String f=sc.next();
			System.out.println("enter value");
			String val=sc.next();
			
			
			
        String q="update student set "+f+"=? where id=?";
        PreparedStatement ps1=con.prepareStatement(q);
         //ps1.setString(1,f);
         ps1.setString(1,val);
         ps1.setInt(2,id1);
         int i=ps1.executeUpdate();
			if(i>0){
				System.out.println("updated succesfully");
			}
			
		}
		catch(Exception e){
			System.out.println(e);
			
			
		}
		
			
		
	
	}

}
