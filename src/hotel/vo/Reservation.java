package hotel.vo;

import java.util.Date;

public class Reservation {
	private String cust_uid;
	private String emp_uid;
	private int room_number;
	private String res_uid;
	private Date res_date;
	private int res_number;

	public Reservation(String cust_uid, String emp_uid, int room_number, String res_uid, Date res_date,
			int res_number) {
		super();
		this.cust_uid = cust_uid;
		this.emp_uid = emp_uid;
		this.room_number = room_number;
		this.res_uid = res_uid;
		this.res_date = res_date;
		this.res_number = res_number;
	}

	public String getCust_uid() {
		return cust_uid;
	}

	public void setCust_uid(String cust_uid) {
		this.cust_uid = cust_uid;
	}

	public String getEmp_uid() {
		return emp_uid;
	}

	public void setEmp_uid(String emp_uid) {
		this.emp_uid = emp_uid;
	}

	public int getRoom_number() {
		return room_number;
	}

	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}

	public String getRes_uid() {
		return res_uid;
	}

	public void setRes_uid(String res_uid) {
		this.res_uid = res_uid;
	}

	public Date getRes_date() {
		return res_date;
	}

	public void setRes_date(Date res_date) {
		this.res_date = res_date;
	}

	public int getRes_number() {
		return res_number;
	}

	public void setRes_number(int res_number) {
		this.res_number = res_number;
	}

	@Override
	public String toString() {
		return "ReservationVO [cust_uid=" + cust_uid + ", emp_uid=" + emp_uid + ", room_number=" + room_number
				+ ", res_uid=" + res_uid + ", res_date=" + res_date + ", res_number=" + res_number + "]";
	}

}
