package NABanking.usecases;

import java.util.Scanner;

import NABanking.Dao.AccountantDao;
import NABanking.Dao.AccountantDaoImpl;
import NABanking.Dao.CustomerDao;
import NABanking.Dao.CustomerDaoImpl;
import NABanking.model.Accountant;
import NABanking.model.Customer;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User type");
		System.out.println("1) Customer");
		System.out.println("2) Accountant");
		int user = sc.nextInt();
		if(user==1) {
			System.out.println("Enter your Login Id");
			String login_id = sc.next();
			System.out.println("Enter your Password");
			String password = sc.next();
			CustomerDao dao= new CustomerDaoImpl();
			Customer customer=null;
			try {
				customer = dao.CustomerLogin(login_id, password);
				System.out.println("Welcome "+customer.getFirstname()+" "+customer.getLastName());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("1) View Balance");
			System.out.println("2) Send Money");
			System.out.println("3) View Transaction history");
			System.out.println("4) Logout");
			int choice = sc.nextInt();
			if(choice==1) {
				System.out.println("----------------------------------------------------------------------------------------");
				System.out.println("Name                     Account Number                       balance                   ");
				System.out.println(customer.getFirstname()+customer.getLastName()+"                 "+customer.getAc_no()+"                             "+customer.getBalance());
				System.out.println("-----------------------------------------------------------------------------------------");
			}else if(choice==2) {
				
			}else if(choice==3) {
				
			}else {
				System.out.println("Invalid Input");
			}
			
		}if(user==2) {
			System.out.println("Enter your Login Id");
			String login_id = sc.next();
			System.out.println("Enter your Password");
			String password = sc.next();
			AccountantDao dao= new AccountantDaoImpl();
			try {
				Accountant customer = dao.Accountant_login(login_id, password);
				System.out.println("Welcome "+customer.getFirstname()+" "+customer.getLastName());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
