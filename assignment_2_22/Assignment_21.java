package assignment_2_22;

import java.util.Scanner;

public class Assignment_21 {

	public static void main(String[] args) {
/*		21) Given an array int a[]. Add the sum at even indexes.do the same with odd indexes.
			if both the sum is equal return 1 or return -1.
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Size of an Integer Array ");
		int size = scanner.nextInt();
		int intArray[] = new int[size];
		int evenSum = 0, oddSum = 0, flag = -1;
		System.out.println("Enter "+size+"Elements of an Integer Array ");
		for(int i=0; i<size; i++)
			intArray[i] = scanner.nextInt();
		for(int i=0; i<size; i++)
			{
				if(i%2 == 0)
					evenSum += intArray[i];
				else
					oddSum += intArray[i];
			}
		if(evenSum == oddSum)
		{	
			flag = 1;
			System.out.println("Even Sum and Odd Sum are equal: "+flag);
		}
		else
			System.out.println("Even Sum and Odd Sum are not equal: "+flag);
		
		scanner.close();
	}

}