package hotel.vo;

public class Staff {
	private String stf_uid;
	private String stf_name;
	private String stf_gender;
	private String stf_address;
	private String stf_tel;

	public Staff(String stf_name, String stf_gender, String stf_address, String stf_tel) {
		super();
		this.stf_name = stf_name;
		this.stf_gender = stf_gender;
		this.stf_address = stf_address;
		this.stf_tel = stf_tel;
	}

	public Staff() {
		
	}

	public String getStf_uid() {
		return stf_uid;
	}

	public void setStf_uid(String stf_uid) {
		this.stf_uid = stf_uid;
	}

	public String getStf_name() {
		return stf_name;
	}

	public void setStf_name(String stf_name) {
		this.stf_name = stf_name;
	}

	public String getStf_gender() {
		return stf_gender;
	}

	public void setStf_gender(String stf_gender) {
		this.stf_gender = stf_gender;
	}

	public String getStf_address() {
		return stf_address;
	}

	public void setStf_address(String stf_address) {
		this.stf_address = stf_address;
	}

	public String getStf_tel() {
		return stf_tel;
	}

	public void setStf_tel(String stf_tel) {
		this.stf_tel = stf_tel;
	}

	@Override
	public String toString() {
		return "EmpVO [emp_uid=" + stf_uid + ", emp_name=" + stf_name + ", emp_gender=" + stf_gender + ", emp_address="
				+ stf_address + ", emp_tel=" + stf_tel + "]";
	}

}
