package assignment_2_22;

import java.util.Scanner;

public class Assignment_9 {

	public static void main(String[] args) {
/*		9) int[] a={12,14,2,26,35}
		find the difference b/w max and min values in array
		output:35-2=33.
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int min, max = 0;
		int [] intArray = new int[size];
		System.out.println("Enter "+size+" elements of an array");
		for(int i=0; i<size; i++)
			intArray[i] = scanner.nextInt();
		
		for(int i=0; i<size; i++)
			{
				if(intArray[i] > max)
					max = intArray[i];
			}
		System.out.println("Mamimum element of array: "+max);
		min = intArray[0]; //OR min = max;
		for(int i=0; i<size; i++)
		{
			if(intArray[i] < min)
				min = intArray[i];
		}
		System.out.println("Minimum element of array: "+min);
		System.out.println("Difference of Maximum and Minimum elements are: "+(max-min));
				
		scanner.close();
	}

}