//    Insurance Calc 
//		An insurance company follows following rules to calculate premium.
//		a. If a person’s health is excellent and the person is between 25 and 35 years of age and lives in a
//		city and is a male then the premium is Rs. 4 per thousand.
//		b. If a person satisfies all the above conditions except that the gender is female then the premium is
//		Rs. 3 per thousand.
//		c. If a person’s health is poor and the person is between 25 and 35 years of age and lives in a
//		village and is a male then the premium is Rs. 6 per thousand.
//		d. In all other cases the person is not insured.
//		Take a person's health, age, city and gender as an input and display the premium as per the rule.
//	
//		An insurance company follows following rules to calculate premium.
//		a. If a person’s health is excellent and the person is between 25 and 35 years of age and lives in a
//		city and is a male then the premium is Rs. 4 per thousand.
//		b. If a person satisfies all the above conditions except that the gender is female then the premium is
//		Rs. 3 per thousand.
//		c. If a person’s health is poor and the person is between 25 and 35 years of age and lives in a
//		village and is a male then the premium is Rs. 6 per thousand.
//		d. In all other cases the person is not insured.
//		Take a person's health, age, city and gender as an input and display the premium as per the rule.
//		   

package task11;

import java.util.Scanner;

public class Insurance {

	String health;
	int choice;
	int age;
	String city, gender; 
	float primium,ans;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Health \n1)  Excellent \n2)  Poor");
		choice =sc.nextInt();
		switch(choice) {
		case 1: health = "Excellent";
		break;
		case 2 : health = "Poor";
		break;
		default: System.out.println("Plese Enter Valid Option");
		break;
		}

		System.out.println("Enter Your Age");
		age = sc.nextInt();
		System.out.println("Enter Your Location \n1)  City \n2)  village ");
		choice =sc.nextInt();
		switch(choice) {
		case 1: city= "city";
		break;
		case 2 : city = "village";
		break;
		default: System.out.println("Plese Enter Valid Option");
		break;
		}
		System.out.println("Enter Your Gender \n1)  Male \n2)  Female ");
		choice =sc.nextInt();
		switch(choice) {
		case 1: gender= "Male";
		break;
		case 2 : gender = "Female";
		break;
		default: System.out.println("Plese Enter Valid Option");
		break;
		}
		System.out.println("Enter Amount");
		primium = sc.nextInt();
//		calculatePrimium(primium);
	}
	public void calculatePrimium() {
		if(health == "Excellent" && 25<age && age<35 && city== "city" ) {
			if(gender =="Male"){
				System.out.println("the premium is Rs. 4 per thousand");
				ans = (primium *4)/1000;
				System.out.println(ans);
			}else if(gender =="Female"){
				System.out.println("the premium is Rs. 3 per thousand.");
				ans = (primium *3)/1000;
				System.out.println(ans); 
			}
		}else if(health == "Poor" && 25<age && age<35 && city== "village" && gender=="Male") {
			System.out.println("the premium is Rs. 6 per thousand.");
			ans = (primium *6)/1000;
			System.out.println(ans);
		}
		
	}
	public static void main(String[] args) {
		Insurance in = new Insurance();
			in.input();
			in.calculatePrimium();
	}
	
	
}
