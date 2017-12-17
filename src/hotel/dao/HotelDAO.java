package hotel.dao;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import hotel.view.MainView;
import hotel.vo.Customer;
import hotel.vo.Reservation;
import hotel.vo.Room;
import hotel.vo.Staff;

public class HotelDAO {
	
	private static Connection dbTest;
	private String username = "hotel";
    private String password = "database";
    private PreparedStatement ptmt;
    private Statement stmt;
    
    private ResultSet rs;
    
    Customer customer;
    Staff staff;
    Room room;
    Reservation reservation;
    
    
    
	
	public HotelDAO() {
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
	
//	public boolean insert(MemberVO vo) {
//		connect();
//		try {
//			String sql = "insert into Member values (?,?,?,?,?,?,member_mbno_seq.nextval)";
//			ptmt = conn.prepareStatement(sql);
//			ptmt.setString(1, vo.getId());
//			ptmt.setString(2, vo.getPwd());
//			ptmt.setString(3, vo.getNick());
//			ptmt.setString(4, vo.getTel());
//			ptmt.setString(5, vo.getSsn());
//			ptmt.setString(6, vo.getEmail());
//			ptmt.executeUpdate();
//			return true;
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			disconnect();
//		}
//		return false;
//	}// insert
	public ArrayList<Customer> selectCustomer() {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		try {
			stmt = dbTest.createStatement();
			String sql ="select * from customers";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				customerList.add(new Customer(rs.getString("cust_name"), rs.getString("cust_gender"), rs.getString("cust_address"), rs.getString("cust_tel")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return customerList;
	}
	
	
	public boolean registerCustomer(Customer customer) {
		
		try {
			String sql = "insert into Customers values (customer_seq.nextval, ?, ?, ?, ?) ";
			ptmt = dbTest.prepareStatement(sql);
			ptmt.setString(1, customer.getCust_name());
			ptmt.setString(2, customer.getCust_gender());
			ptmt.setString(3, customer.getCust_address());
			ptmt.setString(4, customer.getCust_tel());
			ptmt.executeUpdate();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return false;
		
	}
	
	public boolean registerStaff(Staff staff) {
		
		try {
			String sql = "insert into Staff values (staff_seq.nextval, ?, ?, ?, ?) ";
			ptmt = dbTest.prepareStatement(sql);
			ptmt.setString(1, staff.getStf_name());
			ptmt.setString(2, staff.getStf_gender());
			ptmt.setString(3, staff.getStf_address());
			ptmt.setString(4, staff.getStf_tel());
			ptmt.executeUpdate();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return false;
		
	}
	
	private boolean registerReservation(Reservation reservation) {
		
		try {
			String sql = "insert into reservation values (reservation_seq.nextval, ?, ?, ?, ?) ";
			ptmt = dbTest.prepareStatement(sql);
			ptmt.setString(1, customer.getCust_name());
			ptmt.setString(2, customer.getCust_gender());
			ptmt.setString(3, customer.getCust_address());
			ptmt.setString(4, customer.getCust_tel());
			ptmt.executeUpdate();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return false;
		
	}
	
	public int selectCustomer(String cust_name) {
		
		try {
			String sql = "select cust_uid from Customers where cust_name = ?";
			ptmt = dbTest.prepareStatement(sql);
			ptmt.setString(1, cust_name);
			rs = ptmt.executeQuery();
			if (rs.next()) {
				return rs.getInt("cust_uid");
			} else
				System.out.println(cust_name);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return 0;
	}
	
	//고객명 중복 검사
	public boolean checkCustDupl(String cust_name) {

		try {
			String sql = "select count(*) from customers where cust_name =?";
			ptmt = dbTest.prepareStatement(sql);
			ptmt.setString(1, cust_name);

			rs = ptmt.executeQuery();
			rs.next();
			int count = rs.getInt(1);
			if (count > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;

	}
	
	//직원명 중복 검사
	public boolean checkStfDupl(String stf_name) {

		try {
			String sql = "select count(*) from Staff where stf_name =?";
			ptmt = dbTest.prepareStatement(sql);
			ptmt.setString(1, stf_name);

			rs = ptmt.executeQuery();
			rs.next();
			int count = rs.getInt(1);
			if (count > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;

	}// overlap
	
	
//	private boolean 
	 
	private void disconnect() {
		try {
			if (ptmt != null)
				ptmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// disconnect


}
