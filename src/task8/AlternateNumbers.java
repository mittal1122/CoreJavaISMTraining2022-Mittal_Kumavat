package task8;

import java.util.Scanner;
import java.util.Arrays;

public class AlternateNumbers {

	static int size;
	int array[] = null;

	public AlternateNumbers(int size) {
		array = new int[size];
	}

	public int partition(int a[]) {
		int j = 0;
		int flag = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < flag) {
				// apply swap to partition pos and neg elements on different sides
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j++;
			}
		}
		return j; // it will be at that position from where only positive elements will be present
		// j is index where first positive element is present
	}

	// method to obtain alternated positioned elements array
	public void alternate(int a[]) {
		int p = partition(a);

		// swap alternate negative elements from the next available positive
		// element till the end of the array is reached, or all negative or
		// positive elements are exhausted.

		for (int n = 0; (p < a.length && n < p); p++, n += 2) {
			int temp = a[n];
			a[n] = a[p];
			a[p] = temp;
		}
	}

	public void print(int a[]) {
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		size = sc.nextInt();

		AlternateNumbers as = new AlternateNumbers(size);

		// System.out.println("ls.a.length - "+ls.a.length);
		System.out.println("Enter elements of array: ");
		for (int i = 0; i < as.array.length; i++) {
			System.out.println("Enter A[" + i + "] : ");
			as.array[i] = sc.nextInt();
		}
		sc.close();
		System.out.printf("Original Array: ");
		as.print(as.array);
		as.alternate(as.array);
		System.out.printf("\n\nAlternate Array: ");
		as.print(as.array);

	}

}