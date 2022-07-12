package java_ism;

import java.util.Arrays;
import java.util.Scanner;
		
public class SeprateNagativeArray {
	int size;
	public void input() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Array Element Size ");
		size = sc.nextInt();
		int a[] = new int[size];
		for(int i=0; i<a.length; i++) {
			System.out.print("Array Element of index [" + i+ "] ");
			a[i] = sc.nextInt();
		}
		separate(size ,a);
		
		
	}
	public void separate(int size ,int  a[]) {
	int j = 0 ,temp ;
		for(int i=0 ; i<size ; i++) {
			if(a[i] < j ) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp ; 
				
				j++;
			}
	
		}
		print(a);
		
	}
	public void print(int a[] ) {
		for(int i = 0; i< a.length ; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	
	
	public static void main(String[] args) {
		SeprateNagativeArray obj = new SeprateNagativeArray();
		obj.input();		
	}
	
        
	

	

}
