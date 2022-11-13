package NaBanking.Dao;

import java.util.List;

import NaBanking.model.Customer;
import NaBanking.model.Transactions;

public interface CustomerDao {
	public Customer CustomerLogin(String login_id,String password);
	public String transferMoney(int money,int Ac_no);
	public List<Transactions> getTransactionHistory(int Ac_no);
	
}