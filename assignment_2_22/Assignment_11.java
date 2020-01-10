package assignment_2_22;

import java.util.Scanner;

public class Assignment_11 {

	public static void main(String[] args) {
/*		11) input={"1","2","3","4"}
	    	output=10
			i.e.,if string elements are no.s,add it.
	    	input={"a","b"}
	    	output=-1;
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of a string array");
		int size = scanner.nextInt();
		int flag = 0;
		double sum = 0;
		String [] stringArray = new String[size];
		System.out.println("Enter "+size+" elements of a string array");
		for(int i=0; i<size; i++)
			stringArray[i] = scanner.next();
		
		for(int i=0; i<size; i++)
		{
			if(stringArray[i].matches("^[0-9]*\\.?[0-9]+"))
				{
					sum += Double.parseDouble(stringArray[i]);
					flag++;
				}			
		}
		if(flag == size)
			System.out.println("Sum of elements of string array: "+sum);
		else
			System.out.println("String array does not contain integer elements: -1");
		
		
		scanner.close();
	}

}
