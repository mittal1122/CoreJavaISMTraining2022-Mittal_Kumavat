package task4;

import java.util.Scanner;

public class LeftShiftArray {

static int  top ;
	
	public static void recursive ( int a[], int x ) {
		if(x >= 1) {
		top = a[0];
		for (int i = 0; i < a.length-1; i++) {
            a[i] = a[i+1];
                }
		a[a.length-1] = top;
		recursive( a, x-1);
		
		}
            }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size =sc.nextInt();
		int a[] = new int [size];
		
		  System.out.println("Enter the elements of the array: ");
	        for (int i = 0; i < size; i++) {
	            System.out.print("\nEnter arr[" + i + "] = ");
	            a[i] = sc.nextInt();
	        }
	        
		for(int i= 0; i<a.length; i++) {
			System.out.print(a[i] +" ");
		}
		
		System.out.println();
		System.out.println("Enter the no. to Sift Array");
		int x = sc.nextInt();	
		recursive(a,x);
		for(int i= 0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
