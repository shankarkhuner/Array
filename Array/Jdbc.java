import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		try {
			System.out.println("Connection Establish");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/maven","root","root");
			Statement stmt = con.createStatement();
			String s = "select destination,flightName,flightPrice from flight_table";
			ResultSet rs=stmt.executeQuery(s);
			while(rs.next()) 
			{
				String dest=rs.getString("destination");
				String fname =rs.getString("flightName");
				double fprice = rs.getDouble("flightPrice");
				
				System.out.println(dest+" "+fname+" "+fprice);
			}
			
			
		}catch(Exception e)
		{
			
		    
		}		
	
		
		
	}
	}


