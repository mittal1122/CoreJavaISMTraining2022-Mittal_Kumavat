//Bank App.
//
//Bank provides various service to the user  like deposit money, wid money and customer can check balance. 
//Bank have some conditions. 
//Customer have to maintain 5000 min balance. 
//Customer can perform max 5  transaction and then customer is charged 10 Rs per transaction.
//Customer can access bank app via Username/Password. 
//Customers have an account number which is generated via random algo.

// firstName
// lastName
// Email
// Password
// Balance


//Login

//Menu
//	1.1 wid
//	1.2 Dep 
//	1.3 CheckBal 
//	1.4 Logout 
//Exit 	

package task14;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApp {
	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Bank App");
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		while(true) {
		System.out.println("\n1)Signup \n2)Login \n3)Exit");
		System.out.println("\nEnter Choice");
		int c = sc.nextInt();
		User u = new User();
			switch(c) {
				case 1:
					
					System.out.println("\n-------------Insert Youre Details-----------");
					System.out.println("\nFirst Name :");
					u.setFirstName(sc.next());
					System.out.println("Last Name :");
					u.setLastName(sc.next());
					System.out.println("Email :");
					u.setEmail(sc.next());
					System.out.println("Password :");
					u.setPassword(sc.next());
					System.out.println("Enter Deposit Ammount :");
					int deposit = sc.nextInt();
					if(deposit <5000) {
						System.out.println("(Minimum Balance Required is 5000)");
					}else {
					u.setAmmount(deposit);
					u.setBalance(deposit);
					}
					int acouNum1 = (int)Math.random()*1000;
					u.setAcountNum(acouNum1);
					users.add(u);
					break;
					
				case 2:
					System.out.println("Enter Email :\nEnter Password :");
					String em = sc.next();
					String pass=sc.next();
					System.out.println(users);
					for(int i=0 ;i<users.size();i++) {
						System.out.println(users.get(i).getEmail());
						System.out.println(users.get(i).getPassword());
					if(users.get(i).getEmail().equals(em) && users.get(i).getPassword().equals(pass)) {
						System.out.println("*******You are Login Successfully*******");
					while(true) {	
						System.out.println("1)Deposit Money \n2)Withdrawal \n3)Check Balance \4)LogOut");
						System.out.println("Enter the choice :");
						int uChoice = sc.nextInt();
						
						switch(uChoice) {
						case 1:
							System.out.println("You Are In Deposit Section");
							System.out.println("Enter Deposit Ammount");
						int bal =sc.nextInt();
						    bal += users.get(i).getBalance();
						    users.get(i).setBalance(bal);
						    System.out.println(bal);
						    break;
						case 2:
							System.out.println("You Are In Withdrawal Section");
							System.out.println("Enter Withdrawal Ammount");
						int wid =sc.nextInt();
						    wid = users.get(i).getBalance() - wid;
						    if(wid <5000    ) {
						    	System.out.println("(Minimum Balance Required is 5000 !!!! )"); 
						    }else {
						    	u.setBalance(wid);
						    	System.out.println(wid);
						    }
						    break;
						case 3: 
							System.out.println("Carrunt Balance : "+users.get(i).getBalance());
							break;
						}//end iner switch
					}//end login while 
					}else {
						System.out.println("Invalid Crendentials ");
					}
					}
					break;
				
				case 3:System.exit(0);
					
					
			
			}// end switch case
		}//end while
		
	}
		
	

	
}

class User{
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private int acountNum;
	private int ammount;
	
	public int getAmmount() {
		return ammount;
	}
	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}
	public int getAcountNum() {
		return acountNum;
	}
	public void setAcountNum(int acountNum) {
		this.acountNum = acountNum;
	}
	private int balance;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String toString() {
		String Data =firstName + lastName + email + password + balance + acountNum + ammount;
		return Data;
				
	}
}



