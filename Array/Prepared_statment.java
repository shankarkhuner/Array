import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prepared_statment {

	public static void main(String[] args) throws SQLException {
		try {
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/maven","root","root");
		String Query = "INSERT INTO flight_table(flightNumber,destination,flightName,flightPrice,source) value(?,?,?,?,?)";
		PreparedStatement pstmt=connection.prepareStatement(Query);
		pstmt.setInt(1, 6);
		pstmt.setString(2, "Pune");
		pstmt.setString(3, "Nanded");
		pstmt.setDouble(4, 145.264);
		pstmt.setString(5, "Parbhani");
		int rowsAffected=pstmt.executeUpdate();
		if(rowsAffected>0)
		{
			System.out.println("Deta Inserted Successfully");
			
			
		}else {
			System.out.println("date Not Inserted");
		}
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
		
		
		
		
		/*
		 * 		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			byte[] img = rs.getBytes("Company_image");
			fout.write(img);
			System.out.println("File Written Successfully");
		}
		 * 
		 * 
		 * */
		
		
		
		
	}

}