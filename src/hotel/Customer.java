package hotel;

public class Customer {
	private String cust_uid;
	private String cust_name;
	private String cust_gender;
	private String cust_address;
	private String cust_tel;

	public Customer(String cust_uid, String cust_name, String cust_gender, String cust_address, String cust_tel) {
		super();
		this.cust_uid = cust_uid;
		this.cust_name = cust_name;
		this.cust_gender = cust_gender;
		this.cust_address = cust_address;
		this.cust_tel = cust_tel;
	}

	public String getCust_uid() {
		return cust_uid;
	}

	public void setCust_uid(String cust_uid) {
		this.cust_uid = cust_uid;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_gender() {
		return cust_gender;
	}

	public void setCust_gender(String cust_gender) {
		this.cust_gender = cust_gender;
	}

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	public String getCust_tel() {
		return cust_tel;
	}

	public void setCust_tel(String cust_tel) {
		this.cust_tel = cust_tel;
	}

	@Override
	public String toString() {
		return "CustomerVO [cust_uid=" + cust_uid + ", cust_name=" + cust_name + ", cust_gender=" + cust_gender
				+ ", cust_address=" + cust_address + ", cust_tel=" + cust_tel + "]";
	}

}
