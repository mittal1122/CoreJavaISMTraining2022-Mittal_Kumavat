package task19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//take 10 numbers from user. now read that number and store into odd.txt if number is odd and 
//store into 	even.txt if number is even.

public class FileEvenOdd {

	public static void main(String[] args) {

		String str;
		Scanner scr = new Scanner(System.in);
		File f = new File("D:\\java training\\java_Notepad++\\JAVA_FILE\\EvenOdd.txt");
		File even = new File("D:\\java training\\java_Notepad++\\JAVA_FILE\\Even.txt");
		File odd = new File("D:\\java training\\java_Notepad++\\JAVA_FILE\\Odd.txt");
		try {
			PrintWriter f1 = new PrintWriter(f);
			PrintWriter fE = new PrintWriter(even);	
			PrintWriter fO = new PrintWriter(odd);
			
			for (int i = 1; i <= 5; i++) {
				System.out.println("enter number :");
				int num = scr.nextInt();
				
				f1.println(num);
				
			}
			f1.close();
			
			
			
			BufferedReader br = new BufferedReader(new FileReader(f));
			while (true) {
				 str = br.readLine();
				if (str == null) 
					break;
			
			System.out.println(str);
			if (Integer.parseInt(str) % 2 == 0) {
				System.out.println(str + " even");
				fE.println(str);
			} else {
				System.out.println(str + " odd");
				fO.println(str);
			}
			}
		br.close();
		fO.close();
		fE.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}


