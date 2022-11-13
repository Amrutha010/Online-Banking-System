package NABanking.usecases;

import java.util.Scanner;

import NABanking.Dao.CustomerDao;
import NABanking.Dao.CustomerDaoImpl;
import NABanking.model.Customer;

public class CustomerLogin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Login Id");
		String login_id = sc.next();
		System.out.println("Enter your Password");
		String password = sc.next();
		CustomerDao dao= new CustomerDaoImpl();
		try {
			Customer customer = dao.CustomerLogin(login_id, password);
			System.out.println("Welcome "+customer.getFirstname()+" "+customer.getLastName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
