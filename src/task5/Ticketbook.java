//Ticket Booking System.
//
//Login
//Exit 
//
//Login => mobile number 
//
//1.1 	Book Ticket { Gold Silver Diamond -Qty } 
//1.2	View Booked Tickets
//1.3	Available Tickets 
//1.4       Logout
//
//Three Types of Ticket , Diamond - Rs.200 , Gold - Rs.150 , Silver -Rs.100 	
//One user can book max 7 Tickets.
//Total 60 tickets we have 20 Diamond , 20 Gold and 20 Silver.
//User can identified by mobile number. 

package java_ism;

import java.util.Scanner;

public class Ticketbook {
	Scanner sc = new Scanner(System.in);
	static int tticket = 60;
	static int Diamondt = 20;
	static int Goldt = 20;
	static int Silvert = 20;
	static int BDia = 0;
	static int BGold = 0;
	static int BSilver = 0;

	String mobile;

	public void BookTicket() {
		System.out.println("1 for Diamond - Rs.200 \n2 for Gold - Rs.150 \n3 for Silver -Rs.100");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			if (Diamondt > 0) {
				System.out.println(Diamondt + "Ticket are available.\n how many tickets do you want to book?");
				int qty = sc.nextInt();
				if (qty > 0 && qty <= 7) {
					Diamondt = Diamondt - qty;
					BDia = BDia + qty;
					System.out.println("Ticket Booked Successfully");
				} else {
					System.out.println("Invalid Quantity.\n please enter below 7");
					BookTicket();
				}
			} else {
				System.out.println("No Tickets Available");
			}
			break;
		case 2:
			if (Goldt > 0) {
				System.out.println(Goldt + "Ticket are available.\n how many tickets do you want to book?");
				int qty = sc.nextInt();
				if (qty > 0 && qty <= 7) {
					Goldt = Goldt - qty;
					BGold = BGold + qty;
					System.out.println("Ticket Booked Successfully");
				} else {
					System.out.println("Invalid Quantity.\n please enter below 7");
					BookTicket();

				}
			} else {
				System.out.println("No Tickets Available");
			}
			break;
		case 3:
			if (Silvert > 0) {
				System.out.println(Silvert + "Ticket are available.\n how many tickets do you want to book?");
				int qty = sc.nextInt();
				if (qty > 0 && qty <= 7) {
					Silvert = Silvert - qty;
					BSilver = BSilver + qty;
					System.out.println("Ticket Booked Successfully");
				} else {
					System.out.println("Invalid Quantity.\n please enter below 7");
					BookTicket();
				}
			} else {
				System.out.println("No Tickets Available");
			}
			break;
		default:
			System.out.println("Invalid Choice.\n Please select right option");
			BookTicket();
		}
	}

	public void ViewTickket() {
		System.out.println("Diamond - " + Diamondt + "\nGold - " + Goldt + "\nSilver - " + Silvert);
	}

	public void viewBookedTicket() {
		System.out.println("Diamond - " + BDia + "\nGold - " + BGold + "\nSilver - " + BSilver);
	}

	public void Login() {
		System.out.println("---------------------------");
		System.out.println("please enter mobile number");
		System.out.println("---------------------------");
		String arr[] = { "9888888888", "9888888889","9054307831", "9888888890" };
		mobile = sc.next();
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			if (mobile.equals(arr[i])) {
				System.out.println("Login Successful");
				System.out.println("---------------------------");
				Choice();
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("Login Failed.\n---------------------------\n  ");
			Login();
			System.out.println("");

		}
	}

	void Choice() {
		while (true) {

			System.out.println("1: book ticket");
			System.out.println("2: View Book Ticket");
			System.out.println("3: Available Ticket");
			System.out.println("4: Logout");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				BookTicket();
				break;
			case 2:
				viewBookedTicket();
				break;
			case 3:
				ViewTickket();
				break;
			case 4:
				System.out.println("Logout");
				Login();
				break;
			default:
				System.out.println("please enter vailid choice\n");
				break;
			}

		}
	}

	public static void main(String[] args) {
		Ticketbook t = new Ticketbook();
		t.Login();

	}

}