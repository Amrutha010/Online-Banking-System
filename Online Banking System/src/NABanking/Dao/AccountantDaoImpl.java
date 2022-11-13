package NABanking.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import NABanking.model.Accountant;
import NABanking.model.Customer;
import NABanking.utility.DBUTIL;

public class AccountantDaoImpl implements AccountantDao{

	@Override
	public Accountant Accountant_login(String Login_id, String Password) {
		Accountant customer =null;
		try(Connection conn=DBUTIL.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("select * from accountants where login_id=? AND password=?");
			ps.setString(1, Login_id);
			ps.setString(2, Password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int r= rs.getInt("emp_id");
				String fn = rs.getString("firstname");
				String ln = rs.getString("lastname");
				String a = rs.getString("address");
				String c = rs.getString("city");
				String l = rs.getString("login_id");
				String p = rs.getString("password");
				customer = new Accountant(r, fn, ln, a, c, l, p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;

	}

	@Override
	public String addCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String editCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCustomer(int Ac_no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAccountDetailsUsingAc_no(int Ac_no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAccountDetails() {
		List<Customer> list = new ArrayList();
		return list;
	}

}
