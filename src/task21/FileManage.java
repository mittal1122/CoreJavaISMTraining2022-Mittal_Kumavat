//take 1 folder name with user and count how many java files present in that folder. 
//if user entered wrong directory handle that scenario with proper message.

package task21;

import java.io.File;
import java.util.Scanner;

public class FileManage {
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Path : ");
		String path = sc.nextLine();
		File f = new File(path);
		System.out.println(f.isDirectory());
		if(f.isDirectory()==true) {
			File[] Files = new File[100];
			Files = f.listFiles();
			for(File f1:Files) {
				if(f1.getName().endsWith(".java")) {
					count++;
				}
			}System.out.println("Total Number of Java files--->"+count);
		}else {System.out.println("Directory not Found");}
		
	}
}
