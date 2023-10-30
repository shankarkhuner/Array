
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
public class Batch_Procssing {




		public static void main(String[] areg)throws SQLException {
			try {
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/maven","root","root");
	            String query =String.format("INSERT INTO FLIGHT(flightName,flightPrice) VALUES('%s','%d')");
				PreparedStatement pstmt=connection.prepareStatement(query);
				
				pstmt.setInt(1, 1000);
				
				
				int rowsAffected=pstmt.executeUpdate();
				if(rowsAffected>0)
				{
					System.out.println("Data Delete Successfully");
					
					
				}else {
					System.out.println("date Not Delete");
				}
				}catch(SQLException e){
					System.out.println(e.getMessage());
				}
			
		}
	}






