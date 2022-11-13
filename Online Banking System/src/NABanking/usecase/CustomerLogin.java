package NaBanking.usecase;
import java.util.Scanner;

import NaBanking.Dao.CustomerDao;
import NaBanking.Dao.CustomerDaoImpl;
import NaBanking.model.Customer;

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