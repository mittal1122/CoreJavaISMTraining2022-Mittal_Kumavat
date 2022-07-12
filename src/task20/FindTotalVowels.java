package task20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//take 1 file name with entire path
//if file is present count total number of vowels from it.
//if file not present print file not present try again.

public class FindTotalVowels {

	static int count= 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Path : ");
		String path = sc.nextLine(); 
		File f = new File(path);
		

		try {
		   BufferedReader br = new BufferedReader(new FileReader(f));
			while (true) {
				if (f.exists() ==true) {
					String n = br.readLine();
					if(n == "a" || n == "e" || n == "i" || n == "o"
							|| n == "u"){
					count++;
						System.out.println("Vowels are there");
						System.out.println(n);
						System.out.println(count);
				}
				}else {
				System.out.println("file not present try again");
				}
				br.close();
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
