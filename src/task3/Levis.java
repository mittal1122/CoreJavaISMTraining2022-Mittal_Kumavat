package task3;

import java.util.Scanner;

public class Levis {
	String  name;
	int		 price;
	String	category;
	float	tax ;
	int		amount;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("name : ");
		name = sc.nextLine();
		System.out.println("price : ");
		price =sc.nextInt();
		
		System.out.println("category : ");
		category = sc.next();
		sc.close();
		
	}
	
	public void print() {
		System.out.println("name"+" "+"price" + " "+ "category" +" " + "tax" + "   " + "amount");
		if(category.equals("men") || category.equals("MEN") || category.equals("Men")) {
			tax = (float)(price*0.15); 
			amount = (int)(price + tax) ;
			System.out.println(name+" "+price + " "+ category +"    " + tax + " " + amount);
		}else if(category.equals("women") || category.equals("WOMEN") || category.equals("Women") ) {
			tax = (float)(price*0.10); 
			amount = (int)(price + tax) ;
			System.out.println(name+" "+price + " "+ category +"    " + tax + " " + amount);
		}else if(category.equals("student")){
			tax = (float)(price*0.5); 
			amount = (int)(price + tax) ;
			System.out.println(name+" "+price + " "+ category +"    " + tax + " " + amount);
			
		}
	}

	public static void main(String[] args) {
		Levis l = new Levis();
		l.input();
		l.print();
	}

}
