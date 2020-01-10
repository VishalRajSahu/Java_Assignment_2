package assignment_2_22;

import java.util.Scanner;

public class Assignment_16 {

	public static void main(String[] args) {
/*			16) Get all the numbers alone from the string and return the sum.
				Input"123gif"
				Output:6
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = scanner.next();
		int sum = 0 ;
		for(int i=0; i<string.length(); i++)
			{
				if(string.charAt(i) >= 48 && string.charAt(i) <= 57)
					{
						int num = Integer.parseInt(String.valueOf(string.charAt(i)));
						sum += num;
					}
			}
		if(sum == 0)
			System.out.println("String does not contains any digit");
		else
			System.out.println("Sum of digits in given string: "+sum);
		
		scanner.close();		
	}

}
