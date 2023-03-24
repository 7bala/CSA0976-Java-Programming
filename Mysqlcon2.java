import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.io.*;
import java.sql.*;  
class Mysqlcon2
{  
	public static void main(String args[]) throws IOException, SQLException
	{  
		try
		{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/saran?useSSL=false","root","1234567@Saran");  
			//here db is database name, root is username and password  
			
			Statement stmt=con.createStatement();  
			
			String sql = "create table empl(eno int not null, name varchar(20), salary double(10,2), primary key (eno))";
			
			stmt.executeUpdate(sql);  
			String query = "INSERT INTO empl (eno, name, salary) VALUES (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(query);            
			    ps.setInt(1, 103);
			    ps.setString(2, "kumar");
			    ps.setDouble(3, 70000.00);
			    ps.addBatch();
			    
			    ps.setInt(1, 106);
			    ps.setString(2, "mouli");
			    ps.setDouble(3, 60000.00);
			    ps.addBatch();
			
			
			 ps.executeBatch();

			ResultSet rs = stmt.executeQuery("select * from empl");
			System.out.printf("eno" + "\t" + "ename" + "\t\t" + "salary" );
			System.out.println();
			while(rs.next())  
			{
			System.out.printf(rs.getInt(1)+ "\t");
			System.out.printf(rs.getString(2) + "\t\t");
			System.out.println(rs.getDouble(3));
			}

			// update and delete operations
			sql = "update empl set salary= 90000 where eno =103";
			stmt.executeUpdate(sql);

			sql = "delete from empl where eno = 106";
			stmt.executeUpdate(sql);

			rs = stmt.executeQuery("select * from empl"); 
 			System.out.println();
			System.out.printf("eno" + "\t" + "ename" + "\t\t" + "salary" );
			System.out.println();
			while(rs.next())  
			{
			System.out.printf(rs.getInt(1)+ "\t");
			System.out.printf(rs.getString(2) + "\t\t");
			System.out.println(rs.getDouble(3));
			}
			con.close();
		}
		catch(Exception e){ System.out.println(e);}  
}  
}