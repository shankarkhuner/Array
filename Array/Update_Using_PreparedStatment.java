import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update_Using_PreparedStatment {

	public static void main(String[] areg)throws SQLException {
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/maven","root","root");
            String query = "UPDATE flight_table SET destination = ? WHERE flightNumber = ?";
			PreparedStatement pstmt=connection.prepareStatement(query);
			pstmt.setString(1, "Pune");
			pstmt.setInt(2, 6);
			
			
			int rowsAffected=pstmt.executeUpdate();
			if(rowsAffected>0)
			{
				System.out.println("Data Update Successfully");
				
				
			}else {
				System.out.println("date Not Update");
			}
			}catch(SQLException e){
				System.out.println(e.getMessage());
			}
			
			
			
			
		
	}
}
