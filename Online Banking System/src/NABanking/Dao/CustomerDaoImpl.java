package NaBanking.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

import NaBanking.model.Customer;
import NaBanking.model.Transactions;
import NaBanking.utility.DBUTIL;

public class CustomerDaoImpl implements CustomerDao{

	@Override
	public Customer CustomerLogin(String login_id, String password) {
		Customer customer =null;
		try(Connection conn=DBUTIL.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("select * from customers where login_id=? AND password=?");
			ps.setString(1, login_id);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int r= rs.getInt("Ac_no");
				String fn = rs.getString("firstname");
				String ln = rs.getString("lastname");
				String a = rs.getString("address");
				String c = rs.getString("city");
				int b = rs.getInt("balance");
				String l = rs.getString("login_id");
				String p = rs.getString("password");
				customer = new Customer(r, fn, ln, a, c, b , l, p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;
	}

	@Override
	public String transferMoney(int money, int Ac_no) {
		try (Connection conn= DBUTIL.provideConnection()){
		PreparedStatement ps= conn.prepareStatement("update customers set balance=balance+? where ac_no=?");
			ps.setInt(1, money);
			ps.setInt(2, Ac_no);
			int x = ps.executeUpdate();
			if(x > 0) 
				return (x+" Transaction sucessfull..!");
			else
				return ("Transaction fail..");
		}catch(SQLException e ) {
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public List<Transactions> getTransactionHistory(int Ac_no) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
