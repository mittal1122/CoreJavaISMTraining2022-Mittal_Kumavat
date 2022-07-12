package task1;


import java.util.Scanner;
public class ArrayRightShift{
	
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		int [] a ={1,2,3,4,5};
		  
        System.out.println("Original aay: ");    
        for (int i = 0; i < a.length; i++) {     
            System.out.print(a[i] + " ");     
        }    
		//Scan by user
		System.out.println("Enter the no. for Shift ");
		int n = sc.nextInt();
		
		 for(int i = 0; i < n; i++){    //i=0;i<2;i++
            int j, last;    
			
            last = a[a.length-1];    //last =a[4]=5
            
            for(j = a.length-1; j > 0; j--){  //j=4;j>0;j--0
			
                a[j] = a[j-1]; //a[4]=a[3];
            }    
            
            a[0] = last;    //a[0]=5  
        }    
        
        System.out.println();    
            
         
        System.out.println("aay after right rotation: ");    
        for(int i = 0; i< a.length; i++){    
            System.out.print(a[i] + " ");    
        }    
		
	}


}