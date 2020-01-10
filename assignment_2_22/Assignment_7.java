package assignment_2_22;

import java.util.Scanner;

public class Assignment_7 {

	public static void main(String[] args) {
/*		7)Given array of integers, print the sum of elements squaring/cubing as per the power of their indices.         
			answer=  sum=sum+a[i]^i;
	     	eg:input:{2,3,5}
			Output:29
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int sum = 0;
		System.out.println("Enter "+size+" elements of an array");
		int [] intArray = new int[size];
		for(int i=0; i<size; i++)
			intArray[i] = scanner.nextInt();
		
		for(int i=0; i<size; i++)
		{
			sum += Math.pow(intArray[i], i);
		}
		System.out.println("Sum of elements of power of their indices: "+sum);
		scanner.close();
	}

}