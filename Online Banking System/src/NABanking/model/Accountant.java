package NABanking.model;

public class Accountant {
	private int Emp_id;
	private String Firstname;
	private String LastName;
	private String Address;
	private String City;
	private String Login_id;
	private String Password;
	public Accountant() {
		// TODO Auto-generated constructor stub
	}
	public Accountant(int emp_id, String firstname, String lastName, String address, String city, String login_id,
			String password) {
		super();
		Emp_id = emp_id;
		Firstname = firstname;
		LastName = lastName;
		Address = address;
		City = city;
		Login_id = login_id;
		Password = password;
	}
	public int getEmp_id() {
		return Emp_id;
	}
	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
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
		return "Accountant [Emp_id=" + Emp_id + ", Firstname=" + Firstname + ", LastName=" + LastName + ", Address="
				+ Address + ", City=" + City + ", Login_id=" + Login_id + ", Password=" + Password + "]";
	}
	
	
}
