package NABanking.Dao;

import java.util.List;

import NABanking.model.Accountant;
import NABanking.model.Customer;

public interface AccountantDao {
	public Accountant Accountant_login(String Login_id,String Password);
	public String addCustomer();
	public String editCustomer();
	public String deleteCustomer(int Ac_no);
	public String getAccountDetailsUsingAc_no(int Ac_no);
	public List<Customer> getAccountDetails();
}
