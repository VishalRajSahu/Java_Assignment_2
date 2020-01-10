package assignment_2_22;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_17 {

	public static void main(String[] args) {
/*		17) Input array={red,green,blue,ivory}
			Sort the given array.
			Reverse the given array.
			if user input is 1 it should give Zeroth element of an reversed array.
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of String Array");
		int size = scanner.nextInt();
		String[] stringArray = new String[size];
		System.out.println("Enter "+size+" elements of String Array");
		for(int i=0; i<stringArray.length; i++)
			stringArray[i] = scanner.next();
		
		//Sorting of String Array
		Arrays.sort(stringArray);
		System.out.println("Sorted String Array: "+Arrays.toString(stringArray));
	    
		//Reverse of String Array
		int j = stringArray.length-1;
		for(int i=0; i<j; )
			{
				String temp = stringArray[i];
				stringArray[i] = stringArray[j];
				stringArray[j] = temp;
				i++;
				j--;
			}
		//Print Reverse Array
		System.out.print("Reversed String Array: ");
		for(int i=0; i<stringArray.length; i++)
			System.out.print(stringArray[i]+"  ");
		System.out.println("\nEnter an index to find element(index start from 1)");
		int index = scanner.nextInt();
		System.out.println("Reversed Array's Element of index "+index+" : "+stringArray[index-1]);
	      scanner.close();
	}

}
