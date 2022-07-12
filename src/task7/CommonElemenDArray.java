package task7;


import java.util.Collections;
import java.util.Scanner;



public class CommonElemenDArray {
	
	Scanner sc =  new Scanner(System.in);

			
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Array1 size");
//		int m = sc.nextInt();
//		System.out.println("Enter the Array1 size");
//		int n = sc.nextInt();
//		int [][]a =new int[m][n];
//		
//		for(int i = 0; i<m ; i++) {
//			for(int j = 0; j<n ; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}		
//		System.out.println("Array Elements are :-");
//		for(int i=0 ; i<m ; i++) {
//			for(int j = 0; j <n;j++) {
//		
//				System.out.print(a[i][j]+ " ");
//			}
//			System.out.println();
		
		
	
		System.out.println("Enter the Array1 size");
		int m = sc.nextInt();
		int []a =new int[m];
		System.out.println("Enter the Array2 size");
		int n = sc.nextInt();
		int []b = new int[n];
		
		for(int i = 0; i<m ; i++) {
			System.out.print("Array1 Element of a[" + i +"] = " );
			a[i] = sc.nextInt();
		}
		for(int j = 0; j<n ; j++) {
			System.out.print("Array2 Element of b[" + j +"] = ");
			b[j] = sc.nextInt();
		}
				
		System.out.println("Array1 Elements are :-");
		for(int i=0 ; i<m ; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println(" \nArray2 Elements are :-");
		for(int j =0 ; j<n ; j++) {
			System.out.print(b[j]+ " ");
		}
		
		System.out.println(" \nCommon  Elements are :-");
		for(int i=0 ; i<a.length ; i++) {
			for(int j = 0; j<n ; j++) {
				if(a[i] == b[j]) {
					System.out.print( a[i] +" ");
				}
			}
			
		}
		
	}

}
