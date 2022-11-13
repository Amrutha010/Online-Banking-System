package NaBanking.model;

public class Customer {
	private int Ac_no;
	private String Firstname;
	private String LastName;
	private String Address;
	private String City;
	private int Balance;
	private String Login_id;
	private String Password;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int ac_no, String firstname, String lastName, String address, String city, int balance,
			String login_id, String password) {
		super();
		Ac_no = ac_no;
		Firstname = firstname;
		LastName = lastName;
		Address = address;
		City = city;
		Balance = balance;
		Login_id = login_id;
		Password = password;
	}
	public int getAc_no() {
		return Ac_no;
	}
	public void setAc_no(int ac_no) {
		Ac_no = ac_no;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	public String getLogin_id() {
		return Login_id;
	}
	public void setLogin_id(String login_id) {
		Login_id = login_id;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Customer [Ac_no=" + Ac_no + ", Firstname=" + Firstname + ", LastName=" + LastName + ", Address="
				+ Address + ", City=" + City + ", Balance=" + Balance + ", Login_id=" + Login_id + ", Password="
				+ Password + "]";
	}
	
}
