package assignment_2_22;

import java.util.Scanner;

public class Assignment_5 {

	public static void main(String[] args) {
/*		5)      Given integer array
				input : int[] arr={2,3,5,4,1,6,7,7,9};
				Remove the duplicate elements and print sum of even numbers in the array..
				print -1 if arr contains only odd numbers
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int [] intArray = new int[size];
		int [] tempArray = new int[size];
		int k = 0, flag, sum =0;
		System.out.println("Enter the "+size+" elements of an array");
			for(int i=0; i<size; i++)
				intArray[i] = scanner.nextInt();
		
			for(int i=0; i<size; i++)
			{	flag = 0;
				for(int j =i+1; j<size; j++)
				{
					if(intArray[i] == intArray[j])
						flag = 1;
				}
			if(flag == 0)
			tempArray[k++] = intArray[i];
			}
			
		System.out.println("After removing duplicate elements");
		for(int i=0; i<k; i++)
			System.out.print(tempArray[i]+"  ");
			
		for(int i=0; i<k; i++)
		{
			if(tempArray[i] % 2 == 0)
			{
				sum += tempArray[i];
			}
		}
		
		if(sum == 0)
			System.out.println("\nEven elements are not available in array: -1");
		else
			System.out.println("\nSum of Even Elements: "+sum);
		scanner.close();	
	}

}
