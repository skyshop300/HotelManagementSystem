package hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Hotel {
	private static Connection dbTest;
	private String username;
    private String password;
	
	public Hotel() {
		connectDB();
	}
    
	private void connectDB(){
		
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            dbTest = DriverManager.getConnection("jdbc:oracle:thin:" + "@localhost:1521:XE", username, password);
            System.out.println("데이터베이스접속 성공 - id: "+username);
        }
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("접속 실패");
        }
        catch(Exception e){
            System.out.println("Exception:"+e);
        }
        
    }
	
	public static void main(String[] args) {
		
		new Hotel();
		new GUI();
//		try {
//			
//		}catch (SQLException e){
//			e.printStackTrace();
//		}
		
	}

}
